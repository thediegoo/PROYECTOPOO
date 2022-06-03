package clases.Persona;

public class Proveedor extends Persona {

    private String nombreComercial;
    private String RUT;

    public Proveedor(String nombre, String apellido, int dni, int telf, String direccion, String nombreComercial, String RUT) {
        super(nombre, apellido, dni, telf, direccion);
        this.nombreComercial = nombreComercial;
        this.RUT = RUT;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public String getRUT() {
        return RUT;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNombre Comercial : " + nombreComercial + "\nRUT : " + RUT;
    }
}
