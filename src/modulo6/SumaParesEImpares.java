package modulo6;
import java.util.Scanner;

public class SumaParesEImpares {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int cantidadDeNumeros;
        int sumaPares = 0;
        int sumaImpares = 0;
        int valor;
        
        System.out.print("¿Cuántos números quieres sumar?: ");
        cantidadDeNumeros = lector.nextInt();
        
        for (int i = 1; i <= cantidadDeNumeros; i ++) {
            System.out.print("Dame el valor " + i + ": ");
            valor = lector.nextInt();
            
            if (valor % 2 == 0) {
                sumaPares += valor;
            } else {
                sumaImpares += valor;
            }
        }
        
        System.out.println("La suma de pares: " + sumaPares);
        System.out.println("La suma de impares: " + sumaImpares);
    }
}