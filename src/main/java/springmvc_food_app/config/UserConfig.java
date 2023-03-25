package springmvc_food_app.config;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "springmvc_food_app")
public class UserConfig {

	@Bean
	@Scope(value = "prototype")
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("food").createEntityManager();
	}

}
