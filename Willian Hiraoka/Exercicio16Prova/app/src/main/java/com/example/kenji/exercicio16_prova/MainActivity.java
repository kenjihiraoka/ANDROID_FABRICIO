package com.example.kenji.exercicio16_prova;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText EdtNome, EdtIdade, EdtCPF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EdtNome = findViewById(R.id.EdtNome);
        EdtIdade = findViewById(R.id.EdtIdade);
        EdtCPF = findViewById(R.id.EdtCPF);
    }

    public void Show(View v) {
        Aluno aluno = new Aluno();
        aluno.setNome(EdtNome.getText().toString());
        aluno.setIdade(Integer.parseInt(EdtIdade.getText().toString()));
        aluno.setCPF(EdtCPF.getText().toString());

        Intent it = new Intent(this, Main2Activity.class);
        it.putExtra("aluno", aluno);
        startActivity(it);
    }
}
