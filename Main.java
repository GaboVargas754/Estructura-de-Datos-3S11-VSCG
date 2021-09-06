package ejercicio06092021;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //Pedimos los datos al usuario
        System.out.print("Ingresa el tamaño de la matriz y vector: ");
        int tam = in.nextInt();
        
        System.err.println("Ejercicio 1");
        //instanciamos la clase Main con la subclase Matriz 
        Matriz mt = new Matriz(tam);
        mt.matriz();//traemos el método matriz de la clase Matriz
        
        System.err.println("\n--------------------------\n"
                + "Ejercicio 2");
        //instanciamos la clase Main con la subclase Vector
        Vector vt = new Vector(tam);
        vt.vector();//traemos el método vector de la clase Vector
        
    }
}
