package modulo12;
public class LanzamientoExcepciones {

    public static void main(String[] args) {
        int numero = -9;
        
        if (numero >= 0) {
            System.out.println("La raiz cuadrada de " + numero + " es: " + Math.sqrt(numero));
        } else {
            throw new ArithmeticException("No se puede sacar raiz cuadrada de numeros negativos");
        }
    }
}
