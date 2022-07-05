
package dao;

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
    
     public List ListarEmpleado(){
        List<Empleado> lista = new ArrayList();
        try {
            Connection conexion= DriverManager.getConnection("jdbc:mysql://localhost/peritec", "root", "");
            String sql= "select * from empleado";
            pe=conexion.prepareStatement(sql);
            rs=pe.executeQuery();
            while(rs.next()){
                Empleado emp = new Empleado();
                emp.setDni(rs.getInt("id_admi"));
                emp.setNombre(rs.getString("nombre"));
                emp.setApellido(rs.getString("apellido"));
                emp.setTelf(rs.getInt("telf"));
                emp.setDireccion(rs.getString("direccion"));
                emp.setFechaIngreso(rs.getString("fechaEntrada"));
                emp.setSueldo(rs.getDouble("sueldo"));
                lista.add(emp);
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return lista;
    }
     
       public boolean EliminarEmpleado(int id){
        try {
            Connection conexion= DriverManager.getConnection("jdbc:mysql://localhost/peritec", "root", "");
            String sql= "DELETE empleado, usuarioadmi from empleado INNER JOIN usuarioadmi ON empleado.id_admi=usuarioadmi.id_admi WHERE empleado.id_admi=?";
            pe=conexion.prepareStatement(sql); 
            pe.setInt(1, id);
            pe.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error"+e);
            return false;
        }
    }
       public List BuscarEmpleado(int id){
        List<Empleado> lista = new ArrayList();
        try {
            Connection conexion= DriverManager.getConnection("jdbc:mysql://localhost/peritec", "root", "");
            String sql= "select * from empleado where id_admi=?";
            pe=conexion.prepareStatement(sql);
            pe.setInt(1, id);
            rs=pe.executeQuery();
            while(rs.next()){
                Empleado emp = new Empleado();
                emp.setDni(rs.getInt("id_admi"));
                emp.setNombre(rs.getString("nombre"));
                emp.setApellido(rs.getString("apellido"));
                emp.setTelf(rs.getInt("telf"));
                emp.setDireccion(rs.getString("direccion"));
                emp.setFechaIngreso(rs.getString("fechaEntrada"));
                emp.setSueldo(rs.getDouble("sueldo"));      
                lista.add(emp);

            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return lista;
    }
    
}
