/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.Producto;

import clases.Producto.Categoria;
import clases.Producto.Marca;
import clases.Producto.Producto;
import clases.Persona.Proveedor;
/**
 *
 * @author pc_sistemas2020
 */
public class Impresora extends Producto{
    
     private int velocidadImpresion;
    private String tamanioPapel;
    //USB, conexion inhablambrica
    private String tipoConexion;
    

    public Impresora(String codigo, String descripcion, Marca marca, Categoria categoria, 
                    int stock, double precio, double peso,Color color,Proveedor proveedor,
                    int velocidadImpresion, String tamanioPapel, String tipoConexion) 
    {
        super(codigo, descripcion, marca, categoria, stock, precio, peso, color, proveedor);
        this.velocidadImpresion = velocidadImpresion;
        this.tamanioPapel = tamanioPapel;
        this.tipoConexion = tipoConexion;        
    }

    /**
     * @return the velocidadImpresion
     */
    public int getVelocidadImpresion() {
        return velocidadImpresion;
    }

    /**
     * @param velocidadImpresion the velocidadImpresion to set
     */
    public void setVelocidadImpresion(int velocidadImpresion) {
        this.velocidadImpresion = velocidadImpresion;
    }

    /**
     * @return the tamanioPapel
     */
    public String getTamanioPapel() {
        return tamanioPapel;
    }

    /**
     * @param tamanioPapel the tamanioPapel to set
     */
    public void setTamanioPapel(String tamanioPapel) {
        this.tamanioPapel = tamanioPapel;
    }

    /**
     * @return the tipoConexion
     */
    public String getTipoConexion() {
        return tipoConexion;
    }

    /**
     * @param tipoConexion the tipoConexion to set
     */
    public void setTipoConexion(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }

    
}
