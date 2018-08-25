/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author DELL
 */
public class Cliente {
    private String nombre;
    private String direccion;
    private String id;
    private String telefono;
    private String tipoCliente;

    public Cliente() {
    }

    public Cliente(String nombre, String direccion, String id, String telefono, String tipoCliente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.id = id;
        this.telefono = telefono;
        this.tipoCliente = tipoCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", direccion=" + direccion + ", id=" + id + ", telefono=" + telefono  + '}';
    }
    
    
   
    
    
    
}
