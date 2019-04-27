package com.example.placardebasquete;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AtividadeInicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // determina o layout da atividade
        setContentView(R.layout.atividade_inicio);
    }

    public void iniciar(View view) {
        // Cria um intent com o contexto atual e a atividade alvo
        Intent intent = new Intent(this, AtividadePlacar.class);
        // Começa a atividade
        startActivity(intent);
    }
}
