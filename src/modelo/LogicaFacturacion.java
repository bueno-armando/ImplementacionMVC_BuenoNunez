package modelo;

import modelo.dao.DAOFactura;
import modelo.vo.Factura;

public class LogicaFacturacion {
    private DAOFactura daoFactura;

    public LogicaFacturacion() {
        daoFactura = new DAOFactura();
    }

    public void agregarFactura(String numeroFactura, String cliente, String total) {
        Factura factura = new Factura(numeroFactura, cliente, total);
        daoFactura.guardarFactura(factura);
    }

    public void modificarFactura(String numeroFactura, String cliente, String total) {
        Factura factura = new Factura(numeroFactura, cliente, total);
        daoFactura.actualizarFactura(factura);
    }

    public void eliminarFactura(String numeroFactura) {
        daoFactura.eliminarFactura(numeroFactura);
    }

    public boolean existeFactura(String numeroFactura) {
        Factura factura = daoFactura.buscarFactura(numeroFactura);
        return factura != null;
    }
}
