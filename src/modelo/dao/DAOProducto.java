package modelo.dao;

import modelo.vo.Producto;

import java.util.ArrayList;
import java.util.List;

public class DAOProducto {
    private List<Producto> productos;

    public DAOProducto() {
        productos = new ArrayList<>();
    }

    public void guardarProducto(Producto producto) {
        productos.add(producto);
    }

    public List<Producto> obtenerProductos() {
        return productos;
    }
}
