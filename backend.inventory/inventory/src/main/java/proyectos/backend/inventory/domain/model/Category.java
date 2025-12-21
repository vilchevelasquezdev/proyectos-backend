package proyectos.backend.inventory.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name="category")
@Data
public class Category implements Serializable {

    @Serial
    private static final long serialVersionUID = -6119217239007545381L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

}
