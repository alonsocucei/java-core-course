/**
 *
 * @author jjsanche
 */
public class TestStrings {
    public static void main(String[] args) {
        String texto = "Hermetico: persona que se reusa al trato social con las demas personas.";
        
        char c = texto.charAt(texto.length() - 1);
        System.out.println(c);
        System.out.println(texto.length());
        System.out.println(texto.indexOf('p'));
        System.out.println(texto.lastIndexOf('p'));
        
        System.out.println(texto.startsWith("Her"));
        System.out.println(texto.startsWith("Him"));
        System.out.println(texto.contains("usa al t"));
        System.out.println(texto.contains("personaque"));
        
        String nombre = "Alonso";
        System.out.println(nombre.equalsIgnoreCase("ALONSO"));
        System.out.println(nombre.equalsIgnoreCase("alonso"));
        System.out.println(nombre.equalsIgnoreCase("aLoNsO"));
        
        System.out.println(nombre.equals("ALONSO"));
        System.out.println(nombre.equals("alonso"));
        System.out.println(nombre.equals("aLoNsO"));
        
        System.out.println(nombre);
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre);
        System.out.println(nombre.substring(2));
        System.out.println(nombre.substring(2, 6));
        
        System.out.println(nombre.replace('o', '-'));
        System.out.println(nombre.replaceAll("lon", "Juan"));
        
        int n = 1110;
        String ns = String.valueOf(n);
        n = Integer.parseInt(ns.replace('1', '2'));
        System.out.println(n);
    }
}
