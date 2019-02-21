/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.libreria;

import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class Libros {
    
    private String autorLibro;
    
    private double versionLibro;
    
    private String editorialLibro;
    
    private int costoLibro;
    
    private int stockLibro;
    
    private String fechaVenta;
    
    private int cantidadVenta;
    
    private int valorUnidadVenta;
    
    private String nombreProveedor;
    
    private int identificacionProveedor;
    
    private String telefonoProveedor;
    
    private String categoriaLibro;
    
    public void libro(String autor, double version, String editorial, int costo, int stock){
        
        autorLibro = autor;
        versionLibro = version;
        editorialLibro = editorial;
        costoLibro = costo;
        stockLibro = stock;
        
    }
    public void venta(String fecha, int cantidad, int valor){
        
        fechaVenta = fecha;
        cantidadVenta = cantidad;
        valorUnidadVenta = valor;
        
    }
    public void proveedor(String proveedor, int identificacion, String telefono){
        
        nombreProveedor = proveedor;
        identificacionProveedor = identificacion;
        telefonoProveedor = telefono;
        
    }
    public void categoria(String categoria){
        
        categoriaLibro = categoria;
        
    }
}
