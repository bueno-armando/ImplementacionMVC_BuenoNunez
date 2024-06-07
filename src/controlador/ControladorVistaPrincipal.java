package controlador;

import vista.*;

public class ControladorVistaPrincipal {
    private VistaPrincipal vistaPrincipal;

    public ControladorVistaPrincipal(VistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
    }

    public void mostrarVistaProductos() {
        new VistaProductos().setVisible(true);
    }

    public void mostrarVistaClientes() {
        new VistaClientes().setVisible(true);
    }

    public void mostrarVistaVentas() {
        new VistaVentas().setVisible(true);
    }

    public void mostrarVistaFacturacion() {
        new VistaFacturacion().setVisible(true);
    }

    public void salir() {
        vistaPrincipal.dispose();
    }
}
