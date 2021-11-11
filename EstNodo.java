package nodoos;
import java.util.Scanner;

public class EstNodo {
    Scanner sc = new Scanner(System.in);
    
    //creamos la estructura del nodo
    static class Nodo{
        String dato;
        Nodo next;
    }
    
    Nodo tope=null; //en el nodo tope se irán almacenando los nodos anteriores
    Nodo anterior=null; //en este nodo se almacenará el nodo anterior al tope
                        //en caso de estar null es porque solo hay un nodo o no hay ningún nodo 
    Nodo temp; //este nodo nos permitirá ir agregando nodos
    
    public void add(){ //MÉTODO AGREGAR
        System.out.print("Ingresa dato: ");
        if(tope==null){ //si el tope está null es porque este será el primer nodo
            tope = new Nodo(); 
            tope.dato = sc.nextLine(); 
            tope.next = null; //indicamos que después de éste, no hay otro nodo
        } else{ //si el tope NO es null, es porque ya hay uno o más nodos
            anterior=tope; //almacenamos el nodo tope como el anterior ya que se va a ingresar
                           //un nuevo nodo
            temp = new Nodo();
            temp.dato = sc.nextLine();
            temp.next = tope;
            tope = temp; //indicamos que el nodo tope ahora será el nodo temporal
        }
    }
    
    public void show(){ //MÉTODO MOSTRAR
        Nodo show = new Nodo(); //creamos un nodo que nos ayude a mostrar el contenido
        show = tope; //el nodo show tomará el valor de tope (así no afectamos a tope)
        if(show==null){ //si show es null, es porque no hay ningún dato
            System.out.println("No hay ningun nodo");
        } else { //si show NO es null es porque si hay nodos
            while(show!=null){ //mientras show sea diferente de null
                System.out.println("DATO-> "+show.dato); //mostrará el contenido de show
                show = show.next; //y este irá pasando al siguiente nodo, así hasta llegar al final
            }
        }
    }
    
    public void delete(){ //MÉTODO BORRAR
        System.out.println("Dato eliminado...");
        if(tope.next==null){ //si tope.next es null, es porque solo hay un nodo
            tope = null; //dejamos tope null y así borramos el único nodo
        } else{ //si tope.next NO es null, hay dos o más nodos
            tope=anterior; //tope pasará a ser el nodo anterior a él
            anterior=anterior.next; //anterior pasa a ser el nodo anterior al dato que tenía
        }
    }
}
