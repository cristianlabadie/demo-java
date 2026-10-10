package com.demo.fundamentos;

import java.util.List;

/**
 * Los bucles REPITEN código sin tener que escribirlo varias veces.
 */
public class Bucles {

    public static void ejecutar() {
        System.out.println("\n--- BUCLES ---");

        // for: cuando sabemos cuántas veces repetir
        System.out.println("Contando del 1 al 5 con for:");
        for (int i = 1; i <= 5; i += 2) {
            System.out.println("  i = " + i);
        }

        // while: repite MIENTRAS la condición sea verdadera
        System.out.println("Cuenta atrás con while:");
        int contador = 3;
        while (contador > 0) {
            System.out.println("  " + contador + "...");
            contador--;
        }
        System.out.println("  ¡Despegue!");

        // for-each: recorrer cada elemento de una lista
        List<String> frutas = List.of("Manzana", "Pera", "Plátano", "Kiwi");
        System.out.println("Frutas con for-each:");
        for (String fruta : frutas) {
            System.out.println("  - " + fruta);
        }
    }
}
