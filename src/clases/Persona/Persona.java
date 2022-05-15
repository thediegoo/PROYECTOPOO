package clases.Persona;

import clases.Fecha.Fecha;
import clases.Fecha.Fecha;

public class Persona {
    private String nombre;
    private String apellido;
    private Fecha fechaNacimiento;
    private int dni;
    private int telf;
    private String direccion;
    
    public Persona(String nombre, String apellido, Fecha fechaNacimiento, int dni, int telf, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.telf = telf;
        this.direccion = direccion;
    }
    public void imprimirDatos(){
        System.out.println("DNI: "+dni);
        System.out.println("Nombre: "+nombre);    
        System.out.println("Apellido: "+apellido);  
        System.out.print("Fecha de Nacimiento");
        fechaNacimiento.imprimir();
        System.out.println("Telefono: "+telf); 
        System.out.println("Direccion: "+direccion); 
        System.out.println("");
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getDni() {
        return dni;
    }

    public int getTelf() {
        return telf;
    }

    public String getDireccion() {
        return direccion;
    }
}
