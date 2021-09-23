package com.example.message;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre=(EditText) findViewById(R.id.nombre);
    }
    public void aceptar(View view)
    {
        if(nombre.getText().length()>0){
            Intent i = new Intent(MainActivity.this, Conte.class);
            i.putExtra("Nombre",nombre.getText().toString());
            startActivity(i);
        }
        else {
            Toast.makeText(this, "Escriba su nombre", Toast.LENGTH_SHORT).show();
        }

    }
}