package com.tutorial.entities;

public class Perro {

    public static String especie = "Cannis Domesticus";

    private Short expectativa;
    private Character sexo;
    private Integer peso;

    public String imprimirDatos() {
        return String.format("Peso: %s, Sexo: %s, Expectativa: %s", peso, sexo, expectativa);
    }

    public static String getEspecie() {
        return especie;
    }

    public static void setEspecie(String especie) {
        Perro.especie = especie;
    }

    public Short getExpectativa() {
        return expectativa;
    }

    public void setExpectativa(Short expectativa) {
        this.expectativa = expectativa;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }
}
