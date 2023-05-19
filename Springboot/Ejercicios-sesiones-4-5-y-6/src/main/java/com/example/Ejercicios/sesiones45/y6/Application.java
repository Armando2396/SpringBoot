package com.example.Ejercicios.sesiones45.y6;

import com.example.Ejercicios.sesiones45.y6.entities.Laptop;
import com.example.Ejercicios.sesiones45.y6.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		LaptopRepository laptopRepository =context.getBean(LaptopRepository.class);

		//CRUD
		//Crear lista de laptop

		Laptop laptop1 = new Laptop("acer", "aspire", 500.00 );
		Laptop laptop2 = new Laptop("HP", "HP Laptop", 650.00);

		//Almacenar los datos de la laptop

		System.out.println("Num de laptop en la base de datos "+ laptopRepository.findAll().size());

		laptopRepository.save(laptop1);
		laptopRepository.save(laptop2);

		System.out.println("Num de laptop en la base de datos "+ laptopRepository.findAll().size());

	}

}
