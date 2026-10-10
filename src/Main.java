import com.demo.fundamentos.Bucles;
import com.demo.fundamentos.Condicionales;
import com.demo.fundamentos.Metodos;
import com.demo.fundamentos.Variables;
import com.demo.poo.abstraccion.DemoAbstraccion;
import com.demo.poo.clases.DemoClases;
import com.demo.poo.encapsulamiento.DemoEncapsulamiento;
import com.demo.poo.herencia.DemoHerencia;
import com.demo.poo.interfaces.DemoInterfaces;
import com.demo.proyecto.TiendaApp;

import java.util.Scanner;

/**
 * Punto de entrada del programa.
 * Muestra un menú para ejecutar cada tema de la clase por separado.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("""

                    ===== CLASE: BASES DE JAVA =====
                    -- Fundamentos --
                     1. Variables y tipos de datos
                     2. Condicionales (if / switch)
                     3. Bucles (for / while)
                     4. Métodos
                    -- Programación Orientada a Objetos --
                     5. Clases y objetos
                     6. Encapsulamiento
                     7. Herencia y polimorfismo
                     8. Abstracción (clases abstractas)
                     9. Interfaces
                    -- Proyecto por capas --
                    10. Mini tienda (model / repository / service)
                     0. Salir
                    """);
            System.out.print("Elige una opción: ");
            opcion = scanner.hasNextInt() ? scanner.nextInt() : 0;

            switch (opcion) {
                case 1 -> Variables.ejecutar();
                case 2 -> Condicionales.ejecutar();
                case 3 -> Bucles.ejecutar();
                case 4 -> Metodos.ejecutar();
                case 5 -> DemoClases.ejecutar();
                case 6 -> DemoEncapsulamiento.ejecutar();
                case 7 -> DemoHerencia.ejecutar();
                case 8 -> DemoAbstraccion.ejecutar();
                case 9 -> DemoInterfaces.ejecutar();
                case 10 -> TiendaApp.ejecutar();
                case 0 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción no válida");
            }
        } while (opcion != 0);
    }
}
