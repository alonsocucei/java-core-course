/**
 *
 * @author jjsanche
 */
public class Wrappers {
    public static void main(String[] args) {
        int numero = 35;
        
        System.out.println(Integer.toBinaryString(numero));
        System.out.println(Integer.toOctalString(numero));
        System.out.println(Integer.toHexString(numero));
        System.out.println(Integer.valueOf("55", 6));
        
    }
}
