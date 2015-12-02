package modulo10;
/**
 *
 * @author jjsanche
 */
public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder texto = new StringBuilder("Alonso");
        
        System.out.println(texto);
        System.out.println(texto.reverse());
        System.out.println(texto);
        
        System.out.println(texto.append(" Sanchez"));
        System.out.println(texto.delete(0, 2));
        System.out.println(texto.insert(4, "Hola"));
    }
}
