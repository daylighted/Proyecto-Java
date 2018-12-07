package modulo3tiquetera;
import java.io.*;
import java.util.Scanner;

public class Modulo3Tiquetera {
public static String Tik[] = new String[100];
public static Scanner teclado = new Scanner(System.in);
public static String Res; 

    public static void main(String[] args) {
         for(int i =0; i<100; i++){
            Tik[i] = "";
            
        }
         Load();
    }
 
    public static void Load(){
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
       /* for(int c=0; c<100; c++){
          System.out.println(Tik[c]);
        }*/
      Visual();
    }
    public static void Visual(){                            
       for(int x=0;x<3;x++){
           System.out.println(Tik[x] + "En Caja 1");            
       }
       for(int x=0;x<3;x++){
           System.out.println("Mostrar los proximos 3: Y/N");
           Res = teclado.next();
           Ordenar();  
           Ordenar(); 
           Ordenar(); 
           x=3;
       }
       for(int x=0;x<3;x++){
          
           Visual();         
       }
       
    }       
    
    public static void Ordenar(){
         
         for(int i=0;i<99;i++){
             Tik[i] = Tik[i+1];            
         }
         Tik[99] = "";
         
     }
}
