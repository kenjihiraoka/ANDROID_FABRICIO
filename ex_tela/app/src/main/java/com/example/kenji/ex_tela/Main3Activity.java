package com.example.kenji.ex_tela;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    Aluno aluno;
    Facudade faculdade;
    TextView txtNome, txtIdade, txtRa, txtFacul, txtCurso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent itT3 = getIntent();
        this.aluno = (Aluno)itT3.getSerializableExtra("alunoT3");
        this.faculdade = (Facudade)itT3.getSerializableExtra("faculdadeT3");

        txtNome = findViewById(R.id.txtNome);
        txtNome.setText("Nome: " + aluno.getNome());

        txtIdade = findViewById(R.id.txtIdade);
        txtIdade.setText("Idade: " + Integer.toString(aluno.getIdade()));

        txtRa = findViewById(R.id.txtRa);
        txtRa.setText("RA: " + aluno.getRa());

        txtFacul = findViewById(R.id.txtFacul);
        txtFacul.setText("Faculdade: " + faculdade.getNome());

        txtCurso = findViewById(R.id.txtCurso);
        txtCurso.setText("Curso: " + faculdade.getCurso());
    }
}
