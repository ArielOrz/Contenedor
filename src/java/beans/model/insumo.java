/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.model;

import java.io.Serializable;


/**
 *
 * @author Ariel
 */
public class insumo implements Serializable{
    
    private int id;
    private String descripcion;
    private int cantidad ;
    private String observaciones;
    private String fecha;

    

    
    public insumo(int id,String descripcion, int cantidad, String observaciones, String fecha) {
        this.id=id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.observaciones = observaciones;
        this.fecha = fecha;
        
    }

        
    @Override
    public insumo clone() {
        return new insumo (getId (),getDescripcion(),getCantidad(),getObservaciones(), getFecha());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        insumo other = (insumo) obj;
        if (descripcion == null) {
            return other.descripcion == null;
        }
        else {
            return descripcion.equals(other.descripcion);
        }
    }

}