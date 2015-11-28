
import java.util.Scanner;

public class OperadorModulo {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int dividendo;
        int divisor;
        int cociente;
        int residuo;

        System.out.print("Dame el dividendo: ");
        dividendo = lector.nextInt();

        System.out.print("Dame el divisor: ");
        divisor = lector.nextInt();

        cociente = dividendo / divisor;
        residuo = dividendo % divisor;

        System.out.println("Al dividir " + dividendo + " entre " + divisor
                + " da como cociente " + cociente + " con un residuo de " + residuo);
    }
}
