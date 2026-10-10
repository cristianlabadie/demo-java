package com.demo.poo.abstraccion;

import java.util.List;

public class DemoAbstraccion {

    public static void ejecutar() {
        System.out.println("\n--- ABSTRACCIÓN ---");

        // Figura f = new Figura("x"); // NO compila: es abstracta
        List<Figura> figuras = List.of(new Circulo(2), new Rectangulo(3, 4));

        // No nos importa CÓMO calcula cada una, solo que sabe hacerlo
        for (Figura figura : figuras) {
            figura.mostrarInfo();
        }
    }
}
