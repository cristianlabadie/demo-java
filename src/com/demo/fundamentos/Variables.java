package com.demo.fundamentos;

/**
 * Una variable es una "caja con nombre" donde guardamos un dato.
 * Cada caja tiene un TIPO que dice qué puede guardar.
 */
public class Variables {

    public static void ejecutar() {
        System.out.println("\n--- VARIABLES Y TIPOS ---");

        // Tipos primitivos (los más básicos)
        int edad = 25;               // números enteros
        double precio = 19.99;       // números con decimales
        boolean esEstudiante = true; // verdadero o falso
        char inicial = 'C';          // un solo carácter (comillas simples)

        // String no es primitivo, es un objeto, pero se usa igual de fácil
        String nombre = "Cristian";  // texto (comillas dobles)

        // var: Java deduce el tipo solo (útil, pero el tipo sigue existiendo)
        var region = "";
        region = "Metropolitana";
        // final: constante, no se puede cambiar después
        final double IVA = 0.21;

        region += " de Santiago";
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Precio: " + precio);
        System.out.println("¿Estudiante?: " + esEstudiante);
        System.out.println("Inicial: " + inicial);
        System.out.println("Región: " + region);
        System.out.println("Precio con IVA: " + (precio + precio * IVA));

        // Las variables pueden cambiar de valor (por eso se llaman "variables")
        edad = edad + 1;
        System.out.println("Edad el próximo año: " + edad);
    }
}
