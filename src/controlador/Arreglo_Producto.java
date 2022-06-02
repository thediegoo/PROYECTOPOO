
package controlador;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import clases.Producto.Producto;
import clases.interfaces.InterfaceBuscar;

public class Arreglo_Producto implements InterfaceBuscar{
   private Producto vec[] = new Producto[100];
    private int con;
    
    public static String categoria1 = "Periferico de Entrada";
    public static String proveedor1 = "PR1";
    public static String categoria2 = "Periferico de Salida";
    public static String proveedor2 = "PR2";
    
    public Arreglo_Producto(){
        
        vec[0] = new Producto(1, "Periferico de Entrada","Teclado MX","LENOVO", "DISPONIBLE",100,50,200);
        vec[1] = new Producto(2, "Periferico de Salida","Parlante XY","HP", "DISPONIBLE",110,90,600);
        vec[2] = new Producto(3, "Periferico de Entrada","Teclado MX","LENOVO", "DISPONIBLE",100,50,100);
        vec[3] = new Producto(4, "Periferico de Salida","Teclado MX","LENOVO", "DISPONIBLE",100,50,200);
        vec[4] = new Producto(5, "Periferico de Entrada","Impresora XP","HP", "DISPONIBLE",150,80,1000);
        vec[5] = new Producto(6, "Periferico de Salida","Teclado MX","LENOVO", "DISPONIBLE",50,20,200);
        vec[6] = new Producto(7, "Periferico de Entrada","Parlante Y","LENOVO", "DISPONIBLE",100,80,300);
        vec[7] = new Producto(8, "Periferico de Entrada","Teclado MX","LENOVO", "DISPONIBLE",200,120,200);
        con=8;
    }
    public void adicion(Producto e){
        vec[con]=e;
        con++;
    }
    
    public void modifica(Producto p, int pos){
        vec[pos]=p;
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
    public int busca(int cod){
        int bus=-1;
        for(int i=0; i<tamaño(); i++){
            if(vec[i].getCodigo()==cod){
                bus=i;
                break;
            }
        }
        return bus;
    }
}
