
package dao;

import clases.Factura.Detalle;
import clases.Factura.Factura;
import interfaceDAO.IDAOVenta;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatoCompraDAO extends Conexion implements IDAOVenta{
    
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public boolean RegistrarVenta(Factura fac){
        try {
            this.iniciarConexion();
            String sql="{call crearComprob(?,?,?,?,?,?)}";
            CallableStatement ps=conexion.prepareCall(sql); 
            ps.setInt(1, fac.getIdCliente());
            ps.setInt(2, fac.getIdVendedor());
            ps.setString(3, fac.getFecha());
            ps.setDouble(4, fac.getDescuento());
            ps.setDouble(5, fac.getSubtotal());
            ps.setDouble(6, fac.getPrecioTotal());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error"+e);
            return false;
        }
    }
     
    @Override
    public boolean RegistrarDetalle(Detalle det){
        try {
            this.iniciarConexion();
            String sql="insert into comprobantxdetalles(codProducto, id_comprobante, precioUnit, cant) values (?,?,?,?)";
            ps=conexion.prepareStatement(sql);
            ps.setString(1, det.getIdProducto());
            ps.setString(2, det.getIdFactura());
            ps.setDouble(3, det.getSubtotal());
            ps.setInt(4, det.getCantidad());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error"+e);
            return false;
        }
    }
    
    @Override
    public String IdVenta(){
        String id = "";
        try {
            this.iniciarConexion();
            String sql="select max(id_comprobante) from comprobante";
            ps=conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                id=rs.getString(1);
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return id;
    }
    
    @Override
    public boolean ActualizarStock(int cant, String cod){
        try {
            this.iniciarConexion();
            String sql="UPDATE producto SET stock=? WHERE  codProducto=?";
            ps=conexion.prepareStatement(sql);
            ps.setInt(1, cant);
            ps.setString(2, cod);
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error"+e);
            return false;
        }
    }

}
