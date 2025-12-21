package proyectos.backend.inventory.domain.repository.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import proyectos.backend.inventory.domain.model.Category;
@Repository
public interface ICategoryDao extends CrudRepository<Category, Long> {

}

