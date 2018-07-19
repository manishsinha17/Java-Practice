package ds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Configuration
@SpringBootApplication
@EnableJpaRepositories
@EnableCaching
@ComponentScan({"ds.test.*"})
public class SBApp {
	
	public static void main(String[] args) throws Exception {

		SpringApplication.run(SBApp.class, args);
		
	}
}
