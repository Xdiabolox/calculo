package com.csto.calculadornotas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalculadorNotas extends AppCompatActivity {
    EditText nota,porcentaje;
    TextView mostrar;
    String c1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculador_notas);
        nota=(EditText) findViewById(R.id.nota);
        porcentaje=(EditText) findViewById(R.id.porsentaje);
        mostrar=(TextView) findViewById(R.id.mostrar);
    }
    public void agregar(View v){
        mostrar.setText(porcentaje.getText());
        mostrar.setText(nota.getText());


    }
}
