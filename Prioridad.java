package modulo1tiquetera;
import java.io.*;

public class Prioridad {
    //Declaracion de variables globales cada variable K representa un contador para cada ticket por separado
    public int K = 0;
    public int K2 = 0;
    public int K3 = 0;
    //Se crea el arreglo
    public static String Tik[] = new String[100];
    //Se incializa el arreglo con "" para que se pueda escribir en el posteriormente
    public void prueba(){
        for(int i =0; i<100; i++){
            Tik[i] = "";
            
        }
    }
    
    //Recorre el arreglo y si el espacio esta vacio introduce el valor "P" mas K que equivale a 0 y cada vez que se ejectua esta se suma de 1 en 1
    //luego de eso se guarda en un archivo de texto y termina el proceso redirigiendo al menu principal.
    public void Prioridades(){
        
        for(int i=0;i<100;i++){  
            if(Tik[i].equals("")){
            Tik[i] = "P" + K++;
            guardar();
            i = 100;
            }
        }
        
    }
    //Sucede lo mismo que en el metodo anterior con la diferencia que este cuenta en espacios de 3 en 3 en el arreglo
    public void Normal(){
        for(int i=0; i<100; i=i+3){
            if(Tik[i].equals("")){
            Tik[i] = "N" + K2++;  
            guardar();
            i = 100;          
            }
        }
     
    }
    //Lo mismo que en los dos anteriores con la diferencia que este cuenta de 5 en 5
    public void Multi(){
        for(int i=0; i<100; i=i+5){
            
           if(Tik[i].equals("")){
            Tik[i] = "M" + K3++;
            guardar();
            i = 100; 
           } 
            
        }
    }
    //Metodo para verificar los datos que se estan guardando en el archivo de texto
    public void mostrar(){
        for(int i=0; i<100; i++){
            System.out.println(Tik[i]);
        }
        
    }
    //Guarda el archivo de Texto en la ruta C: 
    public void guardar(){
        File archivo = new File("C:/Ticket.txt");
                     
        try{
            FileWriter escritor = new FileWriter(archivo);
            BufferedWriter buffer = new BufferedWriter(escritor);
            PrintWriter impresor = new PrintWriter(buffer);
            
            for(int i=0; i<100; i++){
                impresor.write(Tik[i]);
                impresor.println();
               
            }
            
            impresor.close();
            buffer.close();
        } catch(IOException e) {
            
    }
    }
   
}
