package modulo10;

public class SumaConWrappers {

    public static void main(String[] args) {
        int numero1;
        int numero2;
        
        numero1 = Integer.parseInt(args[0]);
        numero2 = Integer.parseInt(args[1]);
        
        System.out.println("La suma de " + numero1 + " + " + numero2 + " es: " + (numero1 + numero2));
    }
}
