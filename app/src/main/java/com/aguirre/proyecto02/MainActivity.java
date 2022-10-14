package com.aguirre.proyecto02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText nombreFoto;
    public TextView txtNombreFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombreFoto = findViewById(R.id.nombreFoto);
        txtNombreFoto = findViewById(R.id.txtNombreFoto);
    }


    public void mostrar(View view){
        txtNombreFoto.setText("Nombre: "+nombreFoto.getText());
    }




}