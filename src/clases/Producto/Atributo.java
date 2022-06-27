package clases.Producto;
public class Atributo {
    private String codAtributo;
    private String nombreAtributo;    
    private double valor;

    public Atributo(String codAtributo, String nombreAtributo, double valor) {
        this.codAtributo = codAtributo;
        this.nombreAtributo = nombreAtributo;
        this.valor = valor;
    }

    public String getCodAtributo() {
        return codAtributo;
    }

    public void setCodAtributo(String codAtributo) {
        this.codAtributo = codAtributo;
    }

    public String getNombreAtributo() {
        return nombreAtributo;
    }

    public void setNombreAtributo(String nombreAtributo) {
        this.nombreAtributo = nombreAtributo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


}
