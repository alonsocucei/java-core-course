
public class ContadorDel1Al100 {
    public static void main(String[] args) {
        byte contador = 1;
        int acumulador = 0;
        
        while (contador <= 100) {
            System.out.println(contador);
            acumulador += contador;
            contador ++;
        }
        
        System.out.println("La suma es: " + acumulador);
    }
}
