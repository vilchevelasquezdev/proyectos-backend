package proyectos.backend.inventory.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import proyectos.backend.inventory.model.Category;

@Repository
public interface ICategoryDao extends CrudRepository<Category, Long>{

}
