package com.example.kenji.ex_tela;

import java.io.Serializable;

/**
 * Created by kenji on 16/03/18.
 */

public class Aluno implements Serializable {
    private String Nome;
    private String Ra;
    private int idade;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getRa() {
        return Ra;
    }

    public void setRa(String ra) {
        Ra = ra;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
