package clases.Persona;
public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private int telf;
    private String direccion;
    
    public Persona(){
    }
    
    public Persona(String nombre, String apellido, int dni, int telf, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telf = telf;
        this.direccion = direccion;
    }
    
    public void imprimirDatos(){
        System.out.println("DNI: "+dni);
        System.out.println("Nombre: "+nombre);    
        System.out.println("Apellido: "+apellido);  
        System.out.print("Fecha de Nacimiento");
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

    public int getDni() {
        return dni;
    }

    public int getTelf() {
        return telf;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setTelf(int telf) {
        this.telf = telf;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
}
