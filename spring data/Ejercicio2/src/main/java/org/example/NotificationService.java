package org.example;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    public void imprimirSaludo(){
        System.out.println("Hola, Bienvenido a la app");
    }
}
