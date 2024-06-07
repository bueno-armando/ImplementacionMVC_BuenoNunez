package vista;

import controlador.ControladorVistaFacturacion;
import javax.swing.*;
import java.awt.*;

public class VistaFacturacion extends JFrame {
    private JTextField txtNumeroFactura;
    private JTextField txtCliente;
    private JTextField txtTotal;
    private JTextField txtBusqueda;
    private JComboBox<String> comboBusqueda;
    private JButton btnNuevo;
    private JButton btnModificar;
    private JButton btnGuardar;
    private JButton btnEliminar;
    private JButton btnLimpiar;
    private JButton btnCerrar;
    private ControladorVistaFacturacion controlador;

    public VistaFacturacion() {
        controlador = new ControladorVistaFacturacion(this);

        txtNumeroFactura = new JTextField(15);
        txtCliente = new JTextField(15);
        txtTotal = new JTextField(15);
        txtBusqueda = new JTextField(15);
        comboBusqueda = new JComboBox<>(new String[]{"Item 1"});

        btnNuevo = new JButton("NUEVO");
        btnModificar = new JButton("MODIFICAR");
        btnGuardar = new JButton("GUARDAR");
        btnEliminar = new JButton("ELIMINAR");
        btnLimpiar = new JButton("LIMPIAR");
        btnCerrar = new JButton("CERRAR");

        JPanel panelCampos = new JPanel();
        panelCampos.setLayout(new GridLayout(3, 2, 10, 10));
        panelCampos.add(new JLabel("NUMERO FACTURA"));
        panelCampos.add(txtNumeroFactura);
        panelCampos.add(new JLabel("CLIENTE"));
        panelCampos.add(txtCliente);
        panelCampos.add(new JLabel("TOTAL"));
        panelCampos.add(txtTotal);

        JPanel panelBusqueda = new JPanel();
        panelBusqueda.setLayout(new BorderLayout());
        panelBusqueda.add(new JLabel("BUSQUEDA"), BorderLayout.NORTH);
        panelBusqueda.add(txtBusqueda, BorderLayout.CENTER);
        panelBusqueda.add(comboBusqueda, BorderLayout.SOUTH);

        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(1, 6, 10, 10));
        panelBotones.add(btnNuevo);
        panelBotones.add(btnModificar);
        panelBotones.add(btnGuardar);
        panelBotones.add(btnEliminar);
        panelBotones.add(btnLimpiar);
        panelBotones.add(btnCerrar);

        setLayout(new BorderLayout());
        add(panelCampos, BorderLayout.CENTER);
        add(panelBusqueda, BorderLayout.EAST);
        add(panelBotones, BorderLayout.SOUTH);

        setTitle("VISTA FACTURACION");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public String getNumeroFactura() {
        return txtNumeroFactura.getText();
    }

    public void setNumeroFactura(String numeroFactura) {
        txtNumeroFactura.setText(numeroFactura);
    }

    public String getCliente() {
        return txtCliente.getText();
    }

    public void setCliente(String cliente) {
        txtCliente.setText(cliente);
    }

    public String getTotal() {
        return txtTotal.getText();
    }

    public void setTotal(String total) {
        txtTotal.setText(total);
    }

    public String getBusqueda() {
        return txtBusqueda.getText();
    }

    public void setBusqueda(String busqueda) {
        txtBusqueda.setText(busqueda);
    }

    public JComboBox<String> getComboBusqueda() {
        return comboBusqueda;
    }

    public JButton getBtnNuevo() {
        return btnNuevo;
    }

    public JButton getBtnModificar() {
        return btnModificar;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public JButton getBtnLimpiar() {
        return btnLimpiar;
    }

    public JButton getBtnCerrar() {
        return btnCerrar;
    }
}
