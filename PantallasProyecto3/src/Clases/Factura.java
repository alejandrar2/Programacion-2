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
public class Factura {
    private int numero;
    private String fecha;
    private String vendedor;
    private String observacion;

    public Factura(int numero, String fecha, String vendedor, String observacion) {
        this.numero = numero;
        this.fecha = fecha;
        this.vendedor = vendedor;
        this.observacion = observacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Factura() {
    }

    @Override
    public String toString() {
        return "Factura{" + "numero=" + numero + ", fecha=" + fecha + ", vendedor=" + vendedor + ", observacion=" + observacion + '}';
    }
    
    
}
