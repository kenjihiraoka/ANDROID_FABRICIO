package com.example.kenji.exercicio17_prova;

import java.io.Serializable;

public class Pessoa implements Serializable {
    private String Nome;
    private String Faculdade;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getFaculdade() {
        return Faculdade;
    }

    public void setFaculdade(String faculdade) {
        Faculdade = faculdade;
    }
}
