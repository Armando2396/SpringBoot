package com.example.obsprindatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSprindatajpaApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ObSprindatajpaApplication.class, args);

		CocheRepository repository = context.getBean(CocheRepository.class);

		//crear y almacenar un coche en base de datos

		Coche toyota = new Coche(null,"Toyota", "Prius", 2010);
		repository.save(toyota);
	}


}
