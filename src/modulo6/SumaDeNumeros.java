package modulo6;
import java.util.Scanner;


public class SumaDeNumeros {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int cantidadDeNumeros;
        int suma = 0;
        
        System.out.print("¿Cuántos números quieres sumar?: ");
        cantidadDeNumeros = lector.nextInt();
        
        for (int i = 1; i <= cantidadDeNumeros; i ++) {
            System.out.print("Dame el valor " + i + ": ");
            suma += lector.nextInt();
        }
        
        System.out.println("La suma es: " + suma);
    }
}
