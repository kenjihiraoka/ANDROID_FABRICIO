package com.example.kenji.ex_1_p1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText EdtNome, EdtCidade, EdtEstado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EdtNome = findViewById(R.id.EdtNome);
        EdtCidade = findViewById(R.id.EdtCidade);
        EdtEstado = findViewById(R.id.EdtEstado);
    }

    public void Tela_2(View v) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(EdtNome.getText().toString());
        pessoa.setCidade(EdtCidade.getText().toString());
        pessoa.setEstado(EdtEstado.getText().toString());

        Intent it = new Intent(this, Main2Activity.class);
        it.putExtra("pessoa", pessoa);
        startActivity(it);
    }
}
