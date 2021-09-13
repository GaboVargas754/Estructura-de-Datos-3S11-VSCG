package ejercicio13092021;
import java.util.Scanner;

public class Pila {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ciclo, tope=0;
        char pila[] = new char[27]; //creamos la pila
        do{ //iniciamos un ciclo do while el cual hará que se repita el ciclo hasta que 
            //seleccionemos la opción salir
            System.out.print("1. Llenar\n"
                    + "2. Eliminar\n"
                    + "3. Mostrar\n"
                    + "4. Salir\n");
            switch(ciclo=in.nextInt()){ //con este switch seleccionaremos las opciones
                case 1: //llenamos la pila desde el 0 hasta el 26
                    tope=0;
                    pila[tope]='a';tope++; pila[tope]='b';tope++; pila[tope]='c';tope++; pila[tope]='d';tope++;
                    pila[tope]='e';tope++; pila[tope]='f';tope++; pila[tope]='g';tope++; pila[tope]='h';tope++;
                    pila[tope]='i';tope++; pila[tope]='j';tope++; pila[tope]='k';tope++; pila[tope]='l';tope++;
                    pila[tope]='m';tope++; pila[tope]='n';tope++; pila[tope]='ñ';tope++; pila[tope]='o';tope++;
                    pila[tope]='p';tope++; pila[tope]='q';tope++; pila[tope]='r';tope++; pila[tope]='s';tope++;
                    pila[tope]='t';tope++; pila[tope]='u';tope++; pila[tope]='v';tope++; pila[tope]='w';tope++;
                    pila[tope]='x';tope++; pila[tope]='y';tope++; pila[tope]='z';tope++;
                    System.out.println("");
                    break;
                case 2: //iremos eliminando del 26 al 0, cuando ya no haya que eliminar, la pila se mostrará vacía
                    if(tope>0){
                        tope--;
                        System.out.println("Elemento "+tope+" eliminado\n");
                    } else{
                        System.out.println("La pila está vacía\n");
                    }
                    break;
                case 3: //mostraremos la pila 
                    for(int i=tope-1;i>=0;i--){
                        System.out.print(" "+pila[i]);
                    }
                    System.out.println("");
                    break;
                case 4: //terminamos el ciclo
                    ciclo=4;
                    break;
                default: 
                    break;
            }
        }while(ciclo!=4);
    }
}
