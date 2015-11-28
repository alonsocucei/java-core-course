public class ImpresionArreglosMetodo {
    public static void main(String[] args) {
        int[] enteros = {4, 3, 12, 42, 234, 1, 10};
        
        imprimirArreglo(enteros);
    }
    
    public static void imprimirArreglo(int[] arreglo) {
        System.out.print("[");
        
        for(int contador = 0; contador < arreglo.length; contador ++) {
            System.out.print(arreglo[contador]);
            
            if (contador != arreglo.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
        
    }
}
