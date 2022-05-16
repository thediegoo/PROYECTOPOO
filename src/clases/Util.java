/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author pc_sistemas2020
 */
public  class Util {
    
    public static void Escribir(String rutaArchivo,String contenido){
    
            try{
                File archivo = new File(rutaArchivo);
                //FileWriter fw = new FileWriter(archivo);
                FileWriter fw = new FileWriter(archivo, true);
                fw.write(contenido);
                
                fw.close();
                
                
            }catch(Exception ex){
                System.out.println("Error al escribir:" +  ex.getMessage());
            }
        
    }
    
    public static void Leer(String rutaArchivo) throws FileNotFoundException, IOException{
        FileReader fr = new FileReader(rutaArchivo);
        BufferedReader br = new BufferedReader(fr);
        
        String contenido = "";
        String[] cabeceraDocumento = new String[8];
        //id comprobante : F01 -00011
        //idcliente
        //idvendedor
        //fecha
        //descuento
        //igv
        //subtotal
        //total
        
        String[] detalleDocumento = new String[6];
        //idproducto
        //descripcion
        //precio
        //cantidad
        //importe
        
        while((contenido = br.readLine())!=null){
            //contenido.split(contenido).length
            cabeceraDocumento = contenido.split("|");
            detalleDocumento = contenido.split("|");
            
        }
        
        
    }
    
}
