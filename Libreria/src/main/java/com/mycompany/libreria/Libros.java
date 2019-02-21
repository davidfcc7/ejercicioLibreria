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
    
    //Atributos
    
    char nombreLibro;
    char autorLibro;
    double versionLibro;
    char editorialLibro;
    int costoLibro;
    
    //Metodos
    
    //Metodo para pedir el nombre del libro
    
    public void ingresarNombre(){
        
        nombreLibro = (char) Integer.parseInt(JOptionPane.showInputDialog("Digite el nombre del Libro...."));
    }
}
