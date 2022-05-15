/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.Producto;
import clases.Persona.Proveedor;
/**
 *
 * @author pc_sistemas2020
 */
public class Parlante extends Producto {
    private int potenciaSalida;
    private int cantidadAltaVoz;


    public Parlante(String codigo, String descripcion, Marca marca, Categoria categoria, 
            int stock, double precio, double peso, Color color, Proveedor proveedor, 
            int potenciaSalida, int cantidadAltaVoz) {
        super(codigo, descripcion, marca, categoria, stock, precio, peso, color, proveedor);
        this.potenciaSalida = potenciaSalida;
        this.cantidadAltaVoz = cantidadAltaVoz;
        
    }

    /**
     * @return the potenciaSalida
     */
    public int getPotenciaSalida() {
        return potenciaSalida;
    }

    /**
     * @param potenciaSalida the potenciaSalida to set
     */
    public void setPotenciaSalida(int potenciaSalida) {
        this.potenciaSalida = potenciaSalida;
    }

    /**
     * @return the cantidadAltaVoz
     */
    public int getCantidadAltaVoz() {
        return cantidadAltaVoz;
    }

    /**
     * @param cantidadAltaVoz the cantidadAltaVoz to set
     */
    public void setCantidadAltaVoz(int cantidadAltaVoz) {
        this.cantidadAltaVoz = cantidadAltaVoz;
    }

    
    
}
