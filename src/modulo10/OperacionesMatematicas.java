package modulo10;
/**
 *
 * @author jjsanche
 */
public class OperacionesMatematicas {
    public static void main(String[] args) {
        double numero = 5;
        double numero2 = 8.7;
        double numero3 = 8.2;
        
        System.out.println("La raiz cuadrada de: " + numero + " es: " + Math.sqrt(numero));
        System.out.println("ceil de: " + numero2 + " es: " + Math.ceil(numero2));
        System.out.println("ceil de: " + numero3 + " es: " + Math.ceil(numero3));
        System.out.println("floor de: " + numero2 + " es: " + Math.floor(numero2));
        System.out.println("floor de: " + numero3 + " es: " + Math.floor(numero3));
        System.out.println("round de: " + numero2 + " es: " + Math.round(numero2));
        System.out.println("round de: " + numero3 + " es: " + Math.round(numero3));
        System.out.println("min entre: " + numero2 + " y : " + numero3 + "es: " + Math.min(numero2, numero3));
        System.out.println("max entre: " + numero2 + " y : " + numero3 + "es: " + Math.max(numero2, numero3));
    }
}
