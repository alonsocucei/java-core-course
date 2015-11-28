
public class ErroresComunes {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;
//        int c = a/b; //ArithmeticException -> division entre 0
//        System.out.println(c);
        
//        b = Integer.parseInt("jjkds"); //NumberFormatException -> no se puede convertir a numero entero
        
        String nombre = "";
        nombre = null;
        System.out.println(nombre);
        //NullPointerException -> la variable es igual a null y no puede invocar metodos o usar sus atributos
//        System.out.println(nombre.length()); 
        
        int[] numeros = {1, 2, 3};
        
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        //ArrayIndexOutOfBoundsException -> el indice al que se quiere accesar esta fuera de rango
//        System.out.println(numeros[33]);
    }
}
