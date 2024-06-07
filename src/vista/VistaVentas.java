package vista;

import controlador.ControladorVistaVentas;
import javax.swing.*;
import java.awt.*;

public class VistaVentas extends JFrame {
    private JTextField txtCodigo;
    private JTextField txtNombre;
    private JTextField txtCantidad;
    private JTextField txtBusqueda;
    private JComboBox<String> comboBusqueda;
    private JButton btnNuevo;
    private JButton btnModificar;
    private JButton btnGuardar;
    private JButton btnEliminar;
    private JButton btnLimpiar;
    private JButton btnCerrar;
    private ControladorVistaVentas controlador;

    public VistaVentas() {
        controlador = new ControladorVistaVentas(this);

        txtCodigo = new JTextField(15);
        txtNombre = new JTextField(15);
        txtCantidad = new JTextField(15);
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
        panelCampos.add(new JLabel("CODIGO"));
        panelCampos.add(txtCodigo);
        panelCampos.add(new JLabel("NOMBRE"));
        panelCampos.add(txtNombre);
        panelCampos.add(new JLabel("CANTIDAD"));
        panelCampos.add(txtCantidad);

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

        setTitle("VISTA VENTAS");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public String getCodigo() {
        return txtCodigo.getText();
    }

    public void setCodigo(String codigo) {
        txtCodigo.setText(codigo);
    }

    public String getNombre() {
        return txtNombre.getText();
    }

    public void setNombre(String nombre) {
        txtNombre.setText(nombre);
    }

    public String getCantidad() {
        return txtCantidad.getText();
    }

    public void setCantidad(String cantidad) {
        txtCantidad.setText(cantidad);
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
