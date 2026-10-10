package com.demo.proyecto.repository;

import com.demo.proyecto.model.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * REPOSITORY: se encarga de GUARDAR y BUSCAR datos.
 * Aquí usamos una lista en memoria; en un proyecto real sería una base de datos.
 * Si mañana cambiamos a MySQL, solo cambia esta capa.
 */
public class ProductoRepository {

    private final List<Producto> productos = new ArrayList<>();

    public void guardar(Producto producto) {
        productos.add(producto);
    }

    public List<Producto> buscarTodos() {
        return productos;
    }

    public Optional<Producto> buscarPorId(int id) {
        return productos.stream()
                .filter(p -> p.getId() == id)
                .findFirst();
    }
}
