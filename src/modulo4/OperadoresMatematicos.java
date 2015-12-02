package modulo4;
public class OperadoresMatematicos {
    public static void main(String[] args) {
        double x = 10;
        double y = 15;
        
        double suma = x + y;
        double division = x / y;
        System.out.println("La suma de " + x + " y " + y + " es: " + suma);
        System.out.println("La resta de " + x + " y " + y + " es: " + (x - y));
        System.out.println("La multiplicacion de " + x + " y " + y + " es: " + (x * y));
        System.out.println("La division de " + x + " y " + y + " es: " + division); 
    
        byte z = 100;
        byte zz = 50;
        int a = z + zz;
        int b = 1000; //promotion
        System.out.println("El valor de a es: " + a);
        System.out.println("El valor de b es: " + b);
        
        byte zzz = (byte) b; //casting
        System.out.println("El valor de zzz es: " + zzz);
    }
}
