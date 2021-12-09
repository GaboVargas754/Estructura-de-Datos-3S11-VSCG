public class EstNodo {
    static class Nodo{
        int dato;
        Nodo next;
        Nodo back;
     
    }
    Nodo inicio = null;
    Nodo fin = null;

    public void add(){
        if(inicio == null){
            for(int i=0; i<500; i++){
                if(inicio==null){
                    int dato = (int)(Math.random()*500+1);
                    Nodo temp = new Nodo();
                    temp.dato = dato;
                    inicio = temp;
                    inicio.next = null;
                    inicio.back = null;
                    fin = inicio;
                } else {
                    int dato = (int)(Math.random()*500+1);
                    Nodo temp = new Nodo();
                    temp.dato = dato;
                    fin.next = temp;
                    temp.back = fin;
                    temp.next = null;
                    fin = temp;
                }
            } 
            System.out.println("Datos agregados...");
        } else {
            Nodo contador = inicio;
            int cont=0;
            while(contador!=null){ //Este contador sirve para identificar si los numeros se repiten
                cont++;  
                contador = contador.next;
            }
            for(int i=cont;i<500;i++){
                int dato = (int)(Math.random()*501);
                    Nodo temp = new Nodo();
                    temp.dato = dato;
                    fin.next = temp;
                    temp.back = fin;
                    temp.next = null;
                    fin = temp;
            }
            System.out.println("Datos agregados... ");
        }
    }
    
    public void delete(){
        if(inicio != null){
            for(int i=1; i<=500; i++){
                Nodo temp = inicio;
                int cont=0;
                while(temp!=null){ //Este contador sirve para identificar si los numeros se repiten
                    if(temp.dato==i){
                      cont++;  
                    } else {
                    }
                    temp = temp.next;
                }
                if(cont>1){
                    for(int j=cont-1;j>0;j--){
                        Nodo anterior = new Nodo();
                        Nodo actual = new Nodo();
                        anterior = null;
                        actual = inicio;
                        while(actual!=null){
                            if(actual.dato==i){
                                if(actual==inicio){
                                    inicio = inicio.next;
                                    inicio.back = null;
                                } else {
                                    anterior.next = actual.next;
                                    actual = actual.next;
                                    actual.back = anterior.back;
                                }
                            } 
                            anterior = actual;
                            actual = anterior.next;
                        }                        
                    }
                } else{
                }
            }
            System.out.println("Datos repetidos eliminados... ");
        } else {
            System.err.println("La lista está vacía");
        }
    }
    
    public void ordenar(){
        if(inicio!=null){
            for(int a=0;a<=500;a++){
            Nodo anterior = new Nodo();
            Nodo actual = new Nodo();
            anterior = inicio;
            actual = anterior.next;
                while(anterior.next!=null){
                    if(anterior.dato>actual.dato){
                    int aux = actual.dato;
                    actual.dato = anterior.dato;
                    anterior.dato = aux;
                    } else{
                    }
                anterior = actual;
                actual = actual.next;
                }
            }
            System.out.println("La lista se ha ordenado...");
        } else {
            System.err.println("La lista esta vacia");
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
                System.out.println("Dato "+i+" [ "+ show.dato + " ]");
                show = show.next;
                i++;
            }
        }
    }
}