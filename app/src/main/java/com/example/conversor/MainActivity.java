package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText fahrenheitTemperature = findViewById(R.id.fahrenheit_temperature);
        TextView celsiusTemperature = findViewById(R.id.celsius_temperature);
        Button btnConvert = findViewById(R.id.btn_Convert);
        btnConvert.setOnClickListener(v->{
            String fahrenheit = fahrenheitTemperature.getText().toString();
            try {
                double celsius = (Double.parseDouble(fahrenheit) - 32) * 5 / 9;
                celsiusTemperature.setText(String.valueOf(celsius));
                Toast.makeText(this, "Convertido a celsius!", Toast.LENGTH_LONG).show();
            } catch(NumberFormatException numberFormatException) {
                Toast.makeText(this, "Ingrese un valor valido!", Toast.LENGTH_LONG).show();
            }
        });
    }

}