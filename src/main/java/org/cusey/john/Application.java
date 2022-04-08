package org.cusey.john;

import org.cusey.john.dto.CustomerRequest;
import org.cusey.john.dto.Header;
import org.cusey.john.dto.StoreResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "org.cusey.john.*")
public class Application {
	
	
	@Bean 
	public Header getHeader() {
		return new Header();
	}
	
	@Bean 
	public CustomerRequest getCustomerRequest() {
		return new CustomerRequest();
	}
	
	@Bean 
	public StoreResponse getStoreResponse() {
		return new StoreResponse();
	}


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

}
