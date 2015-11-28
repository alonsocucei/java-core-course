
import java.util.Scanner;

public class PromedioEdades {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        float promedioEdades;
        int cantidadEdades;
        
        System.out.print("Cuántos edades quieres promediar? : ");
        cantidadEdades = lector.nextInt();
        int edades[] = new int[cantidadEdades];
        
        for (int contador = 0; contador < edades.length; contador ++) {
            System.out.print("Dame la edad de la persona " + (contador + 1) + ": ");
            edades[contador] = lector.nextInt();
        }
        
        float suma = 0;
        
        for (int contador = 0; contador < edades.length; contador ++) {
            suma += edades[contador];
        }
        
        promedioEdades = suma / edades.length;
        System.out.println("El promedio de edades es: " + promedioEdades);
        System.out.println("La longitud del arreglo es: " + edades.length);
    }
}
