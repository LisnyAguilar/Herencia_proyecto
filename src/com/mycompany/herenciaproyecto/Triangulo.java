/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaproyecto;

/**
 *
 * @author Usuario
 */
// Subclase Triangulo
public class Triangulo extends Formas {
    // Atributo 
    private double angulo;

    public Triangulo(double angulo) {
        this.angulo = angulo;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un triángulo.");
    }

    public double calcularArea() {
        // calcular el área del triángulo 
        return 0.5 * angulo * angulo; 
    }
}