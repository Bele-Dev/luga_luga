package com.senai.lugaluga.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.senai.lugaluga.R;

public class MainActivity extends AppCompatActivity {;

    private ListView listaCidades;

    private String[] cidades = {
            "São Carlos", " Araraquara", "Ibaté",
            "Ribeirão Bonito", "Dourado", "Descalvado",
            "Porto Ferreira", "Santa Rita do Passa Quatro",
            "Tambaú", "Pirassununga", "Ribeirão Preto",
            "Jobuticabal", "Franca", "São Paulo", "Itirapina",
            "Brotas", "Jaú", "Bauru", "Rio Claro"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaCidades = findViewById(R.id.ListaNomes);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                cidades
        );

        listaCidades.setAdapter(adapter);

        listaCidades.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemSelecionado = listaCidades.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), itemSelecionado, Toast.LENGTH_LONG).show();
            }
        });
    }
}