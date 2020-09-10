/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacendona.entidades;

public class Inventario {
    private Integer numeroSolicitud;

    public Inventario() {
    }

    public Inventario(Integer numeroSolicitud) {
        this.numeroSolicitud = numeroSolicitud;
    }

    public Integer getNumeroSolicitud() {
        return numeroSolicitud;
    }

    public void setNumeroSolicitud(Integer numeroSolicitud) {
        this.numeroSolicitud = numeroSolicitud;
    }

    @Override
    public String toString() {
        return "Inventario{" + "numeroSolicitud=" + numeroSolicitud + '}';
    }
    
    public void registroPedidos(){
        
    }
    public void existencias(){
        
    } 
}
