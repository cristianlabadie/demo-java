package com.demo.proyecto.service;

import com.demo.proyecto.model.Producto;
import com.demo.proyecto.repository.ProductoRepository;
import com.demo.proyecto.util.Formato;

/**
 * SERVICE: contiene las REGLAS DE NEGOCIO (validaciones, cálculos, decisiones).
 * No sabe cómo se guardan los datos: se lo pide al repository.
 */
public class ProductoService {

    private final ProductoRepository repository;

    public ProductoService(ProductoRepository repository) {
        this.repository = repository;
    }

    public void crearProducto(int id, String nombre, double precio, int stock) {
        if (precio <= 0) {
            System.out.println("Error: el precio debe ser mayor a 0 (" + nombre + ")");
            return;
        }
        repository.guardar(new Producto(id, nombre, precio, stock));
        System.out.println("Producto creado: " + nombre);
    }

    public void vender(int id, int cantidad) {
        var encontrado = repository.buscarPorId(id);
        if (encontrado.isEmpty()) {
            System.out.println("Error: no existe el producto " + id);
            return;
        }
        Producto producto = encontrado.get();
        if (producto.getStock() < cantidad) {
            System.out.println("Error: stock insuficiente de " + producto.getNombre());
            return;
        }
        producto.setStock(producto.getStock() - cantidad);
        double total = producto.getPrecio() * cantidad;
        System.out.println("Vendidos " + cantidad + " x " + producto.getNombre()
                + " = " + Formato.dinero(total));
    }

    public void listarProductos() {
        System.out.println("Inventario:");
        for (Producto p : repository.buscarTodos()) {
            System.out.println("  #" + p.getId() + " " + p.getNombre()
                    + " | " + Formato.dinero(p.getPrecio())
                    + " | stock: " + p.getStock());
        }
    }
}
