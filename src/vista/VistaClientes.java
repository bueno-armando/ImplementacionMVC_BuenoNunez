package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import modelo.dao.DAOCliente;
import modelo.vo.Cliente;

public class VistaClientes extends JFrame {

    public JTextField txtCurp;
    public JTextField txtNombre;
    public JTextField txtCelular;
    public JButton btnGuardar;
    public JButton btnCancelar;
    private DAOCliente daoCliente;

    public VistaClientes() {
        this.daoCliente = new DAOCliente();
        this.initComponents();
    }

    private void initComponents() {
        this.setTitle("Vista de Clientes");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JLabel("CURP: "), BorderLayout.NORTH);
        panel.add(txtCurp = new JTextField(20), BorderLayout.CENTER);
        panel.add(new JLabel("Nombre: "), BorderLayout.NORTH);
        panel.add(txtNombre = new JTextField(20), BorderLayout.CENTER);
        panel.add(new JLabel("Celular: "), BorderLayout.NORTH);
        panel.add(txtCelular = new JTextField(20), BorderLayout.CENTER);

        JPanel botones = new JPanel();
        botones.add(btnGuardar = new JButton("Guardar"));
        botones.add(btnCancelar = new JButton("Cancelar"));
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String curp = txtCurp.getText();
                String nombre = txtNombre.getText();
                String celular = txtCelular.getText();
                Cliente cliente = new Cliente(curp, nombre, celular);
                daoCliente.guardarCliente(cliente);
                txtCurp.setText("");
                txtNombre.setText("");
                txtCelular.setText("");
            }
        });
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtCurp.setText("");
                txtNombre.setText("");
                txtCelular.setText("");
            }
        });

        panel.add(botones, BorderLayout.SOUTH);
        this.add(panel);
    }
}
