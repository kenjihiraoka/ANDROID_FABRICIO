package com.example.kenji.ex_tela;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    Aluno aluno;
    EditText edtFacul, edtCurso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent itT2 = getIntent();
        this.aluno = (Aluno)itT2.getSerializableExtra("alunoT1");

        edtFacul = findViewById(R.id.edtfaculT2);
        edtCurso = findViewById(R.id.edtcursoT2);
    }

    public void chamaT3(View v) {
        Facudade faculdade = new Facudade();
        faculdade.setCurso(edtCurso.getText().toString());
        faculdade.setNome(edtFacul.getText().toString());

        Intent itT3 = new Intent(this, Main3Activity.class);
        itT3.putExtra("faculdadeT3", faculdade);
        itT3.putExtra("alunoT3", this.aluno);

        startActivity(itT3);
    }
}
