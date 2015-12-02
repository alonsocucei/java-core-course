package modulo6;
import java.util.Scanner;

public class CuentaPalabras {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int contador = 0;

        System.out.println("Escribe las palabras o letras que gustes.");
        System.out.println("Para terminar escribe la palabra salir.\n");

        if (!lector.next().equalsIgnoreCase("salir")) {
            contador++;
            
            while (!lector.next().equalsIgnoreCase("salir")) {
                contador++;
            }
        }

        System.out.println("El total de palabras escritas es de: " + contador);
    }
}
