package lista_v12;

import java.util.Scanner;

public class EstNodo {

    Scanner sc = new Scanner(System.in);

    private static class Nodo { //estructura del nodo

        String name;
        Nodo next;
    }
    Nodo top = null;
    Nodo temp = null;
    Nodo anterior = null;

    public void add_inicial() { //metodo para nodo inicial
        if (top==null){
            top = new Nodo ();
            System.out.print("Ingresa un dato: ");
            top.name = sc.nextLine();
            top.next = null;
            System.out.println("Dato agregado");
        } else{
            System.out.println("Ya existe nodo inicial");
        }
    }
    
    public void back(){ //metodo para nodo antes de inicio
        if(top==null){
            System.out.println("No existe nodo inicial");
        } else{
            anterior = top;
            Nodo temp;

            temp = new Nodo ();
            System.out.print("Ingresa un dato: ");
            temp.name = sc.nextLine();
            temp.next = top;
            top = temp;
            System.out.println("Dato agregado");
        }
    }
    
    public void next(){ //metodo para nodo despues de inicio
        if(top==null){
            System.out.println("No existe nodo inicial");
        } else{
            
            temp = new Nodo ();
            System.out.print("Ingresa un dato: ");
            temp.name = sc.nextLine();
            temp.next = null;

            Nodo temp2;

            temp2 = top;
            anterior = top;
            while (temp2.next != null)
               temp2 = temp2.next;

            temp2.next = temp;
            System.out.println("Dato agregado");
        }
    }
    
    public void inter(){ //metodo para agregar nodo despues de otro en especifico
        if(top==null){
            System.out.println("No existe nodo inicial");
        } else{
            anterior = top;
            temp = new Nodo ();
            System.out.print("Ingresa un dato: ");
            temp.name = sc.nextLine();

            Nodo temp2 = top;
            System.out.print("Ingresa el dato anterior de donde se guardara el nodo: ");
            String dato = sc.nextLine();
            
            Nodo buscar = new Nodo();
            buscar =top;
            boolean encontrado=false;
            while(buscar!=null && encontrado!=true){
                if(dato.equals(buscar.name)){
                    encontrado=true;
                }
                buscar=buscar.next;
            }
            if(encontrado==true){
                while (temp2.name.equals (dato) == false){
                    temp2 = temp2.next;
                }

                temp.next = temp2.next;
                temp2.next = temp; 
                System.out.println("Dato agregado");
            } else{
                System.out.println("No existe nodo con ese dato");
            }
        }
    }
    
    public void show(){ // metodo para mostrar nodos
        System.out.println();
        Nodo topNodo = top;
        if(topNodo==null){
            System.out.println("No hay nodos para mostrar");
        } else{
                while (topNodo != null) {
                    System.out.println("Dato ["+topNodo.name+"]");
                    topNodo = topNodo.next;
                }
        }
    }
        
    public void delete(){ //MÉTODO BORRAR 
        System.out.println("Dato eliminado...");
        if(top.next==null){ //si tope.next es null, es porque solo hay un nodo
            top = null; //dejamos tope null y así borramos el único nodo
        } else{ //si tope.next NO es null, hay dos o más nodos
            top=anterior; //tope pasará a ser el nodo anterior a él
            anterior=anterior.next; //anterior pasa a ser el nodo anterior al dato que tenía
        }
    }
}
