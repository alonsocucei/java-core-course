package modulo5;
import java.util.Scanner;

public class DiasDelMesSwitch {

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

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("El mes que elegiste tiene 31 dias.");
                break;
            case 2:
                int year;

                System.out.print("Selecciona el año: ");
                year = lector.nextInt();

                System.out.print("El mes que elegiste tiene ");

                if (year % 4 == 0) {
                    System.out.print("29");
                } else {
                    System.out.print("28");
                }

                System.out.println("  dias.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("El mes que elegiste tiene 30 dias.");
                break;
            default:
                System.err.println("El mes es invalido");
                break;
        }
    }
}
