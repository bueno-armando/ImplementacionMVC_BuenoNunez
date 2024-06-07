package modelo;

import modelo.dao.DAOVenta;
import modelo.vo.Venta;

public class LogicaVentas {
    private DAOVenta daoVenta;

    public LogicaVentas() {
        daoVenta = new DAOVenta();
    }

    public void agregarVenta(String codigo, String nombre, String cantidad) {
        Venta venta = new Venta(codigo, nombre, cantidad);
        daoVenta.guardarVenta(venta);
    }

    public void modificarVenta(String codigo, String nombre, String cantidad) {
        Venta venta = new Venta(codigo, nombre, cantidad);
        daoVenta.actualizarVenta(venta);
    }

    public void eliminarVenta(String codigo) {
        daoVenta.eliminarVenta(codigo);
    }

    public boolean existeVenta(String codigo) {
        Venta venta = daoVenta.buscarVenta(codigo);
        return venta != null;
    }
}
