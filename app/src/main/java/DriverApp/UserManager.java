package DriverApp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.carpooling.carpooling.R;
import com.carpooling.carpooling.Registro;

public class UserManager extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_main);

        Button btnIniciarSesion = findViewById(R.id.btnIniciarSesion);
        Button btnRegistrarse = findViewById(R.id.btnRegistrarse);
        Button btnSalir = findViewById(R.id.btnSalir);

        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(UserManager.this, "Iniciar Sesión", Toast.LENGTH_SHORT).show();
            }
        });

        btnRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UserManager.this, "Registrarse", Toast.LENGTH_SHORT).show();
            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}