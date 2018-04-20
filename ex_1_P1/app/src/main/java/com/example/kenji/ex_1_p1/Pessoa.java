package com.example.kenji.ex_1_p1;

import java.io.Serializable;

/**
 * Created by kenji on 19/04/18.
 */

public class Pessoa implements Serializable {
    private String Nome;
    private String Cidade;
    private String Estado;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }
}
