package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private TextView contador;
    private Button mais;
    private Button menos;
    private Button sobre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contador = findViewById(R.id.contador);
        mais = findViewById(R.id.mais);
        menos = findViewById(R.id.menos);
        sobre = findViewById(R.id.sobre);
        contador.setText("0");
    }
    public int getContador(){
       return this.count;
    }
    public void adicionar(View view){
        this.count++;
        contador.setText(String.valueOf(this.count));
    }
    public void subtrair(View view){
        this.count--;
        contador.setText(String.valueOf(this.count));
    }
    public void abreSobre(View view){
        Intent i = new Intent(MainActivity.this, SobreActivity.class);
        i.putExtra("contador", this.getContador());
        startActivity(i);
    }
}