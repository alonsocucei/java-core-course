
public class AtrapaErrores {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        
        try {
            int c = a/b; //ArithmeticException -> division entre 0
            System.out.println(c);
        } catch(Exception e) {
            int c = a / 1;
            System.out.println(c);
        }

        try {
            b = Integer.parseInt("jjkds"); //NumberFormatException -> no se puede convertir a numero entero
        } catch (Exception e) {
            System.err.println("El texto no se puede convertir a numero");
        }
        
        String nombre = "";
        nombre = null;
        System.out.println(nombre);
        
        //NullPointerException -> la variable es igual a null y no puede invocar metodos o usar sus atributos
        try {
            System.out.println(nombre.length()); 
        } catch (Exception e) {
            nombre = "";
            System.out.println(nombre.length()); 
        }

        int[] numeros = {1, 2, 3};

        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        //ArrayIndexOutOfBoundsException -> el indice al que se quiere accesar esta fuera de rango
        
        try {
            System.out.println(numeros[33]);
        } catch (Exception e) {
            System.err.println("El elemento buscado no existe");
        }
    }
}
