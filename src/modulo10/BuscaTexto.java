
import java.util.Scanner;

/**
 *
 * @author jjsanche
 */
public class BuscaTexto {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String parrafo = "El 16 de Septiembre se celebra la Independencia de México.";
        String palabraABuscar;
        
        System.out.println(parrafo);
        System.out.print("Escribe una palabra que quieras buscar en el párrafo anterior: ");
        
        palabraABuscar = lector.next();
        
        if (parrafo.contains(palabraABuscar)) {
            System.out.println("Tu palabra SI está contenida en el párrafo.");
        } else {
            System.out.println("Tu palabra NO está contenida en el párrafo.");
        }
    }
}
