package proyectos.backend.inventory.services;


import org.springframework.http.ResponseEntity;
import proyectos.backend.inventory.model.Category;
import proyectos.backend.inventory.respnose.CategoryResponseRest;

public interface ICategoryService {
	
	public ResponseEntity<CategoryResponseRest> search();
	public ResponseEntity<CategoryResponseRest> searchById(Long id);
	public ResponseEntity<CategoryResponseRest> save(Category category);
	public ResponseEntity<CategoryResponseRest> update(Category category, Long id);
	public ResponseEntity<CategoryResponseRest> deleteById(Long id);

}
