
package modulo2tiquetera;
import java.util.Scanner;

public class Modulo2Tiquetera {
    //se declara el llamado a metodos de otra clase de manera global
public static CLS_Caja Px = new CLS_Caja();
    
    public static void main(String[] args) {
        //se encarga de ejecutar los siguientes metodos que estan en otra clase y luego pasa al menu
         Px.prueba();
         Px.Load();         
         Menu();
}
    
    public static void Menu(){
        String Res;
        Scanner teclado = new Scanner(System.in);
        
        
         int opcion = 1;
        //Menu permite mostrar los cambios y ejecutar el metodo caja para pasar los numeros de 1 en 1.
        while (opcion != 0) {
            System.out.println("1. Caja");
            System.out.println("2. Mostrar los cambios");
            System.out.println("3. Reiniciar");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = teclado.nextInt();
            
            switch (opcion){
                case 1:     
                Px.Caja();
                break;
                
                case 2:
                Px.mostrar();              
                break;
                
                case 3:
                Px.Reload();
                break;
                              
            }
            
        }
        
        
        
    }
}
