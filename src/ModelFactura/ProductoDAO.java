
package ModelFactura;

import clases.Producto.Producto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class ProductoDAO {
    
    PreparedStatement ps;
    ResultSet rs;
     
    public Producto buscarProducto(String cod){
        
        Producto pro = new Producto();
        try {
            Connection conexion= DriverManager.getConnection("jdbc:mysql://localhost/peritec", "root", "");
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
     
}
