package modulo5;
import java.util.Scanner;


public class RangoEdades {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int edad;

        System.out.print("Dame tu edad: ");
        edad = lector.nextInt();
        
        if (edad <= 12) {
            System.out.println("niño");
        } else if (edad <= 17) {
            System.out.println("adolescente");
        } else if (edad <= 30) {
            System.out.println("chavo ruco");
        } else if(edad <=60) {
            System.out.println("mas ruco que chavo");
        } else {
            System.out.println("ruco y medio");
        }
    }
}
