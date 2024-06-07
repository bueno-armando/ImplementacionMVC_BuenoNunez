package controlador;

import javax.swing.JOptionPane;
import modelo.LogicaFacturacion;
import vista.VistaFacturacion;

public class ControladorVistaFacturacion {
    private VistaFacturacion vista;
    private LogicaFacturacion logica;

    public ControladorVistaFacturacion(VistaFacturacion vista) {
        this.vista = vista;
        this.logica = new LogicaFacturacion();

        // Añadir los listeners a los botones
        this.vista.getBtnNuevo().addActionListener(e -> nuevoFactura());
        this.vista.getBtnModificar().addActionListener(e -> modificarFactura());
        this.vista.getBtnGuardar().addActionListener(e -> guardarFactura());
        this.vista.getBtnEliminar().addActionListener(e -> eliminarFactura());
        this.vista.getBtnLimpiar().addActionListener(e -> limpiarCampos());
        this.vista.getBtnCerrar().addActionListener(e -> cerrarVista());
    }

    private void nuevoFactura() {
        limpiarCampos();
    }

    private void modificarFactura() {
        // Lógica para modificar una factura existente
        String numeroFactura = vista.getNumeroFactura();
        if (logica.existeFactura(numeroFactura)) {
            String cliente = vista.getCliente();
            String total = vista.getTotal();
            logica.modificarFactura(numeroFactura, cliente, total);
            JOptionPane.showMessageDialog(vista, "Factura modificada con éxito");
        } else {
            JOptionPane.showMessageDialog(vista, "Factura no encontrada");
        }
    }

    private void guardarFactura() {
        String numeroFactura = vista.getNumeroFactura();
        String cliente = vista.getCliente();
        String total = vista.getTotal();

        if (numeroFactura.isEmpty() || cliente.isEmpty() || total.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Todos los campos son obligatorios");
            return;
        }

        if (logica.existeFactura(numeroFactura)) {
            logica.modificarFactura(numeroFactura, cliente, total);
            JOptionPane.showMessageDialog(vista, "Factura modificada con éxito");
        } else {
            logica.agregarFactura(numeroFactura, cliente, total);
            JOptionPane.showMessageDialog(vista, "Factura agregada con éxito");
        }
    }

    private void eliminarFactura() {
        String numeroFactura = vista.getNumeroFactura();
        if (logica.existeFactura(numeroFactura)) {
            logica.eliminarFactura(numeroFactura);
            JOptionPane.showMessageDialog(vista, "Factura eliminada con éxito");
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(vista, "Factura no encontrada");
        }
    }

    private void limpiarCampos() {
        vista.setNumeroFactura("");
        vista.setCliente("");
        vista.setTotal("");
        vista.setBusqueda("");
    }

    private void cerrarVista() {
        vista.dispose();
    }
}
