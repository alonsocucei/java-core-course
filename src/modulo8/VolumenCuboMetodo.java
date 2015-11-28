
import java.util.Scanner;


public class VolumenCuboMetodo {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int largo;
        int ancho;
        int alto;
        
        preguntarLado("largo");
        largo = lector.nextInt();
        
        preguntarLado("ancho");
        ancho = lector.nextInt();
        
        preguntarLado("alto");
        alto = lector.nextInt();
        
        int medidas[] = {largo, ancho, alto};
        int resultado = calcular(medidas);
        imprimirVolumen(resultado);
    }

    public static void imprimirVolumen(int volumen) {
        System.out.println("El volumen es: " + volumen + " unidades cubicas.");
    }
    
    public static void preguntarLado(String nombreLado) {
        System.out.print("Dame el valor del " + nombreLado + " del cubo: ");
    }
    
    public static int calcularVolumen(int largo, int ancho, int alto) {
        int volumen = largo * ancho * alto;
        
        if (largo < 1 || ancho < 1 || alto < 1) {
            return 0;
        }
        
        return volumen;        
    }
    
    public static int calcular(int[] datos) {
        int resultado = 1;
        
        for (int i = 0; i < datos.length; i ++) {
            resultado *= datos[i];
        }
        
        return resultado;        
    }
}
