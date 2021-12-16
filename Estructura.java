
import java.util.Scanner;

public class Estructura {
    Scanner sc = new Scanner(System.in);
    int ID = 1;
    static class Nodo{
        int id;
        String tipo;
        String marca;
        String precio;
        Nodo next;
        Nodo back;
    }
    
    Nodo inicio = null;
    Nodo fin = null;
    
    public void add(){
        if(inicio==null){
            Nodo temp = new Nodo();
            temp.id = ID++;
            System.out.println("Ingresa el Tipo:");
            temp.tipo = sc.nextLine();
            System.out.println("Ingresa la Marca:");
            temp.marca = sc.nextLine();
            System.out.println("Ingresa el Precio:");
            temp.precio = sc.nextLine();
            inicio = temp;
            inicio.next = null;
            inicio.back = null;
            fin = inicio;
        } else {
            Nodo temp = new Nodo();
            temp.id = ID++;
            System.out.println("Ingresa el Tipo:");
            temp.tipo = sc.nextLine();
            System.out.println("Ingresa la Marca:");
            temp.marca = sc.nextLine();
            System.out.println("Ingresa el Precio:");
            temp.precio = sc.nextLine();
            fin.next = temp;
            temp.back = fin;
            temp.next = null;
            fin = temp;
        }
    }
    
    public void show(){
        Nodo show = new Nodo();
        show = inicio;
        if(show==null){
            System.err.println("La lista esta vacia");
        } else {
            int i = 1;
            while(show!=null){
                System.out.println("ID "+show.id+" | Marca "+show.marca+" "
                        + "| Tipo "+show.tipo+" | Precio "+show.precio);
                show = show.next;
                i++;
            }
        }
    }
}
