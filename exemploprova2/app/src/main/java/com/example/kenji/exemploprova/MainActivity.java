package com.example.kenji.exemploprova;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtNome, edtRA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = findViewById(R.id.edtNome);
        edtRA = findViewById(R.id.edtRA);
    }

    public void enviar(View v) {
        Aluno aluno = new Aluno();
        aluno.setNome(edtNome.getText().toString());
        aluno.setRA(edtRA.getText().toString());

        Intent it = new Intent(this, nova_tela.class);
        it.putExtra("aluno,", aluno);
        startActivity(it);

    }
}
