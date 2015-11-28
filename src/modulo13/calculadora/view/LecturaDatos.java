package calculadora.view;

import java.util.Scanner;

public class LecturaDatos {
    public static int preguntaEntero() {
        Scanner lector = new Scanner(System.in);
        System.out.print("Dame un número entero: ");
        
        return lector.nextInt();
    }
}
