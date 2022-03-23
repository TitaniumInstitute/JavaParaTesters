package com.tutorial.entities;

import com.tutorial.interfaces.Felino;

public class Gato {

    private String nombre;
    private String raza;
    private String color;

    public Gato(){}

    public void datos() {
        imprimirDatos();
    }

    public void sonido() {
        maullar();
    }


    private void maullar() {
        System.out.println("Miau!!");
    }

    private void imprimirDatos() {
        System.out.println(String.format("El gato se llama %s, es color %s y es de raza %s", nombre, color, raza));
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() { return this.raza; }
}
