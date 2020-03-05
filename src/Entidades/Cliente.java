package Entidades;

public class Cliente {

    private String nombreCliente, numCelular, correoContacto;

    public Cliente(String nombreCliente, String numCelular, String correoContacto) {
        this.nombreCliente = nombreCliente;
        this.numCelular = numCelular;
        this.correoContacto = correoContacto;
    }

    //Setters
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }

    public void setCorreoContacto(String correoContacto) {
        this.correoContacto = correoContacto;
    }

    //Getters
    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public String getCorreoContacto() {
        return correoContacto;
    }

}
