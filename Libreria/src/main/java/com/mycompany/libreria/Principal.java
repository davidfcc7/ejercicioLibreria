/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.libreria;

/**
 *
 * @author David
 */
public class Principal {
    public static void main (String[] args){
        
        Libros compra = new Libros();
        
        compra.libro("David", 8, "udec", 10000, 6);
        compra.venta("21/02/2019", 3, 5000);
        compra.proveedor("Felipe", 1070966809, "3058804870");
        compra.categoria("Terror");
        
    }
}
