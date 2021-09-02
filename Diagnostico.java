package Diagnostico;
import java.util.Scanner;
public class Diagnostico {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Declaramos las variables a ocupar
        //n para el número de filas
        //m para el número de columnas
        int n, m;
        //Pedimos los datos de la matriz al usuario
        System.out.print("Ingresa el número de filas: ");
        n = in.nextInt();
        System.out.print("Ingresa el número de columnas: ");
        m = in.nextInt();
        //Con estos ciclos for vamos a ir contando las filas
        //y columnas para pintar los *
        for(int i=0;i<n;i++){ 
            //Este es el for encargado de pintar los *
            for(int j=0;j<m;j++){
                System.out.print("*");
            }
            System.out.println(""); //Salto de linea
            m-=1; //Con esto vamos eliminando un * por fila
                  //para cada vez que se repita el ciclo
        }        
    }
}
