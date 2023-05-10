package com.example.Ejercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class Ejercicio3Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Ejercicio3Application.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);

		// agregar un nuevo usuario
		//User user1 = new User(null, "Armando", "armando@gmail.com");
		//userRepository.save(user1);

		// ver todos los usuarios
		UserService userService = context.getBean(UserService.class);
		List<User> userList = userService.getAllUsers();
		for (User user : userList) {
			System.out.println(user.getName() + " - " + user.getEmail());
		}



		SpringApplication.exit(context);
	}

}
