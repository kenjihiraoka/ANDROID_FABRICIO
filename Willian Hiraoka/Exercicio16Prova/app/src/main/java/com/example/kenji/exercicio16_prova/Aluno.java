package com.example.kenji.exercicio16_prova;

import java.io.Serializable;

public class Aluno implements Serializable {
    private String Nome;
    private Integer Idade;
    private String CPF;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Integer getIdade() {
        return Idade;
    }

    public void setIdade(Integer idade) {
        Idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
