
import java.util.Scanner;


public class LadosFigura {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numeroDeLados;
        
        System.out.print("Dame el # de lados de una figura: ");
        numeroDeLados = lector.nextInt();
        
        switch(numeroDeLados) {
            case 3:
                System.out.println("Es un triangulo");
                break;
            case 4:
                System.out.println("Es un cuadrado");
                break;
            default:
                System.out.println("No tengo tu figura registrada");
                break;//Este break es inecesario al no haber mas casos  siguientes
        }
    }
}
