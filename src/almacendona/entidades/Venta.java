package almacendona.entidades;

public class Venta {

    private String producto;
    private Integer precio;
    private Integer calidad;

    public Venta(String producto, Integer precio, Integer calidad) {
        this.producto = producto;
        this.precio = precio;
        this.calidad = calidad;
    }

    public Venta() {
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getCalidad() {
        return calidad;
    }

    public void setCalidad(Integer calidad) {
        this.calidad = calidad;
    }

    public void venta() {

    }

    public void registroVenta() {

    }

    @Override
    public String toString() {
        return "Venta{" + "producto=" + producto + ", precio=" + precio + ", calidad=" + calidad + '}';
    }

}
