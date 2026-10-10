package com.demo.poo.encapsulamiento;

public class DemoEncapsulamiento {

    public static void ejecutar() {
        System.out.println("\n--- ENCAPSULAMIENTO ---");

        CuentaBancaria cuenta = new CuentaBancaria("Ana", 100);

        cuenta.depositar(50);
        cuenta.retirar(500); // la clase se protege sola
        cuenta.depositar(-20);

        // cuenta.saldo = 1_000_000; // NO compila: saldo es private
        System.out.println("Saldo final de " + cuenta.getTitular() + ": " + cuenta.getSaldo());
    }
}
