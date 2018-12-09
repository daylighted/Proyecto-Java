
package modulo3tiquetera;

import java.util.Scanner;
import java.io.*;

public class CLS_Procesos {
    public static String Tik[] = new String[100];
    public static Scanner teclado = new Scanner(System.in);
    
    public void Init(){
        for(int i=0; i>100; i++){
            Tik[i] = "";
        }
    }
    public void Load(){
        int i=0;
        try{
            
            FileInputStream archivo = new FileInputStream("C:/Test.txt");
            DataInputStream entrada = new DataInputStream(archivo);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));   
            String strLinea;          
            while ((strLinea = buffer.readLine()) != null && i<100){               
                     
                     Tik[i] = strLinea;  
                     i++;
                     
            }
            entrada.close();
        }catch (Exception e){ 
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
        /*for(int c=0; c<100; c++){
          System.out.println(Tik[c]);
        }*/
     
    }
    //Muestra los primeros 3 valores
    public void Visual(){
        for(int x=0;x<3;x++){
           if(Tik[x] != ("")){
           System.out.println(Tik[x] + " En Caja 1");  
       }
       }
        //Ordena 3 veces el arreglo para mostrar los proximos 3 valores
       for(int x=0;x<3;x++){
           if(Tik[x] != ("")){
           //System.out.println("Mostrar los proximos 3: Y/N");
           //Nes = teclado.next();
           Ordenar();  
           Ordenar(); 
           Ordenar(); 
           x=3;
           }
       }
      
    }
    public static void Ordenar(){
         //Ordena el arreglo 
         for(int i=0;i<99;i++){
             Tik[i] = Tik[i+1];            
         }
         Tik[99] = "";
         
     }
     public void Reload(){
         //Llena nuevamente el arreglo con "" y luego recarga el archivo de texto para buscar cambios
         Init();
         Load();
     }
}

