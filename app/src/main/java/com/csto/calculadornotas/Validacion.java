package com.csto.calculadornotas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Validacion extends AppCompatActivity {

    TextView nombre,apellido,correo,sexo;
    String click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validacion);
        nombre = (TextView) findViewById(R.id.nombre);
        apellido = (TextView) findViewById(R.id.apellido);
        correo = (TextView) findViewById(R.id.correo);
        sexo = (TextView) findViewById(R.id.sexo);

        Bundle B = getIntent().getExtras();
        String nom = B.getString("NOMBRE");
        String ape = B.getString("APELLIDO");
        String cor = B.getString("CORREO");
        String sex = B.getString("RADIO");
        nombre.setText(nom);
        apellido.setText(ape);
        correo.setText(cor);
        sexo.setText(sex);
    }

        public void continuar(View v) {
            Intent I = new Intent(getApplicationContext(), CalculadorNotas.class);
            startActivity(I);
        }
        public void editar(View v){
            Intent I=new Intent(getApplicationContext(),Home.class);
            I.putExtra("nombre",nombre.getText().toString());
            I.putExtra("apellido", apellido.getText().toString());
            I.putExtra("correo", correo.getText().toString());
            I.putExtra("radio", sexo.getText().toString());
            startActivity(I);

    }
}
