package org.cusey.john;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.cusey.john.*")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

}
