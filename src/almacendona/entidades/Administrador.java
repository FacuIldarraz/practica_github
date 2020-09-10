/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacendona.entidades;

import java.util.List;

/**
 *
 * @author maxy_
 */
public class Administrador {
    private List <String> proveedores;

    public Administrador(List<String> proveedores) {
        this.proveedores = proveedores;
    }

    public List<String> getProveedores() {
        return proveedores;
    }

    public void setProveedores(List<String> proveedores) {
        this.proveedores = proveedores;
    }
    
    
    
    
    public void mantenimientoYcontrol(){
        
    }
    
    public void compra(){
        
    }
    
    public void pedido(){
    
    }
}
