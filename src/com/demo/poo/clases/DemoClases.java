package com.demo.poo.clases;

public class DemoClases {

    public static void ejecutar() {
        System.out.println("\n--- CLASES Y OBJETOS ---");

        // Un molde (Persona), dos objetos distintos e independientes
        Persona ana = new Persona("Ana", 30);
        Persona luis = new Persona("Luis", 22);

        ana.presentarse();
        luis.presentarse();

        ana.cumplirAnios(); // solo cambia Ana, Luis no se entera
        luis.presentarse();
    }
}
