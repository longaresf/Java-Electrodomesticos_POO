/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.electrodomesticos_poo;

/**
 *
 * @author fco
 */
public class Television extends Electrodomestico {

    private float resolucion;
    private boolean sintonizadorTDT;
    
    private final float resolucionDefecto = 20;
    private final boolean sintonizadorTDTDefecto = false;

    public Television() {
        super();
        this.resolucion = resolucionDefecto;
        this.sintonizadorTDT = sintonizadorTDTDefecto;
    }

    public Television(float precioBase, float peso) {
        super(precioBase, peso);
        this.resolucion = resolucionDefecto;
        this.sintonizadorTDT = sintonizadorTDTDefecto;
    }
    
    public Television(float precioBase, String color, char consumoEnergetico, float peso, float resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public float getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public float getResolucionDefecto() {
        return resolucionDefecto;
    }

    public boolean isSintonizadorTDTDefecto() {
        return sintonizadorTDTDefecto;
    }
@Override
    public float precioFinal(Electrodomestico e){
        Television t = (Television) e;
        float acumulador = super.precioFinal(e);
        if (t.getResolucion() > 40)
            acumulador = acumulador * (float) 1.3;
        if (t.isSintonizadorTDT() == true)
            acumulador += 50;
        return acumulador;
    }
}