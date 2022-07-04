package clases.Persona;

public class UsuarioAdmi {

    private String usuario;
    private String password;    
    private int id_admi;


    public UsuarioAdmi() {
    }

    public UsuarioAdmi(String usuario, String password, int id_admi) {
        this.usuario = usuario;
        this.password = password;
        this.id_admi = id_admi;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId_admi() {
        return id_admi;
    }

    public void setId_admi(int id_admi) {
        this.id_admi = id_admi;
    }

  
}
