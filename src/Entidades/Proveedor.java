package Entidades;

public class Proveedor {

    
    private String nombreProveedor;
    private double prcAcetaminofen, prcAspirina, prcAlcohol, prcRoyalin, prcIbuprofeno, prcParacetamol;

    //Constructor
    public Proveedor(String nombreProveedor, double prcAcetaminofen, double prcAspirina, double prcAlcohol, double prcRoyalin, double prcIbuprofeno, double prcParacetamol) {
        this.nombreProveedor = nombreProveedor;
        this.prcAcetaminofen = prcAcetaminofen;
        this.prcAspirina = prcAspirina;
        this.prcAlcohol = prcAlcohol;
        this.prcRoyalin = prcRoyalin;
        this.prcIbuprofeno = prcIbuprofeno;
        this.prcParacetamol = prcParacetamol;
    }

    //Setters
    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
        
    }

    public void setPrcAcetaminofen(double prcAcetaminofen) {
        this.prcAcetaminofen = prcAcetaminofen;
    }

    public void setPrcAspirina(double prcAspirina) {
        this.prcAspirina = prcAspirina;
    }

    public void setPrcAlcohol(double prcAlcohol) {
        this.prcAlcohol = prcAlcohol;
    }

    public void setPrcRoyalin(double prcRoyalin) {
        this.prcRoyalin = prcRoyalin;
    }

    public void setPrcIbuprofeno(double prcIbuprofeno) {
        this.prcIbuprofeno = prcIbuprofeno;
    }

    public void setPrcParacetamol(double prcParacetamol) {
        this.prcParacetamol = prcParacetamol;
    }

    //Getters
    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public double getPrcAcetaminofen() {
        return prcAcetaminofen;
    }

    public double getPrcAspirina() {
        return prcAspirina;
    }

    public double getPrcAlcohol() {
        return prcAlcohol;
    }

    public double getPrcRoyalin() {
        return prcRoyalin;
    }

    public double getPrcIbuprofeno() {
        return prcIbuprofeno;
    }

    public double getPrcParacetamol() {
        return prcParacetamol;
    }

}
