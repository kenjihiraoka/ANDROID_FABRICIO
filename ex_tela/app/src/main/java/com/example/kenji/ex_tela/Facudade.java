package com.example.kenji.ex_tela;

import java.io.Serializable;

/**
 * Created by kenji on 16/03/18.
 */

public class Facudade implements Serializable  {
    private String Nome;
    private String Curso;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }

}
