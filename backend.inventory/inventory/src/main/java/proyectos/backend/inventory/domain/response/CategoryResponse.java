package proyectos.backend.inventory.domain.response;

import lombok.Data;
import proyectos.backend.inventory.domain.model.Category;

import java.util.List;
@Data
public class CategoryResponse {
   private List<Category> categories;

}
