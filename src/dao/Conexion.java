package dao;

import java.sql.*;

public class Conexion {
    protected Connection conex;
    private String xurl="jdbc:mysql://localhost/peritec";    
    private String xusu="root";
    private String xclave="";
    public void iniciarConexion() throws SQLException{
        try{
            conex = DriverManager.getConnection(xurl,xusu,xclave);
        }catch(SQLException ex){
            System.out.println("Error de conexion");
        }
    }
}
