package modulo6;
import java.util.Scanner;
public class SumaDeNumerosConArreglos {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int cantidadDeNumeros;
        int valores[];
        int suma = 0;
        
        System.out.print("¿Cuántos números quieres sumar?: ");
        cantidadDeNumeros = lector.nextInt();
        
        valores = new int[cantidadDeNumeros];
        
        for (int i = 1; i <= cantidadDeNumeros; i ++) {
            System.out.print("Dame el valor " + i + ": ");
            valores[i - 1] = lector.nextInt();
            suma += valores[i - 1];
        }
        
        System.out.println();
        
        for (int i = 0; i < cantidadDeNumeros; i ++) {
            System.out.print(valores[i]);
            
            if (i == 0) {
                System.out.println(" + ");
            } else {
                System.out.println();
            }
        }
        
        System.out.println("_______");
        
        System.out.println(suma);
    }
}