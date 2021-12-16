
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MainListaDoble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estructura est = new Estructura();
        String opc;
        JOptionPane.showMessageDialog(null, "Vargas Salas Christian Gabriel", "LISTA DOBLES"
                + "", JOptionPane.PLAIN_MESSAGE);
        do{
            System.out.print("\n1. add\n2. show\n3. exit\n: ");
            switch(opc = sc.nextLine()){
                case "1":
                    est.add();
                    break;
                case "2":
                    est.show();
                    break;
            }
        }while(!opc.equals("3"));
    }
}
