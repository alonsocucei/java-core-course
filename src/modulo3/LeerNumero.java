
import java.io.IOException;


public class LeerNumero {
    public static void main(String[] args) throws IOException {
        int numeroEntero;
        System.out.println("Dame un numero: ");
        numeroEntero = System.in.read();
        numeroEntero = numeroEntero - 48;
        System.out.println("Tu numero es: " + numeroEntero);
    }
}
