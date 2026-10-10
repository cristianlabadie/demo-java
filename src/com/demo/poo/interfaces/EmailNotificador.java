package com.demo.poo.interfaces;

// implements = "cumplo el contrato"
public class EmailNotificador implements Notificador {

    @Override
    public void enviar(String mensaje) {
        System.out.println("[EMAIL] " + mensaje);
    }
}
