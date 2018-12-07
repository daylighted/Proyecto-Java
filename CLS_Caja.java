package modulo2tiquetera;
import java.io.*;
import java.util.Scanner;

public class CLS_Caja {
    public static String Tik[] = new String[101];
    public static String Temp[] = new String[101];
    
    public void prueba(){
        for(int i =0; i<100; i++){
            Tik[i] = "";
            Temp[i] = "";
            
        }
    }
     public void Load(){
        int i=0;
        try{
            
            FileInputStream archivo = new FileInputStream("C:/Ticket.txt");
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
          for(int c=0; c<100 ;c++){
        System.out.println(Tik[c]);
       
   }
      
    }
     public void Caja(){
         for(int i=0;i<=100;i++){ 
             if(Temp[i].equals("")){
                    System.out.println(Tik[i]);
                    Temp[i] = Tik[i];                  
                    guardar();
                    ordenar();
                    i=100;
             }    
               
           
        }
     }
       
     public void guardar(){
         File archivo = new File("C:/Test.txt");
        
        
        try{
            FileWriter escritor = new FileWriter(archivo);
            BufferedWriter buffer = new BufferedWriter(escritor);
            PrintWriter impresor = new PrintWriter(buffer);
            
            for(int i=0; i<100; i++){
                impresor.write(Temp[i]);
                impresor.println();
            }
            
            impresor.close();
            buffer.close();
        } catch(IOException e) {
            
        }
     }
     public void mostrar(){
         for(int i=0;i<100;i++){
             System.out.println(Temp[i]);
         }
     }
     public void ordenar(){
         
         for(int i=0;i<99;i++){
             Tik[i] = Tik[i+1];
         }
         Tik[99] = "";
         /*for(int i=0; i<98; i++){
             Temp[i] = Temp[i+1];
         }
         Temp[0] = "";*/
     }
    
     }
     
