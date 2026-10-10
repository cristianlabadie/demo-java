package com.demo.poo.herencia;

import java.util.List;

public class DemoHerencia {

    public static void ejecutar() {
        System.out.println("\n--- HERENCIA ---");

        Perro firulais = new Perro("Firulais");
        firulais.comer();        // heredado de Animal
        firulais.hacerSonido();  // sobrescrito en Perro
        firulais.traerPelota();  // propio de Perro

        System.out.println("\n--- POLIMORFISMO ---");
        // POLIMORFISMO = "muchas formas": misma orden, cada uno responde a su manera.
        // La lista es de Animal, pero cada objeto sabe qué sonido hacer.
        List<Animal> animales = List.of(
                new Perro("Rex"),
                new Gato("Michi"),
                new Animal("Bicho")
        );
        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}
