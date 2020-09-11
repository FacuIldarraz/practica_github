
package almacendona.entidades;

public class Pedido {
    
    private String producto;
    private Integer numeroCant;
    private Integer nroSolicitud;

    public Pedido() {
    }

    public Pedido(String producto, Integer numeroCant, Integer nroSolicitud) {
        this.producto = producto;
        this.numeroCant = numeroCant;
        this.nroSolicitud = nroSolicitud;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Integer getNumeroCant() {
        return numeroCant;
    }

    public void setNumeroCant(Integer numeroCant) {
        this.numeroCant = numeroCant;
    }

    public Integer getNroSolicitud() {
        return nroSolicitud;
    }

    public void setNroSolicitud(Integer nroSolicitud) {
        this.nroSolicitud = nroSolicitud;
    }
    
    public void recibirPedido() {
        
    }
    
    public void registrarPedido() {
        
    }

    @Override
    public String toString() {
        return "Pedido{" + "producto=" + producto + ", numeroCant=" + numeroCant + ", nroSolicitud=" + nroSolicitud + '}';
    }
    
    
}
