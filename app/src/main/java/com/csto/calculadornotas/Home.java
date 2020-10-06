package com.csto.calculadornotas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    RadioButton radio_hombre, radio_mujer;
    EditText nombre, apellido, correo;
    String n1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        nombre = (EditText) findViewById(R.id.et_nombre);
        apellido = (EditText) findViewById(R.id.et_apellido);
        correo = (EditText) findViewById(R.id.et_correo);
        radio_hombre = (RadioButton) findViewById(R.id.radio_masculino);
        radio_mujer = (RadioButton) findViewById(R.id.radio_femenino);


    }

    public void Boton(View v) {
        String radio1="", correo1, nombre1, apellido1;
        correo1 = correo.getText().toString();
        nombre1 = nombre.getText().toString();
        apellido1 = apellido.getText().toString();
        boolean H = radio_hombre.isChecked();
        boolean M = radio_mujer.isChecked();
        if (H == true && M==false) {
            radio1 = "HOMBRE";
        }
        else if(M == true && H==false ){
            radio1 = "MUJER";
        }
        if (radio1!="" && nombre1!="" && apellido1 !="" && correo1 !="") {
            Intent I = new Intent(getApplicationContext(), Validacion.class);
            I.putExtra("NOMBRE", nombre1);
            I.putExtra("APELLIDO", apellido1);
            I.putExtra("CORREO", correo1);
            I.putExtra("RADIO", radio1);
            startActivity(I);
        } else {
            Toast.makeText(getApplicationContext(), "Debe ingresar todos los campos", Toast.LENGTH_SHORT).show();
        }

    }
    public void rescatar(View v){
        Bundle B = getIntent().getExtras();
        String nom = B.getString("nombre");
        String ape = B.getString("apellido");
        String cor = B.getString("correo");
        String sex = B.getString("radio");
        nombre.setText(nom);
        apellido.setText(ape);
        correo.setText(cor);
        if(sex=="HOMBRE"){
            radio_hombre.setChecked(true);
        }
        else{
            radio_mujer.setChecked(true);
        }
    }


}
