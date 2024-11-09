/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaproyecto;

/**
 *
 * @author Usuario
 */
// Subclase Circulo

public class Circulo extends Formas {
    // Atributo 
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo.");
    }

    public double calcularRadio() {
        return radio;
    }
}