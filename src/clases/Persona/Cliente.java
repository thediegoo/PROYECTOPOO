package clases.Persona;

public class Cliente extends Persona {

    private String tipoCliente;    


    public Cliente(String tipoCliente, String nombre, String apellido, int dni, int telf, String direccion) {
        super(nombre, apellido, dni, telf, direccion);
        this.tipoCliente = tipoCliente;
    }

    public Cliente() {
       
    }
    
    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }



}
