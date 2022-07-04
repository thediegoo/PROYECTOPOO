package clases.Persona;

public class Cliente extends Persona {

    private String tipoCliente;    
    private String tipoDoc;

    public Cliente(){
        
    }
    public Cliente(String tipoCliente, String tipoDoc, String nombre, String apellido, int dni, int telf, String direccion) {
        super(nombre, apellido, dni, telf, direccion);
        this.tipoCliente = tipoCliente;
        this.tipoDoc = tipoDoc;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }


}
