
import java.util.Scanner;

/**
 *
 * @author jjsanche
 */
public class CuentaLetras {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String palabra;
        
        System.out.print("Dame una palabra pasra saber la cantidad de vocales y consonantes: ");
        palabra = lector.next();
        
        int cantidadVocales = 0;
        int cantidadConsonantes = 0;
        
        for (int i = 0; i < palabra.length(); i ++) {
            char c = palabra.charAt(i);
            
            switch(c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    cantidadVocales ++;
                    break;
                    
                default:
                    cantidadConsonantes ++;
                    break;
            }
        }
        
        System.out.println("Tu palabra tiene " + cantidadVocales + " de vocales.");
        System.out.println("Tu palabra tiene " + cantidadConsonantes + " de cosonantes.");
    }
}
