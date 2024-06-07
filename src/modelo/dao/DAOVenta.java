package modelo.dao;

import modelo.vo.Venta;
import java.util.HashMap;
import java.util.Map;

public class DAOVenta {
    private Map<String, Venta> ventas;

    public DAOVenta() {
        ventas = new HashMap<>();
    }

    public void guardarVenta(Venta venta) {
        ventas.put(venta.getCodigo(), venta);
    }

    public void actualizarVenta(Venta venta) {
        ventas.put(venta.getCodigo(), venta);
    }

    public void eliminarVenta(String codigo) {
        ventas.remove(codigo);
    }

    public Venta buscarVenta(String codigo) {
        return ventas.get(codigo);
    }
}
