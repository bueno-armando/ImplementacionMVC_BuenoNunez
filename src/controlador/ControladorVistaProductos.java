package controlador;

import javax.swing.JOptionPane;
import modelo.LogicaProductos;
import vista.VistaProductos;

public class ControladorVistaProductos {
    private VistaProductos vista;
    private LogicaProductos logica;

    public ControladorVistaProductos(VistaProductos vista) {
        this.vista = vista;
        this.logica = new LogicaProductos();
    }

    public void agregarProducto() {
        String nombre = vista.getNombre();
        String precioStr = vista.getPrecio();
        try {
            double precio = Double.parseDouble(precioStr);
            logica.agregarProducto(nombre, precio);
            JOptionPane.showMessageDialog(vista, "Producto agregado con éxito");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(vista, "Precio no válido");
        }
    }
}
