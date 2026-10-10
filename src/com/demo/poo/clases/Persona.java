package com.demo.poo.clases;

/**
 * CLASE = el molde / plano (ej: el plano de una casa).
 * OBJETO = cada cosa real creada con ese molde (cada casa construida).
 */
public class Persona {

    // Atributos: lo que la persona TIENE (sus datos)
    String nombre;
    int edad;

    // Constructor: se ejecuta al crear el objeto con "new"
    public Persona(String nombre, int edad) {
        this.nombre = nombre; // this = "este objeto"
        this.edad = edad;
    }

    // Métodos: lo que la persona HACE (su comportamiento)
    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }

    public void cumplirAnios() {
        edad++;
        System.out.println(nombre + " cumplió años. Ahora tiene " + edad);
    }
}
