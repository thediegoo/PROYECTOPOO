/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasventasutp;

import clases.Fecha.Fecha;
import clases.Persona.Proveedor;
import clases.Producto.Categoria;
import clases.Producto.Color;
import clases.Producto.Marca;
import clases.Producto.Producto;

/**
 *
 * @author pc_sistemas2020
 */
public class SistemasVentasUTP {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Marca m = new Marca("M001", "Pepsi");
        Categoria c = new Categoria("C001", "Bebida");
        Color color = new Color("COL01", "Rojo");
        Fecha fechaProveedor = new Fecha(25,04,2021);
        
        Proveedor proveedor = new Proveedor("Mejesa", "20555841095", "Ivan", "Atanacio", 
                new Fecha(25, 4, 2021), 46631233, 5853374, "");
        Producto p = new Producto("PC001", "manzana", m, c, 10, 10, 10, color,proveedor);
        System.out.println(p.generarCodigo());
        
        System.out.println(p.imprimir());
    }
    
}
