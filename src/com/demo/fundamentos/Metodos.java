package com.demo.fundamentos;

/**
 * Un método es una "receta": un bloque de código con nombre que
 * recibe ingredientes (parámetros) y puede devolver un resultado (return).
 */
public class Metodos {

    public static void ejecutar() {
        System.out.println("\n--- MÉTODOS ---");

        saludar("Ana");
        saludar("Luis");

        int resultado = sumar(4, 6);
        System.out.println("4 + 6 = " + resultado);

        System.out.println("¿7 es par? " + esPar(7));
    }

    // void = no devuelve nada, solo hace algo
    static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }

    // int = devuelve un número entero
    static int sumar(int a, int b) {
        return a + b;
    }

    // boolean = devuelve verdadero o falso
    static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
