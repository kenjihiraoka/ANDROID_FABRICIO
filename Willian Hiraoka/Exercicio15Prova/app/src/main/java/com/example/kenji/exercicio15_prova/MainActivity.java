package com.example.kenji.exercicio15_prova;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText EdtTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EdtTexto = findViewById(R.id.EdtTexto);
    }

    public void Show(View v) {
        String texto = EdtTexto.getText().toString();
        Toast.makeText(this, texto + " FATEC - ADS", Toast.LENGTH_LONG).show();
    }
}
