import java.util.Scanner;

public class AreaCuadradoMetodo {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int lado;
        
        preguntarLado();
        lado = lector.nextInt();
        calcularArea(lado);
    }
    
    public static void preguntarLado() {
        System.out.print("Dame el valor del lado del cuadrado: ");
    }
    
    public static void calcularArea(float lado) {
        System.out.println("El area es: " + (lado * lado) + " metros cuadrados.");
    }
}
