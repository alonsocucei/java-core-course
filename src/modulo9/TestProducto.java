package modulo9;
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
        System.out.println("precio: " + producto1.getPrecio() + " codigo: " + 
                producto1.getCodigo() + " descripcion: " + producto1.getDescripcion());
        System.out.println("precio: " + producto2.getPrecio() + " codigo: " + 
                producto2.getCodigo() + " descripcion: " + producto2.getDescripcion());
        System.out.println("precio: " + producto3.getPrecio() + " codigo: " + 
                producto3.getCodigo() + " descripcion: " + producto3.getDescripcion());
    }
}
