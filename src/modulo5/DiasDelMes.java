import java.util.Scanner;

public class DiasDelMes {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int mes;
        
        System.out.println("1.- Enero");
        System.out.println("2.- Febrero");
        System.out.println("3.- Marzo");
        System.out.println("4.- Abril");
        System.out.println("5.- Mayo");
        System.out.println("6.- Junio");
        System.out.println("7.- Julio");
        System.out.println("8.- Agosto");
        System.out.println("9.- Septiembre");
        System.out.println("10.- Octubre");
        System.out.println("11.- Noviembre");
        System.out.println("12.- Diciembre");
        System.out.print("Selecciona un mes: ");
        mes = lector.nextInt();
        
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            System.out.println("El mes que elegiste tiene 31 dias.");
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            System.out.println("El mes que elegiste tiene 30 dias."); 
        } else if (mes == 2) {
            System.out.println("El mes que elegiste tiene 28 o 29 dias."); 
        } else {
            System.err.println("El mes es invalido");
        }
    }
}
