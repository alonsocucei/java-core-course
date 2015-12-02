package modulo11;
public class CalculaSegundos {

    public static void main(String[] args) {
        final int MILISEGUNDO = 1;
        final int SEGUNDO = 1000 * MILISEGUNDO;
        final int MINUTO = 60 * SEGUNDO;
        final int HORA = 60 * MINUTO;
        final int DIA = 24 * HORA;
        
        int dias = Integer.parseInt(args[0]);
        
        System.out.println("La cantidad de milisegundos en " + dias + " días es: " + (dias * DIA));
    }
}
