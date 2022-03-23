package com.tutorial.entities;

import com.tutorial.interfaces.Felino;

public class Leon implements Felino {

    private String nombre;
    private String raza;
    private String color;


    @Override
    public void datos() {
        imprimirDatos();
    }

    @Override
    public void sonido() {
        rugir();
    }

    private void rugir() {
        System.out.println("Raawwwr!!");
    }

    private void imprimirDatos() {
        System.out.println(String.format("El León se llama %s, es color %s y es de raza %s", nombre, color, raza));
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
}
