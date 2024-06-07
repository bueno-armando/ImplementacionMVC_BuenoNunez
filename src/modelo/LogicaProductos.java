package modelo;

import modelo.dao.DAOProducto;
import modelo.vo.Producto;

public class LogicaProductos {
    private DAOProducto daoProducto;

    public LogicaProductos() {
        daoProducto = new DAOProducto();
    }

    public void agregarProducto(String nombre, double precio) {
        Producto producto = new Producto(nombre, precio);
        daoProducto.guardarProducto(producto);
    }
}
