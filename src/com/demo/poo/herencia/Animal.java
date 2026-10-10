package com.demo.poo.herencia;

/**
 * HERENCIA = una clase hija reutiliza lo de la clase padre ("es un").
 * Un Perro ES UN Animal. Un Gato ES UN Animal.
 */
public class Animal {

    // protected: visible para las clases hijas
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo");
    }

    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido genérico");
    }
}
