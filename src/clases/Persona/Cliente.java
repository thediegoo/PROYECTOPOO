package clases.Persona;

public class Cliente extends Persona {

    private String tipo;

    public Cliente(String nombre, String apellido, int dni, int telf, String direccion, String tipo) {
        super(nombre, apellido, dni, telf, direccion);
        this.tipo = tipo;
    }

    public Cliente() {
    }

    public String getTipo() {
        return tipo;
    }

    public String[][] listar() {
        String[][] lista = new String[3][2];
        lista[0][0] = "10622482";
        lista[0][1] = "Carlos Miranda";

        lista[1][0] = "007551234";
        lista[1][1] = "Miguel Angel Martinez";

        lista[2][0] = "20555894011";
        lista[2][1] = "Makro";

        return lista;
    }

    public String[] Buscar(String codigo) {

        String[] registro = new String[3];
        for (int x = 0; x < listar().length; x++) {
            if (codigo.equals(listar()[x][0])) {

                registro = listar()[x];
            }
        }
        return registro;
    }
}
