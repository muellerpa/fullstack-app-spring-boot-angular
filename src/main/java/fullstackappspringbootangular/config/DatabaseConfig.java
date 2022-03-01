package fullstackappspringbootangular.config;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableJpaRepositories("fullstackappspringbootangular.repository")
@EnableTransactionManagement
public class DatabaseConfig {
}
