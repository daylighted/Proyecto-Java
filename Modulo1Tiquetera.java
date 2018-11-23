package modulo1tiquetera;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Modulo1Tiquetera {

    String Tik[] = new String[100];
    public static void main(String[] args) {
        File archivo = new File("curso.txt");
        int i = 0;
        
        try{
            FileWriter escritor = new FileWriter(archivo);
            BufferedWriter buffer = new BufferedWriter(escritor);
            PrintWriter impresor = new PrintWriter(buffer);
            
            for(i=1; i<=100; i++){
                impresor.write("Número " + i);
                impresor.println();
            }
            
            impresor.close();
            buffer.close();
        } catch(IOException e) {
                            
    }
        Scanner teclado = new Scanner(System.in);
        int opcion = 1;
        while (opcion !=0 ) {
            System.out.println("1. Preferencial");
            System.out.println("2. Normal");
            System.out.println("3. Varios Tramites");           
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = teclado.nextInt();
        }
    }
    
}
