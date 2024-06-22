package com.example.miprimeraapp;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_principal);
        Bundle data = getIntent().getExtras();//permitirá capturar valores
        String nombreObtenido = data.getString("usuario");
        TextView nombreUsuario = findViewById(R.id.principalUsuario);
        nombreUsuario.setText(nombreObtenido);
        //Toast.makeText(getApplicationContext(),mensaje,Toast.LENGTH_LONG).show();

    }
}