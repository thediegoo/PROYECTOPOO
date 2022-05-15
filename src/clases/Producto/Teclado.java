/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.Producto;

import clases.Persona.Proveedor;

/**
 *
 * @author Usuario
 */
public class Teclado extends Producto{
    private boolean iluminacion;
    private String tipoConexion;
     
    public Teclado( String codigo, String descripcion, Marca marca, Categoria categoria, 
            int stock, double precio, double peso, Color color,Proveedor proveedor,String tipoConexion,
            boolean iluminacion) {
        super(codigo, descripcion, marca, categoria, stock, precio, peso, color,proveedor);
       this.iluminacion=iluminacion;
       this.tipoConexion=tipoConexion;
        
    }

    public boolean isIluminacion() {
        return iluminacion;
    }

    public void setIluminacion(boolean iluminacion) {
        this.iluminacion = iluminacion;
    }

    public String getTipoConexion() {
        return tipoConexion;
    }

    public void setTipoConexion(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }
    
    
}
