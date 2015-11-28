
public class DiaMesExcepcion {

    public static void main(String[] args) {
        int diaMes = 52;
        
        if (diaMes <= 31 && diaMes >= 1) {
            System.out.println("El día: " + diaMes + " es un día válido para un mes.");
        } else {
            throw new NumberFormatException("El día: " + diaMes + " es un día inválido para un mes.");
        }
    }
}
