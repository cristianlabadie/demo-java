package com.demo.proyecto.util;

/**
 * UTIL: funciones de ayuda reutilizables, sin lógica de negocio.
 */
public class Formato {

    public static String dinero(double cantidad) {
        return String.format("%.2f €", cantidad);
    }
}
