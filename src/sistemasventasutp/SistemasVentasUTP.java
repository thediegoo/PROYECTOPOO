package sistemasventasutp;

import clases.Fecha.Fecha;
import clases.Persona.Proveedor;
import clases.Producto.Producto;
public class SistemasVentasUTP {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Fecha fechaProveedor = new Fecha(25,04,2021);
        
        Proveedor proveedor = new Proveedor("Mejesa", "20555841095", "Ivan", "Atanacio", 
                46631233, 5853374, "");
        Producto p = new Producto("PC001", "manzana", 10, 10, 10,proveedor);
        System.out.println(p.generarCodigo());
        
        System.out.println(p.imprimir());
    }
    
}
