package com.demo.proyecto;

import com.demo.proyecto.repository.ProductoRepository;
import com.demo.proyecto.service.ProductoService;

/**
 * Arma las piezas y las pone a trabajar juntas.
 * Flujo: TiendaApp -> Service (reglas) -> Repository (datos) -> Model
 */
public class TiendaApp {

    public static void ejecutar() {
        System.out.println("\n--- MINI TIENDA (proyecto por capas) ---");

        ProductoRepository repository = new ProductoRepository();
        ProductoService service = new ProductoService(repository);

        service.crearProducto(1, "Teclado", 25.50, 10);
        service.crearProducto(2, "Ratón", 12.00, 5);
        service.crearProducto(3, "Monitor", -100, 2); // falla la validación

        service.listarProductos();
        service.vender(1, 3);
        service.vender(2, 10); // sin stock suficiente
        service.vender(99, 1); // no existe
        service.listarProductos();
    }
}
