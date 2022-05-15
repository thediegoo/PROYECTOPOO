package clases.Persona;


import clases.Fecha.Fecha;

public class Proveedor extends Persona{
    private String nombreComercial;
    private String RUT;

    public Proveedor(String nombreComercial, String RUT, String nombre, String apellido, Fecha fechaNacimiento, int dni, int telf, String direccion) {
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
    public void imprimirDatos(){
        System.out.println("Nombre Comercial: "+nombreComercial);
        System.out.println("RUT: "+RUT); 
        System.out.println("");
    }
    
}
