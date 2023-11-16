package com.example.DriverApp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.driveraplication.R;

public class DriverRegister extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button btnSeleccionarVivienda = findViewById(R.id.button);
        Button btnRegistrarse = findViewById(R.id.button2);
        Button btnRegresar = findViewById(R.id.button4);
        TextView titulo = findViewById(R.id.textView2);
        EditText usuario = findViewById(R.id.editTextUsuario);
        EditText carne = findViewById(R.id.editTextText);
        EditText contraseña = findViewById(R.id.editTextTextPassword);

        btnSeleccionarVivienda.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(DriverRegister.this, "Seleccionar vivienda", Toast.LENGTH_SHORT).show();
            }
        });
        btnRegistrarse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(usuario.getText().toString().isEmpty() || carne.getText().toString().isEmpty() || contraseña.getText().toString().isEmpty()){
                    Toast.makeText(DriverRegister.this, "Completa todos los campos", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(DriverRegister.this, "Registrar", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DriverRegister.this, DriverApp.class);
                startActivity(intent);
            }
        });
    }
}
