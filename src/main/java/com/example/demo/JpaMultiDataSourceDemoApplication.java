package com.example.demo;

import com.example.demo.model.primary.Customer;
import com.example.demo.model.secondary.Address;
import com.example.demo.repository.primary.CustomerRepository;
import com.example.demo.repository.secondary.AddressRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaMultiDataSourceDemoApplication {

	private static final Logger log = LoggerFactory.getLogger(JpaMultiDataSourceDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JpaMultiDataSourceDemoApplication.class, args);
	}


	@Bean
	public CommandLineRunner customer(CustomerRepository repository) {
		return (args) -> {
			repository.save(new Customer("Dev", "Mahendran"));
			repository.save(new Customer("Braju", "Mahendran"));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Customer customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");
		};
	}

	@Bean
	public CommandLineRunner address(AddressRepository repository) {
		return (args) -> {
			repository.save(new Address("6 Balaji Nagar", "Coimbatore"));
			repository.save(new Address("Breeze Homes", "Hosur"));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Address address : repository.findAll()) {
				log.info(address.toString());
			}
			log.info("");
		};
	}
}
