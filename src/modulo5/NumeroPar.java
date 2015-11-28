import java.util.Scanner;
public class NumeroPar {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int entero;
        
        System.out.print("Dame un numero entero: ");
        entero = lector.nextInt();
        
        if (entero % 2 == 0) {
            System.out.println("Tu numero es par");
        }
        
        if (entero % 2 == 1) {
            System.out.println("Tu numero es impar");
        }
    }
}
