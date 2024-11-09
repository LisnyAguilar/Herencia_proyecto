/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaproyecto;

/**
 *
 * @author Usuario
 */
public class Formas {
    // Atributo 
    protected String color;

    // Para dibujar 
    public void dibujar() {
        System.out.println("Dibujando una forma.");
    }

    // color de la forma
    public void establecerColor(String color) {
        this.color = color;
    }
}