
package dao;

import clases.Persona.Cliente;
import interfaceDAO.IDAOCliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ClienteDAO extends Conexion implements IDAOCliente{
    
     PreparedStatement ps;
     ResultSet rs;
   
    @Override
    public boolean RegistrarCliente(Cliente cl) {
        try {
            this.iniciarConexion();
            String sql= "insert into cliente(id_cliente, nombre, apellido, telf, tipoCliente, direccion) values (?,?,?,?,?,?)";
            ps=this.conexion.prepareStatement(sql);
            ps.setInt(1, cl.getDni());       
            ps.setString(2, cl.getNombre());
            ps.setString(3, cl.getApellido());
            ps.setInt(4, cl.getTelf());
            ps.setString(5, cl.getTipoCliente());
            ps.setString(6, cl.getDireccion());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error"+e);
            return false;
        }
    }

    @Override
    public List ListarCliente() {
        List<Cliente> lista = new ArrayList();
        try {
            this.iniciarConexion();
            String sql= "select * from cliente";
            ps=this.conexion.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Cliente cl = new Cliente();
                cl.setDni(rs.getInt("id_cliente"));
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

    @Override
    public boolean EliminarCliente(int id) {
       try {
            this.iniciarConexion();
            String sql= "delete from cliente where id_cliente=?";
            ps=this.conexion.prepareStatement(sql); 
            ps.setInt(1, id);
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error"+e);
            return false;
        }
    }

    @Override
    public boolean ModificarCliente(Cliente cl) {
       try {
           this.iniciarConexion();
            String sql= "update cliente set nombre=?, apellido=?, telf=?, tipoCliente=?, direccion=? where id_cliente=?";
            ps=this.conexion.prepareStatement(sql); 
            ps.setString(1, cl.getNombre());
            ps.setString(2, cl.getApellido());
            ps.setInt(3, cl.getTelf());
            ps.setString(4, cl.getTipoCliente());
            ps.setString(5, cl.getDireccion());
            ps.setInt(6, cl.getDni());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error"+e);
            return false;
        }
    }

    @Override
    public Cliente BuscarCliente(int dni) {
        Cliente cl=new Cliente();
        try {
            this.iniciarConexion();
            String sql= "select * from cliente where id_cliente=?";
            ps=this.conexion.prepareStatement(sql); 
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
