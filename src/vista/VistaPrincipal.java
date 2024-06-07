package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import controlador.*;

public class VistaPrincipal extends JFrame {
    private JButton btnProductos;
    private JButton btnClientes;
    private JButton btnVentas;
    private JButton btnFacturacion;
    private JButton btnSalir;
    private ControladorVistaPrincipal controlador;

    public VistaPrincipal() {
        controlador = new ControladorVistaPrincipal(this);

        btnProductos = new JButton("PRODUCTOS");
        btnClientes = new JButton("CLIENTES");
        btnVentas = new JButton("VENTAS");
        btnFacturacion = new JButton("FACTURACION");
        btnSalir = new JButton("SALIR");
        btnFacturacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.mostrarVistaFacturacion();
            }
        });


        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 3));
        panel.add(btnProductos);
        panel.add(btnClientes);
        panel.add(btnVentas);
        panel.add(btnFacturacion);
        panel.add(btnSalir);

        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);

        btnProductos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.mostrarVistaProductos();
            }
        });

        btnClientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.mostrarVistaClientes();
            }
        });

        btnVentas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.mostrarVistaVentas();
            }
        });

        btnFacturacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.mostrarVistaFacturacion();
            }
        });

        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.salir();
            }
        });

        setTitle("Vista Principal");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }
}
