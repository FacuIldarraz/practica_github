
package almacendona.entidades;

public class Producto {
    
    private Integer idProducto;
    private String nombre;
    private Integer precio;
    private String Proveedor;
    private Integer cantidad;

    public Producto() {
    }
    
    public void asignacion(){
        
    }
    public void retorno(){
        
    }
    

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + ", Proveedor=" + Proveedor + ", cantidad=" + cantidad + '}';
    }
    
    
    
    
}
