/**
 *
 * @author jjsanche
 */
public class Producto {
    private float precio;
    private String codigo;
    private String descripcion;

    public Producto(String codigo, float precio, String descripcion) {
        setPrecio(precio);
        setDescripcion(descripcion);
        setCodigo(codigo);
    }
    
    public Producto(String codigo, String descripcion) {
        setDescripcion(descripcion);
        setCodigo(codigo);
    }
    
    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
