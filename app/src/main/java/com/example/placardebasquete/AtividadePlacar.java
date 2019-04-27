package com.example.placardebasquete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AtividadePlacar extends AppCompatActivity {
    // cria referências para os textos que serão modificados
    TextView placarTimeA;
    TextView placarTimeB;
    // cria as variaveis que serão calculadas
    int valorPlacarA = 0;
    int valorPlacarB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atividade_placar);

        // encontra no layout onde está a view dos textos dos placares
        placarTimeA = findViewById(R.id.placar_time_a);
        placarTimeB = findViewById(R.id.placar_time_b);
    }

    // soma mais 3 ao placar do time A
    public void aMais3(View view) {
        valorPlacarA += 3;
        // converte o valor do placar em texto para colocar na view
        String texto = String.valueOf(valorPlacarA);
        // coloca o texto na view placarTimeA
        placarTimeA.setText(texto);
    }
    // soma mais 2 ao placar do time A
    public void aMais2(View view) {
        valorPlacarA += 2;
        String texto = String.valueOf(valorPlacarA);
        placarTimeA.setText(texto);
    }
    // soma mais 1 ao placar do time A
    public void aMais1(View view) {
        valorPlacarA += 1;
        String texto = String.valueOf(valorPlacarA);
        placarTimeA.setText(texto);
    }

    // soma mais 3 ao placar do time B
    public void bMais3(View view) {
        valorPlacarB += 3;
        String texto = String.valueOf(valorPlacarB);
        placarTimeB.setText(texto);
    }
    // soma mais 2 ao placar do time B
    public void bMais2(View view) {
        valorPlacarB += 2;
        String texto = String.valueOf(valorPlacarB);
        placarTimeB.setText(texto);
    }
    // soma mais 1 ao placar do time B
    public void bMais1(View view) {
        valorPlacarB += 1;
        String texto = String.valueOf(valorPlacarB);
        placarTimeB.setText(texto);
    }

    // zera o placar dos times
    public void reiniciar(View view) {
        valorPlacarA = 0;
        valorPlacarB = 0;

        String textoA = String.valueOf(valorPlacarA);
        String textoB = String.valueOf(valorPlacarB);

        placarTimeA.setText(textoA);
        placarTimeB.setText(textoB);
    }
}
