/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Detalle {
    private float total;
    private float subTotal;

    public Detalle() {
    }
    
    
    
    public void CalcularSubTotal( ArrayList<Producto> producto ){
        for (int i = 0; i < producto.size(); i++) {
            this.subTotal = ( producto.get(i).getPrecio() * producto.get(i).getCantidad() ) + this.subTotal;
        }
    }
    
    public void calcularTotal(){
        this.total = (float) (this.subTotal * ( 1.5 ));
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }
    
    
}
