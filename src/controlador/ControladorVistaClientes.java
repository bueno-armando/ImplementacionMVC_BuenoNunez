package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.dao.DAOCliente;
import modelo.vo.Cliente;
import vista.VistaClientes;

public class ControladorVistaClientes {

    private VistaClientes vista;
    private DAOCliente daoCliente;

    public ControladorVistaClientes() {
        this.vista = new VistaClientes();
        this.daoCliente = new DAOCliente();
        this.vista.btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String curp = vista.txtCurp.getText();
                String nombre = vista.txtNombre.getText();
                String celular = vista.txtCelular.getText();
                Cliente cliente = new Cliente(curp, nombre, celular);
                daoCliente.guardarCliente(cliente);
                vista.txtCurp.setText("");
                vista.txtNombre.setText("");
                vista.txtCelular.setText("");
            }
        });
        this.vista.btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.txtCurp.setText("");
                vista.txtNombre.setText("");
                vista.txtCelular.setText("");
            }
        });
    }
}
