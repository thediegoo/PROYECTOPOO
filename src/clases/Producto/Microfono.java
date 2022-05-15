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
 public class Microfono extends Producto {
     
     private String tipoConexion;
     private String Modelo;
 
    public Microfono(String codigo, String descripcion, Marca marca, Categoria categoria, 
            int stock, double precio, double peso,Color color,Proveedor proveedor,
            String modelo, String tipoConexion) {
        super(codigo, descripcion, marca, categoria, stock, precio, peso, color, proveedor);
        this.Modelo = Modelo;
        this.tipoConexion = tipoConexion;
    }    

    public String getTipoConexion() {
        return tipoConexion;
    }

    public void setTipoConexion(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
        
}
