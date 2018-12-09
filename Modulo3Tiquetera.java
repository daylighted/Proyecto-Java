package modulo3tiquetera;

import java.util.Scanner;

public class Modulo3Tiquetera {
//Se declara la clase que se va a llamar y el escaner
public static CLS_Procesos Proc = new CLS_Procesos();
public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        //Se llaman las clases que incializa los arreglos y carga el archivo de texto
        int opcion = 1;
        Proc.Init();
        Proc.Load();
        
        while (opcion != 0) {
            //Menu...
            System.out.println("1. Mostrar proximos 3");
            System.out.println("2. Reload");
            System.out.println("0. Salir"); 
            System.out.print("Seleccione una opcion: ");
            opcion = teclado.nextInt();
            
            switch (opcion){
                case 1:     
                Proc.Visual();
                break;
                
                case 2:
                Proc.Reload();
                break;
                
                case 0:
                
                break;                            
                              
            }
            
        }
    }
}
  
    
    
    

