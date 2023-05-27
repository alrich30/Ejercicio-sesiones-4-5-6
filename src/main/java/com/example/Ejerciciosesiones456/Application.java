package com.example.Ejerciciosesiones456;

import com.example.Ejerciciosesiones456.entities.Laptops;
import com.example.Ejerciciosesiones456.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptops laptop1 = new Laptops(null, "Corsair vengeance RGB",
				"Seagate Barracuda 2TB HDD", "NVIDIA GeFORCE RTX3080");
		Laptops laptop2 = new Laptops(null, "Kingston HyperX Fury 16GB DDR4 3200MHz",
				"Samsung 970 EVO Plus 1TB SSD","AMD Radeon RX 6800 XT");

		repository.save(laptop1);
		repository.save(laptop2);
	}

}
