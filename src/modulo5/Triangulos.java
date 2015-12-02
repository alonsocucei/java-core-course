package modulo5;
import java.util.Scanner;

public class Triangulos {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int lado1;
        int lado2;
        int lado3;

        System.out.print("Dame el tamaño del primer lado: ");
        lado1 = lector.nextInt();

        System.out.print("Dame el tamaño del segundo lado: ");
        lado2 = lector.nextInt();

        System.out.print("Dame el tamaño del tercer lado: ");
        lado3 = lector.nextInt();

        if (lado1 > 0 && lado2 > 0 && lado3 > 0) {
            if (lado1 == lado2 && lado3 == lado2) {
                System.out.println("El triángulo es equilatero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("El triángulo es isóceles.");
            } else {
                System.out.println("El triángulo es escaleno.");
            }
        } else {
            System.out.println("Algún lado es inválido.");
        }
    }
}
