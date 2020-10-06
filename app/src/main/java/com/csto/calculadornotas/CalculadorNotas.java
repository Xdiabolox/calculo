package com.csto.calculadornotas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalculadorNotas extends AppCompatActivity {
    EditText nota,porcentaje;
    TextView mostrar,resultado;
    String c1="";
    double calcular,not,por;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculador_notas);
        resultado=(TextView) findViewById(R.id.resultado);
        nota=(EditText) findViewById(R.id.nota);
        porcentaje=(EditText) findViewById(R.id.porcentaje);
        mostrar=(TextView) findViewById(R.id.mostrar);
    }
    public void agregar(View v){
        not= Double.parseDouble(nota.getText().toString());
        por=Double.parseDouble("0."+porcentaje.getText().toString());
        c1=c1+"nota"+nota.getText()+"  porcentaje"+porcentaje.getText()+"%"+"|";
        calcular=calcular+(not*por);
        mostrar.setText(c1);
    }
    public void calcular(View v){
        resultado.setText(String.valueOf(calcular));
    }
}
