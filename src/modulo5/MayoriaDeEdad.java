
import java.util.Scanner;

public class MayoriaDeEdad {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int edad;

        System.out.print("Dame tu edad: ");
        edad = lector.nextInt();
        
        if(edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}
