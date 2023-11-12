package EmployeeApp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.carpooling.carpooling.R;
import com.carpooling.carpooling.Registro;

public class EmployeeMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_main);

        // Encuentra el botón por su ID
        Button btnInicioSesion = findViewById(R.id.InicioSesion);

        // Agrega un OnClickListener al botón
        btnInicioSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Llama al método para abrir la ActivityRegistro
                abrirActivityRegistro();
            }
        });
    }

    private void abrirActivityRegistro() {
        // Crear un Intent para abrir la ActivityRegistro
        Intent intent = new Intent(this, Registro.class);

        // Puedes pasar datos adicionales a la nueva actividad si es necesario
        // intent.putExtra("clave", "valor");

        // Iniciar la nueva actividad
        startActivity(intent);
    }
}
