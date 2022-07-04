
package ModelFactura;

import clases.Persona.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ClienteDAO {
    
     PreparedStatement ps;
     ResultSet rs;
    
    public boolean RegistrarCliente(Cliente cl){
        
        try {
            Connection conexion= DriverManager.getConnection("jdbc:mysql://localhost/peritec", "root", "");
            String sql= "insert into cliente(id_cliente,tipoDoc, nombre, apellido, telf, tipoCliente, direccion) values (?,?,?,?,?,?,?)";
            ps=conexion.prepareStatement(sql);
            ps.setInt(1, cl.getDni());            
            ps.setString(2, cl.getTipoDoc());
            ps.setString(3, cl.getNombre());
            ps.setString(4, cl.getApellido());
            ps.setInt(5, cl.getTelf());
            ps.setString(6, cl.getTipoCliente());
            ps.setString(7, cl.getDireccion());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error"+e);
            return false;
        }
    }
    
    public List ListarCliente(){
        List<Cliente> lista = new ArrayList();
        try {
            Connection conexion= DriverManager.getConnection("jdbc:mysql://localhost/peritec", "root", "");
            String sql= "select * from cliente";
            ps=conexion.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Cliente cl = new Cliente();
                cl.setDni(rs.getInt("id_cliente"));
                cl.setTipoDoc(rs.getString("tipoDoc"));
                cl.setNombre(rs.getString("nombre"));
                cl.setApellido(rs.getString("apellido"));
                cl.setTelf(rs.getInt("telf"));
                cl.setTipoCliente(rs.getString("tipoCliente"));
                cl.setDireccion(rs.getString("direccion"));
                lista.add(cl);
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return lista;
    }
    
    public boolean EliminarCliente(int id){
        try {
            Connection conexion= DriverManager.getConnection("jdbc:mysql://localhost/peritec", "root", "");
            String sql= "delete from cliente where id_cliente=?";
            ps=conexion.prepareStatement(sql); 
            ps.setInt(1, id);
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error"+e);
            return false;
        }
    }
    
    public boolean ModificarCliente(Cliente cl){
        try {
            Connection conexion= DriverManager.getConnection("jdbc:mysql://localhost/peritec", "root", "");
            String sql= "update cliente set id_cliente=?, nombre=?, apellido=?, telf=?, tipoCliente=?, direccion=? where id_cliente=?";
            ps=conexion.prepareStatement(sql); 
            ps.setInt(1, cl.getDni());
            ps.setString(2, cl.getNombre());
            ps.setString(3, cl.getApellido());
            ps.setInt(4, cl.getTelf());
            ps.setString(5, cl.getTipoCliente());
            ps.setString(6, cl.getDireccion());
            ps.setInt(7, cl.getDni());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error"+e);
            return false;
        }
    }
    
    public Cliente BuscarCliente(int dni){
        Cliente cl=new Cliente();
        try {
            Connection conexion= DriverManager.getConnection("jdbc:mysql://localhost/peritec", "root", "");
            String sql= "select * from cliente where id_cliente=?";
            ps=conexion.prepareStatement(sql); 
            ps.setInt(1, dni);
            rs=ps.executeQuery();
            if(rs.next()){
                cl.setNombre(rs.getString("nombre"));
                cl.setApellido(rs.getString("apellido"));
                cl.setTelf(rs.getInt("telf"));
                cl.setTipoCliente(rs.getString("tipoCliente"));
                cl.setDireccion(rs.getString("direccion"));
                
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return cl;
    }
    
}
