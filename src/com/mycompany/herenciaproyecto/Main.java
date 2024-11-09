/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaproyecto;

/**
 *
 * @author Usuario
 */

public class Main {
    
    public static void main(String[] args) {
        // Instancias
        Circulo circulo = new Circulo(5.0);
        circulo.establecerColor("Rojo");
        System.out.println("Color del círculo: " + circulo.color);
        circulo.dibujar();
        System.out.println("Radio del círculo: " + circulo.calcularRadio());

        Linea linea = new Linea(10.0);
        linea.establecerColor("Azul");
        System.out.println("Color de la línea: " + linea.color);
        linea.dibujar();

        Triangulo triangulo = new Triangulo(6.0);
        triangulo.establecerColor("Verde");
        System.out.println("Color del triángulo: " + triangulo.color);
        triangulo.dibujar();
        System.out.println("Área del triángulo: " + triangulo.calcularArea());

        Cuadrado cuadrado = new Cuadrado(4.0);
        cuadrado.establecerColor("Amarillo");
        System.out.println("Color del cuadrado: " + cuadrado.color);
        cuadrado.dibujar();
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
    }
}
