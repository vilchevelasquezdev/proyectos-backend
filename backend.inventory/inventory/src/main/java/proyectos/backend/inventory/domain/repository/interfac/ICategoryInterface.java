package proyectos.backend.inventory.domain.repository.interfac;

import org.springframework.http.ResponseEntity;
import proyectos.backend.inventory.domain.response.CategoryResponseRest;

public interface ICategoryInterface {
    ResponseEntity<CategoryResponseRest> getCategoryById(Long id);
    ResponseEntity<CategoryResponseRest> getCategoryAll();

}
