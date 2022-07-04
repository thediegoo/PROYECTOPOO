
package ModelFactura;

import clases.Persona.Cliente;
import clases.Persona.Empleado;
import clases.Persona.UsuarioAdmi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class EmpleadoDAO {
    
     PreparedStatement pe;     
     PreparedStatement pe2;

     ResultSet rs;
    
    public boolean RegistrarEmpleado(Empleado cl, UsuarioAdmi ua){
        
        try {
            Connection conexion= DriverManager.getConnection("jdbc:mysql://localhost/peritec", "root", "");
            String sql= "INSERT INTO empleado(id_admi, nombre, apellido, telf, direccion,fechaEntrada, sueldo)"
                    + "VALUES(?, ?, ?, ?, ?,?,?)";
            String sql2= "INSERT INTO usuarioadmi(usuario, password, id_admi)"
                    + "VALUES(?, ?, ?)";
            
            pe=conexion.prepareStatement(sql);            
            pe2=conexion.prepareStatement(sql2);

            pe.setInt(1, cl.getDni());
            pe.setString(2, cl.getNombre());
            pe.setString(3, cl.getApellido());
            pe.setInt(4, cl.getTelf());
            pe.setString(5, cl.getDireccion());            
            pe.setString(6, cl.getFechaIngreso());
            pe.setDouble(7, cl.getSueldo());

            pe2.setString(1, ua.getUsuario());            
            pe2.setString(2, ua.getPassword());
            pe2.setInt(3, ua.getId_admi());

            pe.execute();            
            pe2.execute();

            return true;
        } catch (Exception e) {
            System.out.println("Error"+e);
            return false;
        }
    }
}
