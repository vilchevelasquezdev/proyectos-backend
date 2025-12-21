package proyectos.backend.inventory.domain.repository.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import proyectos.backend.inventory.domain.model.Category;
import proyectos.backend.inventory.domain.repository.dao.ICategoryDao;
import proyectos.backend.inventory.domain.repository.interfac.ICategoryInterface;
import proyectos.backend.inventory.domain.response.CategoryResponseRest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryService implements ICategoryInterface {

    @Autowired
    private ICategoryDao categoryDao;

    @Override
    @Transactional(readOnly = true)
    public ResponseEntity<CategoryResponseRest> getCategoryById(Long id) {
        CategoryResponseRest responseRest = new CategoryResponseRest();
        try {
            Optional<Category> categoryOptional = categoryDao.findById(id);
            List<Category> categoryList = new ArrayList<>();
            if (categoryOptional.isPresent()) {
                categoryList = categoryOptional.stream().toList();
            }
            responseRest.getCategoryResponse().setCategories(categoryList);
            responseRest.setMetaData("Respuesta Exitosa: true", "00","");
        }catch (Exception ex){
            responseRest.setMetaData("Respuesta Exitosa: false", "01","Error al consultar los datos");
            return ResponseEntity.internalServerError().body(responseRest);
        }

        return ResponseEntity.ok(responseRest);
    }

    @Override
    public ResponseEntity<CategoryResponseRest> getCategoryAll() {
        return null;
    }
}
