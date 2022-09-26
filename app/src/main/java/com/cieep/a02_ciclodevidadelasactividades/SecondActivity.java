package com.cieep.a02_ciclodevidadelasactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button btnCerrar;


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ESTADOS", "6 - Ejecuto onDestroy  ACTIVITY 2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ESTADOS", "5 - Ejecuto onStop ACTIVITY 2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ESTADOS", "4 - Ejecuto onPause ACTIVITY 2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ESTADOS", "3 - Ejecuto onResume ACTIVITY 2");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ESTADOS", "2 - Ejecuto onStart ACTIVITY 2");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.e("ESTADOS", "1 - Ejecuto onCreate ACTIVITY 2");

        btnCerrar = findViewById(R.id.btnCerrarSecond);
        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}