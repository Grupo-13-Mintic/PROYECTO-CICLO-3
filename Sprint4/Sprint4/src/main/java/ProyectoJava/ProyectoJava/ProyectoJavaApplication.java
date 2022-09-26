package ProyectoJava.ProyectoJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EnableJpaAuditing
public class ProyectoJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoJavaApplication.class, args);
	}

}
