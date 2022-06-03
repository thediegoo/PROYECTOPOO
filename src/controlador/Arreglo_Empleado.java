
package controlador;
import clases.Persona.Empleado;
import javax.swing.JOptionPane;
import clases.interfaces.InterfaceBuscar;


public class Arreglo_Empleado implements InterfaceBuscar {
    
    private Empleado vec[] = new Empleado[100];
    private int con;
    
    public  Arreglo_Empleado(){
        vec[0] = new Empleado("Luis","Ramirez",70395462,944668542,"A.v Carmen",2500, "12/12/2015");
        vec[1] = new Empleado("Diego","Cruz",70541254,95412782,"A.v 28 Julio",3500, "20/10/2021");
        vec[2] = new Empleado("Mario","Garcia",15489523,954165873,"A.v Pedro Ruiz",2800, "30/04/2021");
        vec[3] = new Empleado("Marcos","Rodriguez",75216548,954168735,"Calle Aranda",2650, "13/03/2018");
        vec[4] = new Empleado("Alvaro","Sevilla",75648921,957123584,"Jr Atahualpa",1500, "03/10/2017");
        vec[5] = new Empleado("Jham","Yovera",75489624,951357469,"A.v Mercedes Indacochea",1200, "09/07/2018");
        vec[6] = new Empleado("Alexis","Fuentes",75148935,954726816,"A.v 9 Octubre",3000, "15/09/2019");
        vec[7] = new Empleado("Fabricio","Genaro",75146892,957815463,"Calle Ramon",1800, "20/12/2021");
        vec[8] = new Empleado("Anibal","Martinez",70541298,957214862,"A.v Leoncio Prado",1200, "10/01/2022");
        con=9;
    }
    
    public void adicion(Empleado e){
        vec[con]=e;
        con++;
    }
    
    public void modifica(Empleado e, int pos){
        vec[pos]=e;
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
    
    @Override
    public int busca(int cod){
        int bus=-1;
        for(int i=0; i<tamaño(); i++){
            if(vec[i].getDni()==cod){
                bus=i;
                break;
            }
        }
        return bus;
    }
}
