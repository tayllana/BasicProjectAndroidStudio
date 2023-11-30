package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SobreActivity extends AppCompatActivity {
    private TextView contador;
    private int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobrex);
        Intent intent = getIntent();
        this.count = intent.getIntExtra("contador", 0);
        this.contador = findViewById(R.id.contadorSobre);
        contador.setText(String.valueOf(this.count));
    }
}