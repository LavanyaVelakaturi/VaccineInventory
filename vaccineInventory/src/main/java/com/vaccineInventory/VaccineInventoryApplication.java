package com.vaccineInventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
@EntityScan("com.vaccineInventory.entity")
public class VaccineInventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaccineInventoryApplication.class, args);
		
	}

}
