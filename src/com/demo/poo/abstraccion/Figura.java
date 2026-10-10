package com.demo.poo.abstraccion;

/**
 * ABSTRACCIÓN = quedarse con lo esencial y ocultar los detalles.
 * Toda figura tiene un área, pero "una figura" en general no se puede dibujar:
 * por eso la clase es abstract (no se puede hacer new Figura()).
 */
public abstract class Figura {

    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto: obliga a cada hija a dar su propia fórmula
    public abstract double calcularArea();

    // Método normal: compartido por todas
    public void mostrarInfo() {
        System.out.printf("%s -> área: %.2f%n", nombre, calcularArea());
    }
}
