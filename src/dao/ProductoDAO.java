
package dao;

import clases.Persona.Proveedor;
import clases.Producto.*;
import interfaceDAO.IDAOProducto;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ProductoDAO extends Conexion implements IDAOProducto {
    
    PreparedStatement ps;
    ResultSet rs;
      
    @Override
    public boolean RegistrarProducto(Producto pr){ 
        try {
            this.iniciarConexion();
            String sql="{call addProducto(?,?,?,?,?,?,?,?)}";
            CallableStatement ps=conexion.prepareCall(sql);   
            ps.setString(1, pr.getCategoria());
            ps.setString(2, pr.getNombreP());
            ps.setString(3, pr.getMarca());
            ps.setString(4, pr.getEstado());
            ps.setInt(5, pr.getIdProveedor());              
            ps.setInt(6, pr.getStock());                    
            ps.setInt(7, pr.getCantInicial());
            ps.setDouble(8, pr.getPrecio());
            
            ps.executeUpdate();   

            return true;
        } catch (Exception e) {
            System.out.println("Error"+e);
            return false;
        }
    }
    
    @Override
    public List<Producto> ListarProducto(){
        List<Producto> lista = new ArrayList();
        try {
            this.iniciarConexion();
            String sql= "SELECT codProducto , c.nombreCat , p.nombre , m.nombreMar , p.estado , p.rut_proveedor , p.stock , p.cantInicial , p.precioUnit FROM producto p INNER JOIN categoria c on p.codCategoria = c.codCategoria INNER JOIN marca m on p.codMarca = m.codMarca";
            ps=conexion.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Producto pro = new Producto();
                pro.setCodigo(rs.getString("codProducto"));
                pro.setNomCat(rs.getString("c.nombreCat"));
                pro.setNombreP(rs.getString("p.nombre"));
                pro.setNomMar(rs.getString("m.nombreMar"));
                pro.setEstado(rs.getString("p.estado"));
                pro.setIdProveedor(rs.getInt("p.rut_proveedor"));
                pro.setStock(rs.getInt("p.stock"));           
                pro.setCantInicial(rs.getInt("p.cantInicial"));
                pro.setPrecio(rs.getDouble("p.precioUnit"));
                lista.add(pro);
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return lista;
    }   
     
    @Override
    public Producto buscarProducto(String cod){
        
        Producto pro = new Producto();
        try {
            this.iniciarConexion();
            String sql= "select * from producto where codProducto=?";
            ps=conexion.prepareStatement(sql);
            ps.setString(1, cod);
            rs=ps.executeQuery();
            if(rs.next()){
                pro.setNombreP(rs.getString("nombre"));
                pro.setStock(rs.getInt("stock"));
                pro.setPrecio(rs.getDouble("precioUnit"));
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return pro;
    } 
    
    @Override
      public boolean EliminarProducto(String cod){
        try {
            this.iniciarConexion();
            String sql= "DELETE producto from producto where codProducto =?";
            ps=conexion.prepareStatement(sql); 
            ps.setString(1, cod);
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error"+e);
            return false;
        }
    }
      
    @Override
       public boolean ModificarProducto(Producto pro){
        try {
            this.iniciarConexion();
            String sql= "update producto set codProducto=?,codCategoria=?, nombre=?, codMarca=?, estado=?, rut_proveedor=?, stock=?, cantInicial=?,precioUnit=? where codProducto=?";
            
            ps=conexion.prepareStatement(sql); 
            
            ps.setString(1, pro.getCodigo());
            ps.setString(2, pro.getCategoria());
            ps.setString(3, pro.getNombreP());
            ps.setString(4, pro.getMarca());
            ps.setString(5, pro.getEstado());
            ps.setInt(6, pro.getIdProveedor());            
            ps.setInt(7, pro.getStock());
            ps.setInt(8, pro.getCantInicial());
            ps.setDouble(9, pro.getPrecio());
            ps.setString(10, pro.getCodigo());
            ps.execute();
            
            return true;
        } catch (Exception e) {
            System.out.println("Error"+e);
            return false;
        }
    }
    public List<Proveedor> ListarProveedor() {
        List<Proveedor> lista = new ArrayList();
        try {
            this.iniciarConexion();
            String sql= "select p.rut_proveedor, p.codMarca, m.nombreMar FROM proveedor p INNER JOIN marca m on p.codMarca = m.codMarca";
            ps=this.conexion.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Proveedor c = new Proveedor();
                c.setRUT(rs.getString(1));
                c.setCodMarca(rs.getString(2));
                c.setDescripcionMarca(rs.getString(3));
                lista.add(c);
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return lista;
    }
    public List<Categoria> ListarCategoria() {
        List<Categoria> lista = new ArrayList();
        try {
            this.iniciarConexion();
            String sql= "select codCategoria, nombreCat  FROM categoria";
            ps=this.conexion.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Categoria c = new Categoria();
                c.setCodCategoria(rs.getString(1));
                c.setNombreCat(rs.getString(2));
                lista.add(c);
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return lista;
    }
    
    public Producto ListarProductoSeleccionada(String codProducto) {
        Producto producto = new Producto();
        try {
            this.iniciarConexion();
            String sql= "SELECT estado, cantInicial, stock FROM producto where codProducto=?";
            ps=conexion.prepareStatement(sql);   
            ps.setString(1,codProducto);
            rs=ps.executeQuery(); 
            if(rs.next()){
                 producto.setEstado(rs.getString("estado"));
                 producto.setCantInicial(rs.getInt("cantInicial"));
                 producto.setStock(rs.getInt("stock"));                 
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return producto;
    }
    public boolean RegistrarSolicitud(Solicitud pr){ 
        try {
            this.iniciarConexion();
            String sql="{call addSolicitud(?,?,?,?,?,?)}";
            CallableStatement ps=conexion.prepareCall(sql);   
            ps.setInt(1, pr.getId_admi());
            ps.setString(2, pr.getCodProducto());
            ps.setInt(3, pr.getRut_proveedor());
            ps.setString(4, pr.getCodCategoria());
            ps.setInt(5, pr.getCantidad());    
            ps.setString(6, pr.getComentarios());
            ps.executeUpdate();   

            return true;
        } catch (Exception e) {
            System.out.println("Error"+e);
            return false;
        }
    }
}
