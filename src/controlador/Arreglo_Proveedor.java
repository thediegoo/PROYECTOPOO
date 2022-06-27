package controlador;
import clases.Persona.Proveedor;
import java.io.Serializable;
import java.util.ArrayList;

public class Arreglo_Proveedor implements Serializable{
    
    private ArrayList<Proveedor> prov;
    
    public Arreglo_Proveedor(){
        prov = new ArrayList();
    }
    public Proveedor getProveedor(int i){
        return prov.get(i);
    }
    public int numeroProveedores(){
        return prov.size();
    }
    public int busca(String codigo){
         for(int i=0; i<numeroProveedores(); i++){
            if(codigo.equalsIgnoreCase(getProveedor(i).getRUT()))
                return i;
        }
         return -1;
    }
}
