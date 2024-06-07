package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import modelo.dao.DAOFactura;
import modelo.vo.Factura;

public class VistaFacturacion extends JFrame {

    public JTextField txtNumeroFactura;
    public JTextField txtCliente;
    public JTextField txtTotal;
    public JButton btnGuardar;
    public JButton btnCancelar;
    private DAOFactura daoFactura;

    public VistaFacturacion() {
        this.daoFactura = new DAOFactura();
        this.initComponents();
    }

    private void initComponents() {
        this.setTitle("Vista de Facturación");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JLabel("Número de Factura: "), BorderLayout.NORTH);
        panel.add(txtNumeroFactura = new JTextField(20), BorderLayout.CENTER);
        panel.add(new JLabel("Cliente: "), BorderLayout.NORTH);
        panel.add(txtCliente = new JTextField(20), BorderLayout.CENTER);
        panel.add(new JLabel("Total: "), BorderLayout.NORTH);
        panel.add(txtTotal = new JTextField(20), BorderLayout.CENTER);

        JPanel botones = new JPanel();
        botones.add(btnGuardar = new JButton("Guardar"));
        botones.add(btnCancelar = new JButton("Cancelar"));
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroFactura = txtNumeroFactura.getText();
                String cliente = txtCliente.getText();
                String total = txtTotal.getText();
                Factura factura = new Factura(numeroFactura, cliente, total);
                daoFactura.guardarFactura(factura);
                txtNumeroFactura.setText("");
                txtCliente.setText("");
                txtTotal.setText("");
            }
        });
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNumeroFactura.setText("");
                txtCliente.setText("");
                txtTotal.setText("");
            }
        });

        panel.add(botones, BorderLayout.SOUTH);
        this.add(panel);
    }
}
