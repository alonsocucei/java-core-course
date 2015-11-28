import java.lang.*; //si no se escribe, el compilador automaticamente agrega esta linea
import java.util.Scanner;

public class LeerConScanner {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numeroEntero;
        
        System.out.print("Dame un numero: ");
        numeroEntero = lector.nextInt();
        System.out.println("Tu numero es: " + numeroEntero);
    }
}
