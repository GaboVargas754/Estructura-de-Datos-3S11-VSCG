package ejercicio06092021;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingresa el tamaño de la matriz y vector: ");
        int tam = in.nextInt();
        
        System.err.println("Ejercicio 1");
        Matriz mt = new Matriz(tam);
        mt.matriz();
        
        System.err.println("\n--------------------------\n"
                + "Ejercicio 2");
        Vector vt = new Vector(tam);
        vt.vector();
        
    }
}
