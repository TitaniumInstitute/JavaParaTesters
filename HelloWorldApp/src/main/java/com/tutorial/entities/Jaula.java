package com.tutorial.entities;

import com.tutorial.interfaces.Felino;

import java.util.ArrayList;
import java.util.List;

public class Jaula <T extends Felino>{

    private List<T> contenido = new ArrayList<>();

    public void ingresarAnimal(T animal) {
        contenido.add(animal);
    }

    public void mostrarContenido() {
        System.out.println(String.format("La jaula contiene %s animales", contenido.size()));
        contenido.stream().forEach(a -> System.out.println(String.format("Animal de la clase %s", a.getClass().getSimpleName())));
    }
}
