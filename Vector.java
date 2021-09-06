package ejercicio06092021;

public class Vector {
    private int tam, suma=0;
    
    public Vector(int tam){
        this.tam = tam;
    }
    
    public void vector(){
        //TipoDeDato[] nombre = new TipoDeDato[tamaño]
        int[] vec = new int[tam];
        
        //Con este for se van a asignar los valores para cada posición del vector
        for(int n=0; n<tam; n++){
            int numero = 0;
            //Este while se va a encargar que los valores sean números mayores de 100 y el método math
            //que sean numeros menores o igual a 200
            while(numero <100){
                numero = (int)(Math.random()*201);
            }
            vec[n]=numero;
            suma = suma + numero;
        }
        
        //Este for se encarga de mostrarnos los datos del vector
        for(int n=0; n<tam; n++){
            System.out.print(vec[n] + "     ");
        }
        System.out.println("\nLa suma de todos los datos del vector es: "+suma);
    }
}
