package com.demo.poo.herencia;

// extends = "hereda de"
public class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre); // llama al constructor del padre
    }

    // @Override = "reescribo" el comportamiento del padre
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau!");
    }

    // Método propio, solo lo tienen los perros
    public void traerPelota() {
        System.out.println(nombre + " trae la pelota");
    }
}
