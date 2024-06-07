package controlador;

import javax.swing.JOptionPane;
import modelo.LogicaVentas;
import vista.VistaVentas;

public class ControladorVistaVentas {
    private VistaVentas vista;
    private LogicaVentas logica;

    public ControladorVistaVentas(VistaVentas vista) {
        this.vista = vista;
        this.logica = new LogicaVentas();

        // Añadir los listeners a los botones
        this.vista.getBtnNuevo().addActionListener(e -> nuevoVenta());
        this.vista.getBtnModificar().addActionListener(e -> modificarVenta());
        this.vista.getBtnGuardar().addActionListener(e -> guardarVenta());
        this.vista.getBtnEliminar().addActionListener(e -> eliminarVenta());
        this.vista.getBtnLimpiar().addActionListener(e -> limpiarCampos());
        this.vista.getBtnCerrar().addActionListener(e -> cerrarVista());
    }

    private void nuevoVenta() {
        limpiarCampos();
    }

    private void modificarVenta() {
        // Lógica para modificar una venta existente
        String codigo = vista.getCodigo();
        if (logica.existeVenta(codigo)) {
            String nombre = vista.getNombre();
            String cantidad = vista.getCantidad();
            logica.modificarVenta(codigo, nombre, cantidad);
            JOptionPane.showMessageDialog(vista, "Venta modificada con éxito");
        } else {
            JOptionPane.showMessageDialog(vista, "Venta no encontrada");
        }
    }

    private void guardarVenta() {
        String codigo = vista.getCodigo();
        String nombre = vista.getNombre();
        String cantidad = vista.getCantidad();

        if (codigo.isEmpty() || nombre.isEmpty() || cantidad.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Todos los campos son obligatorios");
            return;
        }

        if (logica.existeVenta(codigo)) {
            logica.modificarVenta(codigo, nombre, cantidad);
            JOptionPane.showMessageDialog(vista, "Venta modificada con éxito");
        } else {
            logica.agregarVenta(codigo, nombre, cantidad);
            JOptionPane.showMessageDialog(vista, "Venta agregada con éxito");
        }
    }

    private void eliminarVenta() {
        String codigo = vista.getCodigo();
        if (logica.existeVenta(codigo)) {
            logica.eliminarVenta(codigo);
            JOptionPane.showMessageDialog(vista, "Venta eliminada con éxito");
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(vista, "Venta no encontrada");
        }
    }

    private void limpiarCampos() {
        vista.setCodigo("");
        vista.setNombre("");
        vista.setCantidad("");
        vista.setBusqueda("");
    }

    private void cerrarVista() {
        vista.dispose();
    }
}
