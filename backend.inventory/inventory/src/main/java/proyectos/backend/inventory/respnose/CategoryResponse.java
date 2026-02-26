package proyectos.backend.inventory.respnose;


import lombok.Data;
import proyectos.backend.inventory.model.Category;

import java.util.List;

@Data
public class CategoryResponse {
	
	private List<Category> category;

}
