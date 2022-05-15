package clases.Persona;

import clases.Fecha.Fecha;
import clases.Fecha.Fecha;

public class Empleado extends Persona {
   private double sueldo;
   private Fecha fechaIngreso;
   private String rol;
   
   public Empleado (String nombre, String apellido, Fecha fechaNacimiento, int dni, int telf, String direccion, double sueldo, 
   Fecha fechaIngreso, String rol){
       super(nombre, apellido, fechaNacimiento, dni, telf, direccion);
       this.sueldo = sueldo;
       this.fechaIngreso = fechaIngreso;
       this.rol = rol;
   }
   public double getSueldo(){
       return sueldo;
   }
   public Fecha getFechaIngreso(){
       return fechaIngreso;
   }
   public String Rol(){
       return rol;
   }
   public void imprimirDatos(){
        System.out.println("Sueldo: "+sueldo);
        System.out.println("FEcha de Ingreso: "+fechaIngreso); 
        System.out.println("Rol en la compañia"+rol);
   }
}
