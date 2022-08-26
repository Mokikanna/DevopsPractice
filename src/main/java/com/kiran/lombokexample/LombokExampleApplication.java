package com.kiran.lombokexample;

import com.kiran.lombokexample.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j
@SpringBootApplication
public class LombokExampleApplication {


	public static void main(String[] args) {
		SpringApplication.run(LombokExampleApplication.class, args);
		Customer  customer=new Customer();
		customer.setId(44L);
		customer.setFirstName("Raj");
		customer.setLastName("kumar");
		customer.setEmail("raj@gmail.com");
		log.info("Customer ;{}",customer);

		Customer  customer1=Customer.builder()
				.id(45L)
				.firstName("Kiran")
				.lastName("Kumar")
				.email("Kiran@gmail.com").build();
		log.info("Customer ;{}",customer1);


	}

}
