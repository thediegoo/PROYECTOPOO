
package controlador;
import clases.Persona.Empleado;
import javax.swing.JOptionPane;


public class Arreglo_Empleado {
    
    private Empleado vec[] = new Empleado[100];
    private int con;
    
    public Arreglo_Empleado(){
        vec[0] = new Empleado("Luis","Ramirez",70358411,954824568,"A.v Carmen",2500, "12/12/2015");
        vec[1] = new Empleado("Luis","Bartra",70395482,954214562,"A.v Julio",3300, "16/09/2018");
        vec[2] = new Empleado("Anibal","Rodriguez",70254834,95544254,"Jr Canon",2500, "14/08/2021");
        vec[3] = new Empleado("Rodrigo","Gomez",70254168,954125568,"A.v Adolfo Ugarte",1200, "15/12/2017");
        vec[4] = new Empleado("Jham","Sevilla",708542368,954142658,"A.v Juan Guzman",1500, "10/01/2022");
        vec[5] = new Empleado("Alexis","Cruz",154786245,954135782,"A.v Leoncio Prado",2350, "08/10/2019");
        con=5;
    }

    public void adicion(Empleado e){
        vec[con]=e;
        con++;
    }
    
    public int tamaño(){
        return con;
    }
    
    public Empleado obtener(int pos){
        return vec[pos];
    }
    
    public void msg(String texto){
        JOptionPane.showMessageDialog(null, texto);
    }              
           
    public Empleado[] getVec() {
        return vec;
    }

    public void setVec(Empleado[] vec) {
        this.vec = vec;
    }

    public int getCon() {
        return con;
    }

    public void setCon(int con) {
        this.con = con;
    }
}
