/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import com.sun.org.glassfish.gmbal.Description;

/**
 *
 * @author DELL
 */
public class Producto {
    private int id;
    private int precio;
    private int cantidad;
    private String Descripcion;
   

    public Producto() {
    }

    public Producto(int id, int precio, int cantidad, String Descripcion) {
        this.id = id;
        this.precio = precio;
        this.cantidad = cantidad;
        this.Descripcion = Descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", precio=" + precio + ", cantidad=" + cantidad + ", Descripcion=" + Descripcion + '}';
    }

    
    
}
