package com.example.miprimeraapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }

    public void accederLogin(View view) {

        //declarar los editText

        EditText usuario = findViewById(R.id.usuario);
        EditText contraseña = findViewById(R.id.contraseña);

        String usuarioCadena = usuario.getText().toString();
        String contraseñaCadena =contraseña.getText().toString();

        Intent accederPrincipal = new Intent(this, PrincipalActivity.class);
        accederPrincipal.putExtra("usuario",usuarioCadena);
        startActivity(accederPrincipal);

        Toast.makeText(getApplicationContext(),
                "creando app",Toast.LENGTH_LONG).show();



    }

    public void crearUsuario(View view) {

        Intent accederCrearUsuario = new Intent(this,CrearUsuarioActivity.class);
        startActivity(accederCrearUsuario);

        Toast.makeText(getApplicationContext(),
                "Estoy creando usuario",Toast.LENGTH_LONG).show();
    }

    public void recuperarContraseña(View view) {

        Intent accederRecuperarcontraseña = new Intent(this,RecuperarContrasenaActivity.class);
        startActivity(accederRecuperarcontraseña);

        Toast.makeText(getApplicationContext(),
                "Estoy recuperando contraseña",Toast.LENGTH_LONG).show();
    }
}