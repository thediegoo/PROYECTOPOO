package clases.Persona;

public class Proveedor extends Persona {

    private String nombreComercial;
    private String RUT;
    private String codMarca;    
    private String descripcionMarca;

    
    public Proveedor(String nombre, String apellido, int dni, int telf, String direccion, String nombreComercial, String RUT) {
        super(nombre, apellido, dni, telf, direccion);
        this.nombreComercial = nombreComercial;
        this.RUT = RUT;
    }

    public Proveedor() {
        
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getRUT() {
        return RUT;
    }

    public void setRUT(String RUT) {
        this.RUT = RUT;
    }

    public String getCodMarca() {
        return codMarca;
    }

    public void setCodMarca(String codMarca) {
        this.codMarca = codMarca;
    }

    public String getDescripcionMarca() {
        return descripcionMarca;
    }

    public void setDescripcionMarca(String descripcionMarca) {
        this.descripcionMarca = descripcionMarca;
    }

    

}
