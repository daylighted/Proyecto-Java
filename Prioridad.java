package modulo1tiquetera;
import java.io.*;

public class Prioridad {
    
    public String P;
    public int K = 0;
    public int K2 = 0;
    public int K3 = 0;
    public static String Tik[] = new String[100];
    
    
    
    public void Prioridades(){
        
        for(int i=0;i<100;i++){  
            Tik[i] = "P" + K++;
            File archivo = new File("C:/Ticket.txt");
        
        
        try{
            FileWriter escritor = new FileWriter(archivo,true);
            BufferedWriter buffer = new BufferedWriter(escritor);
            PrintWriter impresor = new PrintWriter(buffer);
            
            for(i=0; i<100; i++){
                impresor.write("Ticket " + Tik[i]);
                impresor.println();
                i = 100;
            }
            
            impresor.close();
            buffer.close();
        } catch(IOException e) {
            
    }
            i = 100;  
        }
        
    }
    public void Normal(){
        for(int i=0; i<100; i = i++){
            Tik[i] = "N" + K2++;
            File archivo = new File("C:/Ticket.txt");
                     
        try{
            FileWriter escritor = new FileWriter(archivo, true);
            BufferedWriter buffer = new BufferedWriter(escritor);
            PrintWriter impresor = new PrintWriter(buffer);
            
            for(i=0; i<100; i=i+3){
                impresor.write("Ticket " + Tik[i]);
                impresor.println();
                i = 100;
            }
            
            impresor.close();
            buffer.close();
        } catch(IOException e) {
            
    }
            i=100;
            
        }
     
    }
    
    public void Multi(){
        for(int i=0; i<100; i++){
            Tik[i] = "M" + K3++;
            
            
             File archivo = new File("C:/Ticket.txt");             
        try{
            FileWriter escritor = new FileWriter(archivo,true);
            BufferedWriter buffer = new BufferedWriter(escritor);
            PrintWriter impresor = new PrintWriter(buffer);
            
            for(i=0; i<100; i= i + 5){
                impresor.write("Ticket " + Tik[i]);
                impresor.println();
                i= 100;
            }
            
            impresor.close();
            buffer.close();
        } catch(IOException e) {
            
    }
            i= 100;
        }
    }
    public void mostrar(){
        for(int i=0; i<100; i++){
            System.out.println(Tik[i]);
        }
    }
   
}
