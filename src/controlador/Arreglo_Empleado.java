package controlador;
import clases.Persona.Empleado;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Arreglo_Empleado implements Serializable {
    
    public ArrayList<Empleado> LISTAE = new ArrayList <Empleado>();
    public Empleado EM;
    public DefaultTableModel model;
    
    public Arreglo_Empleado(){
        LISTAE = new ArrayList();
    }
        
    public void modifica(Empleado e, int pos){
        LISTAE.set(pos,e);
    }
    
    public void agrega(Empleado nuevoe){
        LISTAE.add(nuevoe);
    }
    
    public Empleado getEmpleado(int i){
        return LISTAE.get(i);
    }
    
    public int numEmpleado(){
        return LISTAE.size();
    }
    
    public Empleado buscar(int dni){
        Empleado E = null;
        boolean estado = false;
        int i = 0;
        while(i<LISTAE.size()&& estado == false){
            if (dni == LISTAE.get(i).getDni()){
                estado = true;
                E = LISTAE.get(i);
            }else{
                i++;
            }
        }
       return E;
    }
}
