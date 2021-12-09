import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EstNodo en = new EstNodo();
        String opc;
        JOptionPane.showMessageDialog(null, "Vargas Salas Christian Gabriel\n"
                + "Para que no de error primero ordenar nodos y"
                + " luego eliminar los nodos", "500 Nodos numericos", JOptionPane.INFORMATION_MESSAGE);
        do{
            System.out.print("\n1. agregar\n2. ordenar\n"
                    + "3. eliminar repetidos\n4. mostrar\n5. salir\n: ");
            switch(opc = sc.nextLine()){
                case "1":
                    en.add();
                    break;
                case "3":
                    en.delete();
                    break;
                case "2":
                    en.ordenar();
                    break;
                case "4":
                    en.show();
                    break;
            }
        }while(!opc.equals("5"));
    }
}