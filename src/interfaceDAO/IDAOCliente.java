
package interfaceDAO;

import clases.Persona.Cliente;
import java.util.List;
public interface IDAOCliente {
    
     public boolean RegistrarCliente(Cliente cl);
     public List ListarCliente();
     public boolean EliminarCliente(int id);
     public boolean ModificarCliente(Cliente cl);
     public Cliente BuscarCliente(int dni);
}
