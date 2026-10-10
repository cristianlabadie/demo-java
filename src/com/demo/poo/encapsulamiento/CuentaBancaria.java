package com.demo.poo.encapsulamiento;

/**
 * ENCAPSULAMIENTO = proteger los datos internos.
 * Analogía: un cajero automático. No puedes meter la mano y tocar el dinero,
 * solo usar los botones (métodos públicos) que validan lo que haces.
 */
public class CuentaBancaria {

    // private: nadie de fuera puede tocar estos datos directamente
    private final String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Getter: permite LEER el dato de forma controlada
    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    // En vez de un setter libre, métodos con reglas de negocio
    public void depositar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: la cantidad debe ser positiva");
            return;
        }
        saldo += cantidad;
        System.out.println("Depositado: " + cantidad + " | Saldo: " + saldo);
    }

    public void retirar(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("Error: saldo insuficiente (saldo: " + saldo + ")");
            return;
        }
        saldo -= cantidad;
        System.out.println("Retirado: " + cantidad + " | Saldo: " + saldo);
    }
}
