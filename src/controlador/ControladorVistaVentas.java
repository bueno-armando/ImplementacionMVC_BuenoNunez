package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.dao.DAOVenta;
import modelo.vo.Venta;
import vista.VistaVentas;

public class ControladorVistaVentas {

    private VistaVentas vista;
    private DAOVenta daoVenta;

    public ControladorVistaVentas() {
        this.vista = new VistaVentas();
        this.daoVenta = new DAOVenta();
        this.vista.btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = vista.txtCodigo.getText();
                String nombre = vista.txtNombre.getText();
                String cantidad = vista.txtCantidad.getText();
                Venta venta = new Venta(codigo, nombre, cantidad);
                daoVenta.guardarVenta(venta);
                vista.txtCodigo.setText("");
                vista.txtNombre.setText("");
                vista.txtCantidad.setText("");
            }
        });
        this.vista.btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.txtCodigo.setText("");
                vista.txtNombre.setText("");
                vista.txtCantidad.setText("");
            }
        });
    }
}
