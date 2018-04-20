package com.example.kenji.exemploprova;

import java.io.Serializable;

/**
 * Created by kenji on 13/04/18.
 */

public class Aluno implements Serializable {
    private String Nome;
    private String RA;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }
}
