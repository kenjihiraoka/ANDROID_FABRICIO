package com.example.kenji.exercicio17_prova;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    Pessoa pessoa;
    ListView lista;
    ArrayAdapter<String> adapter;
    ArrayList<String> info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lista = findViewById(R.id.lista);

        Intent it2 = getIntent();
        this.pessoa = (Pessoa)it2.getSerializableExtra("pessoa");

        lista.setAdapter(adapter);
        info.add(pessoa.getNome().toString());
        info.add(pessoa.getFaculdade().toString());

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, info);

        adapter.notifyDataSetChanged();
    }
}
