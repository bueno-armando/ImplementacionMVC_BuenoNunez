package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import modelo.dao.DAOVenta;
import modelo.vo.Venta;

public class VistaVentas extends JFrame {

    public JTextField txtCodigo;
    public JTextField txtNombre;
    public JTextField txtCantidad;
    public JButton btnGuardar;
    public JButton btnCancelar;
    private DAOVenta daoVenta;

    public VistaVentas() {
        this.daoVenta = new DAOVenta();
        this.initComponents();
    }

    private void initComponents() {
        this.setTitle("Vista de Ventas");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JLabel("Código: "), BorderLayout.NORTH);
        panel.add(txtCodigo = new JTextField(20), BorderLayout.CENTER);
        panel.add(new JLabel("Nombre: "), BorderLayout.NORTH);
        panel.add(txtNombre = new JTextField(20), BorderLayout.CENTER);
        panel.add(new JLabel("Cantidad: "), BorderLayout.NORTH);
        panel.add(txtCantidad = new JTextField(20), BorderLayout.CENTER);

        JPanel botones = new JPanel();
        botones.add(btnGuardar = new JButton("Guardar"));
        botones.add(btnCancelar = new JButton("Cancelar"));
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = txtCodigo.getText();
                String nombre = txtNombre.getText();
                String cantidad = txtCantidad.getText();
                Venta venta = new Venta(codigo, nombre, cantidad);
                daoVenta.guardarVenta(venta);
                txtCodigo.setText("");
                txtNombre.setText("");
                txtCantidad.setText("");
            }
        });
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtCodigo.setText("");
                txtNombre.setText("");
                txtCantidad.setText("");
            }
        });

        panel.add(botones, BorderLayout.SOUTH);
        this.add(panel);
    }
}
