package modelo;

import modelo.dao.DAOCliente;
import modelo.vo.Cliente;

public class LogicaClientes {
    private DAOCliente daoCliente;

    public LogicaClientes() {
        daoCliente = new DAOCliente();
    }

    public void agregarCliente(String curp, String nombre, String celular) {
        Cliente cliente = new Cliente(curp, nombre, celular);
        daoCliente.guardarCliente(cliente);
    }

    public void modificarCliente(String curp, String nombre, String celular) {
        Cliente cliente = new Cliente(curp, nombre, celular);
        daoCliente.actualizarCliente(cliente);
    }

    public void eliminarCliente(String curp) {
        daoCliente.eliminarCliente(curp);
    }

    public boolean existeCliente(String curp) {
        Cliente cliente = daoCliente.buscarCliente(curp);
        return cliente != null;
    }
}
