package modelo.dao;

import modelo.vo.Factura;
import java.util.HashMap;
import java.util.Map;

public class DAOFactura {
    private Map<String, Factura> facturas;

    public DAOFactura() {
        facturas = new HashMap<>();
    }

    public void guardarFactura(Factura factura) {
        facturas.put(factura.getNumeroFactura(), factura);
    }

    public void actualizarFactura(Factura factura) {
        facturas.put(factura.getNumeroFactura(), factura);
    }

    public void eliminarFactura(String numeroFactura) {
        facturas.remove(numeroFactura);
    }

    public Factura buscarFactura(String numeroFactura) {
        return facturas.get(numeroFactura);
    }
}
