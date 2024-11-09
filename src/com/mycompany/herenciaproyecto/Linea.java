/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaproyecto;

/**
 *
 * @author Usuario
 */
// Subclase Rectangulo
public class Linea extends Formas {
    // Atributo 
    private double largo;

    public Linea(double largo) {
        this.largo = largo;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando una línea.");
    }
}
