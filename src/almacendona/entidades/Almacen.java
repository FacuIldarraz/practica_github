package almacendona.entidades;

public class Almacen {
    
    private String nombreEmpresa;
    private String direccion;

    public Almacen(String nombreEmpresa, String direccion) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
    }

    public Almacen() {
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
                                
    public void venta() {
        
    }   
    
    public void recibirPedido() {
        
    }
    
    public void reciboPago() {
        
    }

    @Override
    public String toString() {
        return "Almacen{" + "nombreEmpresa=" + nombreEmpresa + ", direccion=" + direccion + '}';
    }
    
    
    
}
