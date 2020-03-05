package Entidades;

public class Inventario {

    private double prcAcetaminofen, prcAspirina, prcAlcohol, prcRoyalin, prcIbuprofeno, prcParacetamol;
    private int cantAcetaminofe, cantAspirina, cantAlcohol, cantRoyalin, cantIbuprofeno, cantParacetamol;

    public Inventario() {
        this.prcAcetaminofen = 0;
        this.prcAspirina = 0;
        this.prcAlcohol = 0;
        this.prcRoyalin = 0;
        this.prcIbuprofeno = 0;
        this.prcParacetamol = 0;
        this.cantAcetaminofe = 0;
        this.cantAspirina = 0;
        this.cantAlcohol = 0;
        this.cantRoyalin = 0;
        this.cantIbuprofeno = 0;
        this.cantParacetamol = 0;
    }

    public void addMedicamentos(int cantAcetaminofe, int cantAspirina, int cantAlcohol, int cantRoyalin, int cantIbuprofeno, int cantParacetamol) {
        this.cantAcetaminofe += cantAcetaminofe;
        this.cantAspirina += cantAspirina;
        this.cantAlcohol += cantAlcohol;
        this.cantRoyalin += cantRoyalin;
        this.cantIbuprofeno += cantIbuprofeno;
        this.cantParacetamol += cantParacetamol;
    }

    public void restartAcetaminofen(int cantidad) {
        this.cantAcetaminofe -= cantidad;
    }

    public void restartAspirina(int cantidad) {
        this.cantAspirina -= cantidad;
    }

    public void restartAlcohol(int cantidad) {
        this.cantAlcohol -= cantidad;
    }

    public void restartRoyalin(int cantidad) {
        this.cantRoyalin -= cantidad;
    }

    public void restartIbuprofeno(int cantidad) {
        this.cantIbuprofeno -= cantidad;
    }

    public void restartParacetamol(int cantidad) {
        this.cantParacetamol -= cantidad;
    }

    //Setters
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

    public void setCantAcetaminofe(int cantAcetaminofe) {
        this.cantAcetaminofe = cantAcetaminofe;
    }

    public void setCantAspirina(int cantAspirina) {
        this.cantAspirina = cantAspirina;
    }

    public void setCantAlcohol(int cantAlcohol) {
        this.cantAlcohol = cantAlcohol;
    }

    public void setCantRoyalin(int cantRoyalin) {
        this.cantRoyalin = cantRoyalin;
    }

    public void setCantIbuprofeno(int cantIbuprofeno) {
        this.cantIbuprofeno = cantIbuprofeno;
    }

    public void setCantParacetamol(int cantParacetamol) {
        this.cantParacetamol = cantParacetamol;
    }

    //Getters
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

    public int getCantAcetaminofe() {
        return cantAcetaminofe;
    }

    public int getCantAspirina() {
        return cantAspirina;
    }

    public int getCantAlcohol() {
        return cantAlcohol;
    }

    public int getCantRoyalin() {
        return cantRoyalin;
    }

    public int getCantIbuprofeno() {
        return cantIbuprofeno;
    }

    public int getCantParacetamol() {
        return cantParacetamol;
    }

}
