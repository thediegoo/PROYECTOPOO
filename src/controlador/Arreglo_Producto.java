
package controlador;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import clases.Producto.Producto;
import clases.interfaces.ProductoBuscar;

public class Arreglo_Producto implements ProductoBuscar{
   private Producto vec[] = new Producto[100];
    private int con;
    
    public static String categoria1 = "Periferico de Entrada";
    public static String proveedor1 = "PR1";
    public static String categoria2 = "Periferico de Salida";
    public static String proveedor2 = "PR2";
    
    public Arreglo_Producto(){
        
        vec[0] = new Producto("P0001", "Periferico de Entrada","Teclado MX","LENOVO", "DISPONIBLE",100,50,200);
        vec[1] = new Producto("P0002", "Periferico de Salida","Parlante XY","HP", "DISPONIBLE",110,90,600);
        vec[2] = new Producto("P0003", "Periferico de Entrada","Teclado MX","LENOVO", "DISPONIBLE",100,50,100);
        vec[3] = new Producto("P0004", "Periferico de Salida","Teclado MX","LENOVO", "DISPONIBLE",100,50,200);
        vec[4] = new Producto("P0005", "Periferico de Entrada","Impresora XP","HP", "DISPONIBLE",150,80,1000);
        vec[5] = new Producto("P0006", "Periferico de Salida","Teclado MX","LENOVO", "DISPONIBLE",50,20,200);
        vec[6] = new Producto("P0007", "Periferico de Entrada","Parlante Y","LENOVO", "DISPONIBLE",100,80,300);
        vec[7] = new Producto("P0008", "Periferico de Entrada","Teclado MX","LENOVO", "DISPONIBLE",200,120,200);
        con=8;
    }
    public void adicion(Producto e){
        vec[con]=e;
        con++;
    }
    
    public int tamaño(){
        return con;
    }
    
    public Producto obtener(int pos){
        return vec[pos];
    }
    
    public void msg(String texto){
        JOptionPane.showMessageDialog(null, texto);
    }              
           
    public Producto[] getVec() {
        return vec;
    }

    public void setVec(Producto[] vec) {
        this.vec = vec;
    }

    public int getCon() {
        return con;
    }

    public void setCon(int con) {
        this.con = con;
    }
    
   @Override
    public int busca(int stock){
        int bus=-1;
        for(int i=0; i<con; i++){
            if(vec[i].getStock()==stock){
                bus=i;
                break;
            }
        }
        return bus;
    }
}
