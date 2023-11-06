package EmployeeApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.carpooling.carpooling.R;

public class EmployeeMainActivity extends AppCompatActivity {
    private static final String BASE_URL = "http://10.0.2.2:123456/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_main);


    }
}