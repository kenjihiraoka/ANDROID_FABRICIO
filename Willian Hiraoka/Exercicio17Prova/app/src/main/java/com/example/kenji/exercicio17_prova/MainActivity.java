package com.example.kenji.exercicio17_prova;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText EdtNome, EdtFaculdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EdtNome = findViewById(R.id.EdtNome);
        EdtFaculdade = findViewById(R.id.EdtFaculdade);
    }

    public void Show(View v) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(EdtNome.getText().toString());
        pessoa.setFaculdade(EdtFaculdade.getText().toString());

        Intent it = new Intent(this, Main2Activity.class);
        it.putExtra("pessoa", pessoa);
        startActivity(it);
    }
}
