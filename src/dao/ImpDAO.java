package dao;

import clases.Persona.Cliente;
import interfaceDAO.IDAOCliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import dao.Conexion;

public class ImpDAO extends Conexion implements IDAOCliente{
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public boolean RegistrarCliente(Cliente cl) {
        try {
            Connection conex=Conexion.getConexion();
            String sql= "insert into cliente(id_cliente, nombre, apellido, telf, tipoCliente, direccion) values (?,?,?,?,?,?)";
            ps=conex.prepareStatement(sql);
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
    
}
