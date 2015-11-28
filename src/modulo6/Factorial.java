import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero;
        
        System.out.print("Dame un numero para obtener su factorial: ");
        numero = lector.nextInt();
        
        if (numero >= 0) {
            
            if (numero == 0 || numero ==1) {
                System.out.println("El factorial es: 1");
            } else {
                for (int contador = numero - 1; contador >= 1; contador --) {
                    numero *= contador;
                }
                
                System.out.println("El factorial es: " + numero);
            }
        } else {
            System.out.println("Número inválido. Tiene que ser mayor o igual a 0.");
        }
    }
}
