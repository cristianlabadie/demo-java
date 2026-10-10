package com.demo.poo.interfaces;

public class SmsNotificador implements Notificador {

    @Override
    public void enviar(String mensaje) {
        System.out.println("[SMS] " + mensaje);
    }
}
