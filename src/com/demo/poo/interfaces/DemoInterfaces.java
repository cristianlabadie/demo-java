package com.demo.poo.interfaces;

public class DemoInterfaces {

    public static void ejecutar() {
        System.out.println("\n--- INTERFACES ---");

        // Este método no sabe (ni le importa) si es email o SMS
        avisarPedidoListo(new EmailNotificador());
        avisarPedidoListo(new SmsNotificador());
    }

    static void avisarPedidoListo(Notificador notificador) {
        notificador.enviar("Tu pedido está listo");
    }
}
