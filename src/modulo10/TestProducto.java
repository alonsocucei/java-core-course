package modulo10;
/**
 *
 * @author jjsanche
 */
public class TestProducto {
    public static void main(String[] args) {
        Producto producto1 = new Producto("PXX1", 10, "Pinguinos");
        Producto producto2 = new Producto("PXX2", 10, "Submarinos");
        Producto producto3 = new Producto("PXX3", "Donas Bimbo");
        
        producto3.setPrecio(15);
        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);
    }
}
