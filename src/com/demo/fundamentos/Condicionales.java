package com.demo.fundamentos;

/**
 * Los condicionales permiten que el programa TOME DECISIONES.
 * "Si pasa esto, haz aquello; si no, haz otra cosa".
 */
public class Condicionales {

    public static void ejecutar() {
        System.out.println("\n--- CONDICIONALES ---");

        int nota = 7;

        // if / else if / else
        if (nota >= 9) {
            System.out.println("Sobresaliente");
        } else if (nota >= 5) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }

        // Operadores lógicos: && (y), || (o), ! (no)
        int edad = 15;
        boolean tieneEntrada = true;
        boolean entradaSimple = false;
        boolean entradaSupremaVIP = true;
        if ((edad >= 18 && tieneEntrada && !entradaSimple) || entradaSupremaVIP) {
            System.out.println("Puede entrar al concierto");
        }

        // switch: útil cuando comparamos un valor contra varias opciones
        String dia = "Lunes";
        String tipoDia = switch (dia) {
            case "SABADO", "DOMINGO" -> "Fin de semana";
            default -> "Día laboral";
        };
        System.out.println(dia + " es " + tipoDia);
    }
}
