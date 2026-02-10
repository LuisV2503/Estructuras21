public class ObjVehiculo{
    
    private String marca;
    private String tipo;
    private int cilindraje;
    private Double PagoActual;
    private Double PagoAnterior;
    private int NumeroCelda;

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getCilindraje() {
        return cilindraje;
    }
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    public Double getPagoActual() {
        return PagoActual;
    }
    public void setPagoActual(Double pagoActual) {
        PagoActual = pagoActual;
    }
    public Double getPagoAnterior() {
        return PagoAnterior;
    }
    public void setPagoAnterior(Double pagoAnterior) {
        this.PagoAnterior = pagoAnterior;
    }
    
    public int getNumeroCelda() {
        return NumeroCelda;
    }
    public void setNumeroCelda(int numeroCelda) {
        NumeroCelda = numeroCelda;
    }

    public ObjVehiculo()
    {

    }

    public ObjVehiculo(String marca, String tipo, int cilindraje, Double PagoActual, Double pagoaAnterior, int NumeroCelda)
    {
        this.tipo = tipo;
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.PagoActual = PagoActual;
        this.PagoAnterior = PagoAnterior;
        this.NumeroCelda = NumeroCelda;
    }
}