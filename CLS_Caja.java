package modulo2tiquetera;
import java.io.*;
import java.util.Scanner;

public class CLS_Caja {
    //Se crean 2 arreglos y una variable que incializa en 0
    public static String Tik[] = new String[100];
    public static String Temp[] = new String[100];
    public static int x=0;
    public void prueba(){
        //se incializan los dos arreglos con ""
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
                //se reemplazan todos los espacios vacios del arreglo Tik por los valores leidos del archivo "Ticket"     
                     Tik[i] = strLinea;  
                     i++;
                     
            }
            entrada.close();
        }catch (Exception e){ 
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
        //Se muestran todos los valores que fueron cargados desde el archivo de texto al arreglo
          for(int c=0; c<100 ;c++){
        System.out.println(Tik[c]);
       
   }
      
    }
     public void Caja(){
         for(int i=0;i<100;i++){ 
             /*
             Si hay un espacio con "" en Temp lo llena con la informacion de Tik, si Tik tiene algun espacio vacio ("") este no es copiado ni guardado en Temp
             */
             if(Temp[i].equals("") && Tik[i] != ("")){                   
                    Temp[i] = Tik[x];                         
                    guardar();
                    //muestra todos los datos y espacios vacios a pesar de que los espacios vacios no se guardan en el archivo de texto
                    System.out.println(Temp[i]);
                    //Ordena el arreglo llamando al metodo Ordenar
                    ordenar();
                    i=100;
             }    
               
           
        }
     }
     public void Reload(){
         //Llena nuevamente el arreglo con "" y luego recarga el archivo de texto para buscar cambios
         prueba();
         Load();
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
         //Corre todos los datos un espacio y elimina el principal
         for(int i=0;i<99;i++){
             Tik[i] = Tik[i+1];
         }
         Tik[99] = "";
        
     }
    
     }
     
