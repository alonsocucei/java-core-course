package modulo8;
import java.util.Scanner;

public class AreaTrianguloMetodo {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        float base;
        float altura;

        preguntarMedida("base");
        base = lector.nextFloat();
        
        preguntarMedida("altura");
        altura = lector.nextFloat();
        
        float resultado = calcularAreaTriangulo(base, altura);
        imprimirArea(resultado);
    }

    public static void imprimirArea(float area) {
        System.out.println("El area es: " + area + " metros cuadrados.");
    }

    public static void preguntarMedida(String medida) {
        System.out.print("Dame el valor de la ");
        System.out.print(medida + " : ");
    }

    public static float calcularAreaTriangulo(float b, float h) {
        float area = b * h / 2;

        return area;
    }
}
