package controlador;

import javax.swing.JOptionPane;
import modelo.LogicaClientes;
import vista.VistaClientes;

public class ControladorVistaClientes {
    private VistaClientes vista;
    private LogicaClientes logica;

    public ControladorVistaClientes(VistaClientes vista) {
        this.vista = vista;
        this.logica = new LogicaClientes();

        // Añadir los listeners a los botones
        this.vista.getBtnNuevo().addActionListener(e -> nuevoCliente());
        this.vista.getBtnModificar().addActionListener(e -> modificarCliente());
        this.vista.getBtnGuardar().addActionListener(e -> guardarCliente());
        this.vista.getBtnEliminar().addActionListener(e -> eliminarCliente());
        this.vista.getBtnLimpiar().addActionListener(e -> limpiarCampos());
        this.vista.getBtnCerrar().addActionListener(e -> cerrarVista());
    }

    private void nuevoCliente() {
        limpiarCampos();
    }

    private void modificarCliente() {
        // Lógica para modificar un cliente existente
        String curp = vista.getCURP();
        if (logica.existeCliente(curp)) {
            String nombre = vista.getNombre();
            String celular = vista.getCelular();
            logica.modificarCliente(curp, nombre, celular);
            JOptionPane.showMessageDialog(vista, "Cliente modificado con éxito");
        } else {
            JOptionPane.showMessageDialog(vista, "Cliente no encontrado");
        }
    }

    private void guardarCliente() {
        String curp = vista.getCURP();
        String nombre = vista.getNombre();
        String celular = vista.getCelular();

        if (curp.isEmpty() || nombre.isEmpty() || celular.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Todos los campos son obligatorios");
            return;
        }

        if (logica.existeCliente(curp)) {
            logica.modificarCliente(curp, nombre, celular);
            JOptionPane.showMessageDialog(vista, "Cliente modificado con éxito");
        } else {
            logica.agregarCliente(curp, nombre, celular);
            JOptionPane.showMessageDialog(vista, "Cliente agregado con éxito");
        }
    }

    private void eliminarCliente() {
        String curp = vista.getCURP();
        if (logica.existeCliente(curp)) {
            logica.eliminarCliente(curp);
            JOptionPane.showMessageDialog(vista, "Cliente eliminado con éxito");
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(vista, "Cliente no encontrado");
        }
    }

    private void limpiarCampos() {
        vista.setCURP("");
        vista.setNombre("");
        vista.setCelular("");
        vista.setBusqueda("");
    }

    private void cerrarVista() {
        vista.dispose();
    }
}
