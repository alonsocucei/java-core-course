package modulo5;
import java.util.Scanner;

public class Multiplo2y3_2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int entero;

        System.out.print("Dame un numero entero: ");
        entero = lector.nextInt();

        if (entero % 2 == 0 && entero % 3 == 0) {
            System.out.println("Tu numero es par y ademas es multiplo de 3");
        }
    }
}
