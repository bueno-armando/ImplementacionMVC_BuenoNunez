package modelo.vo;

public class Cliente {
    private String curp;
    private String nombre;
    private String celular;

    public Cliente(String curp, String nombre, String celular) {
        this.curp = curp;
        this.nombre = nombre;
        this.celular = celular;
    }

    // Getters y setters
    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
