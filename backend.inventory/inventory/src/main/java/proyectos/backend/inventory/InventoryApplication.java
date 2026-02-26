package proyectos.backend.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "proyectos.backend.inventory")
@EnableJpaRepositories(basePackages = "proyectos.backend.inventory.dao")
public class InventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryApplication.class, args);
	}

}
