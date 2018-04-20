package com.example.kenji.ex_1_p1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    ListView lista;
    ArrayAdapter<String>adapter;
    ArrayList<String>info;
    Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent it2 = getIntent();
        this.pessoa = (Pessoa)it2.getSerializableExtra("pessoa");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, info);

        lista = findViewById(R.id.lista);
        lista.setAdapter(adapter);

        info.add(pessoa.getNome());
        info.add(pessoa.getCidade());
        info.add(pessoa.getEstado());

        adapter.notifyDataSetChanged();
    }
}
