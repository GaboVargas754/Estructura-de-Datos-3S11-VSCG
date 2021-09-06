package ejercicio06092021;

public class Matriz {
    private int tam;
    
    //Con este constructor asignaremos el valor de la variable instanciada de la clase Main
    //en la variable global de esta subclase
    public Matriz(int tam){
        this.tam = tam;
    }
    public void matriz(){
        //TipoDeDato[][] nombre = new TipoDeDato[tamaño][tamaño]
        int[][] mat = new int[tam][tam];
        
        //Este for anidado asignará un valor aleatorio a cada posición de la matriz
        for(int n=0; n<tam; n++){
            for(int m=0; m<tam; m++){
                mat[n][m]=(int)(Math.random()*101);
            }
        }
        //Este for anidado imprimirá la matriz
        for(int n=0; n<tam; n++){
            for(int m=0; m<tam; m++){
                System.out.print(mat[n][m] + "   ");
            }
            System.out.println();
        }
        
    }
}
