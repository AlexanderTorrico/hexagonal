package com.example.hexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration.class})
public class HexagonalApplication {

	public static void main(String [] args) {
		SpringApplication.run(HexagonalApplication.class, args);
	}

}
