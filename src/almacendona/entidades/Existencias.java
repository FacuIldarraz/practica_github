
package almacendona.entidades;

public class Existencias {
  
    private Producto producto;
    private Integer precio;
    private Integer cantidad;

    public Existencias() {
    }

    public void registroDeVenta(){
        
    }
    
    public void existencias(){
        
    }
    
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Existencias{" + "producto=" + producto + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }
    
    
    
    
}
