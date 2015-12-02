package modulo7;
import java.util.Arrays;


public class ImpresionArreglos {

    public static void main(String[] args) {
        int valores[] = {10, 20, 30, 40, 27, 90};
        
        System.out.print("[");
        for(int contador = 0; contador < valores.length; contador ++) {
            System.out.print(valores[contador]);
            
            if (contador != valores.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        System.out.println(Arrays.toString(valores));
    }
}
