package modulo1tiquetera;

import java.io.*;
import java.util.Scanner;

public class Modulo1Tiquetera {
    
    public static void main(String[] args) {
        Prioridad Px = new Prioridad();
       
        
        
       //Codigo para guardar el archivo mas adelante
       
       
        Scanner teclado = new Scanner(System.in);
        int opcion = 1;
        Px.prueba();
        while (opcion != 0) {
            System.out.println("1. Preferencial");
            System.out.println("2. Normal");
            System.out.println("3. Varios Tramites"); 
            System.out.println("4. Mostrar los cambios");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = teclado.nextInt();
            
            switch (opcion){
                case 1:     
                Px.Prioridades();
                break;
                
                case 2:
                Px.Normal();
                break;
                
                case 3:
                Px.Multi();
                break;
                
                case 4:
                Px.mostrar();
                break;
                              
            }
            
        }
    }
    
}
