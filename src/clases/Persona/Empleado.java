package clases.Persona;

public class Empleado extends Persona {

    private double sueldo;
    private String fechaIngreso;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, int dni, int telf, String direccion, double sueldo, String fechaIngreso) {
        super(nombre, apellido, dni, telf, direccion);
        this.sueldo = sueldo;
        this.fechaIngreso = fechaIngreso;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSueldo : " + sueldo + "\nFecha de Ingreso : " + fechaIngreso;
    }

    public String[][] listar() {
        String[][] lista = new String[2][2];
        lista[0][0] = "46617729";
        lista[0][1] = "Fabio Noceda";

        lista[1][0] = "10571476";
        lista[1][1] = "Luis Fernandez";

        return lista;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}
