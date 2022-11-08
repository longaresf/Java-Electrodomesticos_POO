/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.electrodomesticos_poo;

import java.util.ArrayList;

/**
 *
 * @author fco
 */
public class Electrodomestico {

    private float precioBase;
    private String color;
    private char consumoEnergetico;
    private float peso;

    protected String colores[] = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};
    
    protected char letras[] = {'A', 'B', 'C', 'D', 'E', 'F'};
    
    private final float precioBaseDefecto = 100000;
    private final String colorDefecto = colores[0];
    private final float pesoDefecto = 5;
    private final char consumoEnergeticoDefecto = letras[5];
    
    public Electrodomestico() {
        this.precioBase = precioBaseDefecto;
        this.color = colorDefecto;
        this.consumoEnergetico = consumoEnergeticoDefecto;
        this.peso = pesoDefecto;
    }

    public Electrodomestico(float precioBase, float peso) {
        this();
        this.precioBase = precioBase;
        this.peso = peso;
    }

    
    public Electrodomestico(float precioBase, String color, char consumoEnergetico, float peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String[] getColores() {
        return colores;
    }

    public void setColores(String[] colores) {
        this.colores = colores;
    }

    public char[] getLetras() {
        return letras;
    }

    public void setLetras(char[] letras) {
        this.letras = letras;
    }

    private char comprobarConsumoEnergetico(char letra){
        char consumo = consumoEnergeticoDefecto;
        
        for (char c : letras) {
            if (Character.toUpperCase(letra) == c)
                consumo = Character.toUpperCase(letra);
        }
        
        return consumo;
        
    }

    private String comprobarColor(String color){
        String colorValidado = colorDefecto;
        
        for (String col : colores) {
            if (color.equalsIgnoreCase(col))
                colorValidado = col;
        }
        return colorValidado;
    }
   
    public float precioFinal(Electrodomestico e){
        float acumulador = e.getPrecioBase();
    if (e.getConsumoEnergetico() ==  'A')
        acumulador += 100;
    if (e.getConsumoEnergetico() ==  'B') 
        acumulador += 80;
    if (e.getConsumoEnergetico() ==  'C') 
        acumulador += 60;
    if (e.getConsumoEnergetico() ==  'D') 
        acumulador += 50;
    if (e.getConsumoEnergetico() ==  'E') 
        acumulador += 30;
    if (e.getConsumoEnergetico() ==  'F')
        acumulador += 10;
    if (e.getPeso() >= 0 && e.getPeso() <= 19)
        acumulador += 10;
    if (e.getPeso() >= 20 && e.getPeso() <= 49)
        acumulador += 50;
    if (e.getPeso() >= 50 && e.getPeso() <= 79)
        acumulador += 80;
    if (e.getPeso() >= 80 )
        acumulador += 100;
    return acumulador;
     }
}
