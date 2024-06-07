package modelo.dao;

import modelo.vo.Cliente;
import java.util.HashMap;
import java.util.Map;

public class DAOCliente {
    private Map<String, Cliente> clientes;

    public DAOCliente() {
        clientes = new HashMap<>();
    }

    public void guardarCliente(Cliente cliente) {
        clientes.put(cliente.getCurp(), cliente);
    }

    public void actualizarCliente(Cliente cliente) {
        clientes.put(cliente.getCurp(), cliente);
    }

    public void eliminarCliente(String curp) {
        clientes.remove(curp);
    }

    public Cliente buscarCliente(String curp) {
        return clientes.get(curp);
    }
}
