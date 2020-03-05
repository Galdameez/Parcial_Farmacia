package Entidades;

public class Venta {

    private String nombreEmpleado, totalPagar, fecha;
    private double ventaAcetaminofen, ventaAspirina, ventaAlcohol, ventaRoyalin, ventaIbuprofeno, ventaParacetamol;
    //Constructor
    public Venta(String nombreEmpleado, String totalPagar, String fecha) {
        this.nombreEmpleado = nombreEmpleado;
        this.totalPagar = totalPagar;
        this.fecha = fecha;
    }

    public Venta() {
    }
    
    
    public double sumarTodo(){
        return this.ventaAcetaminofen + ventaAspirina + ventaAlcohol + ventaRoyalin + ventaIbuprofeno + ventaParacetamol;
    }
            
    public double getVentaAcetaminofen() {
        return ventaAcetaminofen;
    }

    public void setVentaAcetaminofen(double ventaAcetaminofen) {
        this.ventaAcetaminofen = ventaAcetaminofen;
    }

    public double getVentaAspirina() {
        return ventaAspirina;
    }

    public void setVentaAspirina(double ventaAspirina) {
        this.ventaAspirina = ventaAspirina;
    }

    public double getVentaAlcohol() {
        return ventaAlcohol;
    }

    public void setVentaAlcohol(double ventaAlcohol) {
        this.ventaAlcohol = ventaAlcohol;
    }

    public double getVentaRoyalin() {
        return ventaRoyalin;
    }

    public void setVentaRoyalin(double ventaRoyalin) {
        this.ventaRoyalin = ventaRoyalin;
    }

    public double getVentaIbuprofeno() {
        return ventaIbuprofeno;
    }

    public void setVentaIbuprofeno(double ventaIbuprofeno) {
        this.ventaIbuprofeno = ventaIbuprofeno;
    }

    public double getVentaParacetamol() {
        return ventaParacetamol;
    }

    public void setVentaParacetamol(double ventaParacetamol) {
        this.ventaParacetamol = ventaParacetamol;
    }

    
    
    //Setters
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public void setTotalPagar(String totalPagar) {
        this.totalPagar = totalPagar;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    //Getters
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public String getTotalPagar() {
        return totalPagar;
    }

    public String getFecha() {
        return fecha;
    }

}
