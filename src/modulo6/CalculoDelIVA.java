package modulo6;
import java.util.Scanner;


public class CalculoDelIVA {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        float precio;
        float iva;
        float psiva;
        String respuesta;
        
        do {            
            System.out.print("Dame precio: ");
            precio = lector.nextFloat();
            
            iva = precio * 0.16f;
            psiva = precio - iva;
            
            System.out.println("IVA: " + iva);
            System.out.println("Precio sin IVA: " + psiva);
            
            System.out.print("Desesas ingresar otro precio? [si/no]: ");
            respuesta = lector.next();
        } while (  respuesta.equalsIgnoreCase("si")       );
        
    }
}
