/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.electrodomesticos_poo;

/**
 *
 * @author fco
 */
public class Lavadora extends Electrodomestico {
    private float carga;
    
    private final float cargaDefecto = 5;

    public Lavadora() {
        super();
        this.carga = cargaDefecto;
    }
    
    public Lavadora(float precioBase, float peso) {
        super(precioBase, peso);
        this.carga = cargaDefecto;
    }
    
    public Lavadora(float precioBase, String color, char consumoEnergetico, float peso, float carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public float getCarga() {
        return carga;
    }

    public float getCargaDefecto() {
        return cargaDefecto;
    }

@Override
    public float precioFinal(Electrodomestico e) {
        Lavadora a = (Lavadora) e;
        float acumulador;
        if (a.getCarga() > 30)
            acumulador = super.precioFinal(e) + 50;
        else
            acumulador = super.precioFinal(e);
        return acumulador;
    }
}
