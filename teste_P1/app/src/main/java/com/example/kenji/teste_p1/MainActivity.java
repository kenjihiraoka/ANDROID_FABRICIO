package com.example.kenji.teste_p1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText EdtNome, EdtIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EdtNome = findViewById(R.id.EdtNome);
        EdtIdade = findViewById(R.id.EdtIdade);
    }

    public void Show(View v) {
        String Nome = EdtNome.getText().toString();
        Integer Idade = Integer.parseInt(EdtIdade.getText().toString());
        Toast.makeText(this, "Nome: " + Nome + "\nIdade: " + Idade, Toast.LENGTH_LONG).show();
    }
}
