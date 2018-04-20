package com.example.kenji.exercicio16_prova;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText EdtTexto;
    Aluno aluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EdtTexto = findViewById(R.id.EdtTexto);

        Intent it2 = getIntent();
        this.aluno = (Aluno)it2.getSerializableExtra("aluno");

        EdtTexto.setText("Nome: " + aluno.getNome().toString() +
                "\nIdade: " + aluno.getIdade().toString() +
                "\nCPF: " + aluno.getCPF().toString());
    }
}
