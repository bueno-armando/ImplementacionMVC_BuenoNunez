package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.dao.DAOFactura;
import modelo.vo.Factura;
import vista.VistaFacturacion;

public class ControladorVistaFacturacion {

    private VistaFacturacion vista;
    private DAOFactura daoFactura;

    public ControladorVistaFacturacion() {
        this.vista = new VistaFacturacion();
        this.daoFactura = new DAOFactura();
        this.vista.btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroFactura = vista.txtNumeroFactura.getText();
                String cliente = vista.txtCliente.getText();
                String total = vista.txtTotal.getText();
                Factura factura = new Factura(numeroFactura, cliente, total);
                daoFactura.guardarFactura(factura);
                vista.txtNumeroFactura.setText("");
                vista.txtCliente.setText("");
                vista.txtTotal.setText("");
            }
        });
        this.vista.btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.txtNumeroFactura.setText("");
                vista.txtCliente.setText("");
                vista.txtTotal.setText("");
            }
        });
    }
}
