package modelo.vo;

public class Factura {
    private String numeroFactura;
    private String cliente;
    private String total;

    public Factura(String numeroFactura, String cliente, String total) {
        this.numeroFactura = numeroFactura;
        this.cliente = cliente;
        this.total = total;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    
}
