package nodoos;

import java.util.Scanner;

public class Nodos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EstNodo ed = new EstNodo();
        String opc;
        do{
            System.out.print("\n1. add\n2. set\n3. delete\n4. exit\n: ");
            switch(opc = sc.nextLine()){
                case "1":
                    ed.add();
                    break;
                case "2":
                    ed.show();
                    break;
                case "3":
                    ed.delete();
                    break;
                    
            }
        }while(!(opc.equals("4")));
    }
    
}
