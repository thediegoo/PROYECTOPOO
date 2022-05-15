/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.Producto;
import clases.Persona.Proveedor;
import clases.Producto.Categoria;
import clases.Producto.Marca;
import clases.Producto.Producto;

/**
 *
 * @author pc_sistemas2020
 */
public class Camara extends Producto{
   private boolean incluyeMicrofono;
   private int anguloVision ;
   private String resolucion;


    public Camara( String codigo, String descripcion, Marca marca, Categoria categoria, 
            int stock, double precio, double peso, Color color, Proveedor proveedor,
            boolean incluyeMicrofono, int anguloVision, String resolucion) {
        super(codigo, descripcion, marca, categoria, stock, precio, peso, color, proveedor);
        this.incluyeMicrofono = incluyeMicrofono;
        this.anguloVision = anguloVision;
        this.resolucion = resolucion;
        
    }

    /**
     * @return the incluyeMicrofono
     */
    public boolean isIncluyeMicrofono() {
        return incluyeMicrofono;
    }

    /**
     * @param incluyeMicrofono the incluyeMicrofono to set
     */
    public void setIncluyeMicrofono(boolean incluyeMicrofono) {
        this.incluyeMicrofono = incluyeMicrofono;
    }

    /**
     * @return the anguloVision
     */
    public int getAnguloVision() {
        return anguloVision;
    }

    /**
     * @param anguloVision the anguloVision to set
     */
    public void setAnguloVision(int anguloVision) {
        this.anguloVision = anguloVision;
    }

    /**
     * @return the resolucion
     */
    public String getResolucion() {
        return resolucion;
    }

    /**
     * @param resolucion the resolucion to set
     */
    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

  
   
    
}
