/*
atributo telefono, nit, direccion, cantidad, producto, nombre proveedor
 */
package almacendona.entidades;


public class Proveedores {
    private Integer telefono;
    private Integer nit;
    private String direccion;
    private Integer cantidad;
    private Producto producto;
    private String nombreProv;

    public Proveedores() {
    }

    public Proveedores(Integer telefono, Integer nit, String direccion, Integer cantidad, Producto producto, String nombreProv) {
        this.telefono = telefono;
        this.nit = nit;
        this.direccion = direccion;
        this.cantidad = cantidad;
        this.producto = producto;
        this.nombreProv = nombreProv;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Integer getNit() {
        return nit;
    }

    public void setNit(Integer nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getNombreProv() {
        return nombreProv;
    }

    public void setNombreProv(String nombreProv) {
        this.nombreProv = nombreProv;
    }

    @Override
    public String toString() {
        return "Proveedores{" + "telefono=" + telefono + ", nit=" + nit + ", direccion=" + direccion + ", cantidad=" + cantidad + ", producto=" + producto + ", nombreProv=" + nombreProv + '}';
    }
    
    public void ventaDirecta(){
        
    }
    public void pedidosEspeciales(){
        
    }
    
}
