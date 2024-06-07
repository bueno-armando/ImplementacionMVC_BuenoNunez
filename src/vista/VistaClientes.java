package vista;

import controlador.ControladorVistaClientes;
import javax.swing.*;
import java.awt.*;

public class VistaClientes extends JFrame {
    private JTextField txtCURP;
    private JTextField txtNombre;
    private JTextField txtCelular;
    private JTextField txtBusqueda;
    private JComboBox<String> comboBusqueda;
    private JButton btnNuevo;
    private JButton btnModificar;
    private JButton btnGuardar;
    private JButton btnEliminar;
    private JButton btnLimpiar;
    private JButton btnCerrar;
    private ControladorVistaClientes controlador;

    public VistaClientes() {
        controlador = new ControladorVistaClientes(this);

        txtCURP = new JTextField(15);
        txtNombre = new JTextField(15);
txtCURP = new JTextField(15);
txtCelular = new JTextField(15);
        txtCelular = new JTextField(15);
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
        panelCampos.add(new JLabel("CURP"));
        panelCampos.add(txtCURP);
        panelCampos.add(new JLabel("NOMBRE"));
        panelCampos.add(txtNombre);
        panelCampos.add(new JLabel("CELULAR"));
        panelCampos.add(txtCelular);

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

        setTitle("VISTA CLIENTES");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public String getCURP() {
        return txtCURP.getText();
    }

    public void setCURP(String curp) {
        txtCURP.setText(curp);
    }

    public String getNombre() {
        return txtNombre.getText();
    }

    public void setNombre(String nombre) {
        txtNombre.setText(nombre);
    }

    public String getCelular() {
        return txtCelular.getText();
    }

    public void setCelular(String celular) {
        txtCelular.setText(celular);
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
