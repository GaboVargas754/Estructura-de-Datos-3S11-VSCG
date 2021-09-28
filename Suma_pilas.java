package estructuras_lineales;
import java.util.Scanner;

public class Suma_pilas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tam, opcion, topeA=0, topeB=0, sumaC=0;
        System.out.print("Ingresa el tamaño de las pilas: "); //pedimos el tamaño de las pilas
        tam = sc.nextInt();
        int[] pilaA = new int[tam]; //creamos las pilas
        int[] pilaB = new int[tam];
        int[] pilaC = new int[tam];
        
        do{ // el do-while para que el ciclo se repita hasta que sea detenido
            System.out.print("\n1. Llenar pila A y pila B\n"
                    + "2. Mostrar pila A y pila B\n"
                    + "3. Vaciar pila A y pila B\n"
                    + "4. Unir pilas (sumar pila A y pila B)\n"
                    + "5. Mostrar pila C\n"
                    + "6. Salir\n:");
            switch(opcion=sc.nextInt()){
                case 1:
                    if(topeA==0){// si el tope está vacío, la pila A se llena
                        for(int i=0;i<tam;i++){
                            pilaA[i]=(int)(Math.random()*100+1);
                            topeA++;
                        }
                        System.out.println("Llenando pila A ...");
                    } else{ //sino la pila está llena
                        System.out.println("Pila A Llena");
                        break;
                    }
                    if(topeB==0){ // si el tope está vacío, la pila B se llena
                        for(int i=0;i<tam;i++){
                            pilaB[i]=(int)(Math.random()*101+100);
                            topeB++;
                        }
                        System.out.println("Llenando pila B ...");
                    } else{ //sino la pila está llena
                        System.out.println("pila B LLena");
                        break;
                    }
                    break;
                case 2:
                    if(topeA!=0 && topeB!=0){ // si los topes están llenos, entonces mostramos las pilas 
                        System.out.println("Pila A"); //mostramos pila A
                        for(int i=tam-1;i>=0;i--){
                            System.out.println(pilaA[i]);
                        }
                        System.out.println("\nPila B"); //mostramos pila B
                        for(int i=tam-1;i>=0;i--){
                            System.out.println(pilaB[i]);
                        }
                    } else{ // si los topes están vacíos, las pilas están vacías
                        System.out.println("Pila A vacía\nPila B vacía");
                    }
                    break;
                case 3:
                    // vacíamos los topes
                    topeA=0;
                    topeB=0;
                    System.out.println("Datos eliminados de Pila A y Pila B");
                    break;
                case 4:
                    if(topeA!=0 && topeB!=0){ //si las pilas A y B están llenas, sumamos la pila C
                        sumaC=tam;
                        for(int i=0;i<tam;i++){
                            pilaC[i]=pilaA[sumaC-1]+pilaB[sumaC-1];
                            sumaC--;
                        } 
                    } else{ //sino no hay valores para sumar
                        System.out.println("No hay valores para sumar");
                    }
                    break;
                case 5:
                    //mostramos pila C
                    System.out.println("Pila C");
                    if(topeA!=0 && topeB!=0){
                        for(int i=tam-1;i>=0;i--){
                            System.out.println(pilaC[i]);
                        }
                    } else{
                        System.out.println("No se a creado pila C");
                    }
                case 6:
                    //Se cierra el ciclo
                    break;
            }
        }while(opcion!=6);
    }
}
