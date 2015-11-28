
import java.util.Scanner;

public class AreaCuadradoMetodo2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int lado;
        
        preguntarLado();
        lado = lector.nextInt();
        int resultado = calcularArea(lado);
        imprimirArea(resultado);
    }
    
    public static void imprimirArea(int area) {
        System.out.println("El area es: " + area + " metros cuadrados.");
    }
    
    public static void preguntarLado() {
        System.out.print("Dame el valor del lado del cuadrado: ");
    }
    
    public static int calcularArea(int lado) {
        int area = lado * lado;
        
        if (lado < 1) {
            return 0;
        }
        
        return area;        
    }
}
