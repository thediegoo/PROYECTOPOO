package interfaceDAO;

import clases.Persona.Empleado;
import clases.Persona.UsuarioAdmi;
import java.util.List;

public interface IDAOEmpleado {
    public boolean RegistrarEmpleado(Empleado cl, UsuarioAdmi ua);
    public List ListarEmpleado();
    public boolean EliminarEmpleado(int id);
    public boolean ModificarEmpleado(Empleado emp);
    public List BuscarEmpleado(int id);
}
