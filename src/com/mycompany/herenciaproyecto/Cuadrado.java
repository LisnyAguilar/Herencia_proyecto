/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaproyecto;

/**
 *
 * @author Usuario
 */
// Subclase Cuadrado

public class Cuadrado extends Formas {
    // Atributo específico de Cuadrado
    private double area;

    public Cuadrado(double area) {
        this.area = area;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado.");
    }

    public double calcularArea() {
        return area * area; 
    }
}
