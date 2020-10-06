package com.csto.calculadornotas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        ImageView logo=findViewById(R.id.Logo_Image);
        TextView logo_nombre=findViewById(R.id.logo_nombre);
        TextView logo_santotomas=findViewById(R.id.logo_santotomas);


        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Home.class);
                startActivity(intent);
                finish();

            }
        }, 3000);
    }
}
