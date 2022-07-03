package controlador;

import javax.swing.JOptionPane;
import clases.Producto.Producto;
import clases.interfaces.InterfaceBuscar;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Arreglo_Producto implements Serializable{
    
//     public static String categoria1 = "Periferico de Entrada";
//     public static String proveedor1 = "PR1";
//     public static String categoria2 = "Periferico de Salida";
//     public static String proveedor2 = "PR2";
     
    public ArrayList<Producto> LISTA = new ArrayList <Producto>();
    public Producto PR;
    public DefaultTableModel model;
    String cat, nombre, marca, estado,codP;
        int cantInicial, stock, existe;
        double precio;
    
     public Arreglo_Producto(){
        LISTA = new ArrayList();
     }
     /*public void modifica(Producto p, int pos) {
        vec[pos] = p;
    }*/
     public void modifica(Producto p, int pos){
      LISTA.set(pos,p);
      }
     public void agrega(Producto nuevo){
        LISTA.add(nuevo);
    }
     public Producto getProducto(int i){
        return LISTA.get(i);
    }
     public int numeroProducto(){
        return LISTA.size();
    }
      public int busca(String codigo){
         for(int i=0; i<numeroProducto(); i++){
            if(codigo.equalsIgnoreCase(getProducto(i).getCodigo()))
                return i;
        }
         return -1;
    }
     
  
}