
package clases.Persona;

import clases.Fecha.Fecha;
import clases.Fecha.Fecha;

public class Cliente extends Persona{
    
    private String tipo;

    public Cliente(String nombre, String apellido, Fecha fechaNacimiento, int dni, int telf, String direccion, String tipo) {
        super(nombre, apellido, fechaNacimiento, dni, telf, direccion);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
