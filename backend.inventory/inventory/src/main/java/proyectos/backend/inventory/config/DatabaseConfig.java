package proyectos.backend.inventory.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;

@Configuration
public class DatabaseConfig {

    private static final Logger logger = LoggerFactory.getLogger(DatabaseConfig.class);
    private final DataSource dataSource;

    public DatabaseConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * Verifica la conexión a la base de datos al iniciar la aplicación
     */
    @Bean
    public CommandLineRunner verificarConexion() {
        return args -> {
            try (Connection connection = dataSource.getConnection()) {
                DatabaseMetaData metaData = connection.getMetaData();
                logger.info("==========================================");
                logger.info("✓ Conexión a la base de datos exitosa!");
                logger.info("  Base de datos: {}", metaData.getDatabaseProductName());
                logger.info("  Versión: {}", metaData.getDatabaseProductVersion());
                logger.info("  URL: {}", metaData.getURL());
                logger.info("  Usuario: {}", metaData.getUserName());
                logger.info("==========================================");
            } catch (Exception e) {
                logger.error("✗ Error al conectar con la base de datos. Verifique que:");
                logger.error("  1. MySQL esté ejecutándose");
                logger.error("  2. La base de datos 'db_inventory' exista");
                logger.error("  3. Las credenciales en application.properties sean correctas");
                logger.error("  Error: {}", e.getMessage(), e);
                throw new RuntimeException("No se pudo establecer conexión con la base de datos", e);
            }
        };
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource);
    }
}

