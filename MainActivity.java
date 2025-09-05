package com.example.weatherapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import android.widget.TextView;

import com.example.weatherapp.ui.WeatherViewModel;

public class MainActivity extends AppCompatActivity {

    private WeatherViewModel viewModel;
    private TextView weatherInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weatherInfo = findViewById(R.id.weatherInfo);

        viewModel = new ViewModelProvider(this).get(WeatherViewModel.class);

        viewModel.getWeather().observe(this, weather -> {
            if (weather != null) {
                weatherInfo.setText("Temp: " + weather.getMain().getTemp() + "°C");
            }
        });

        viewModel.fetchWeather("Pune"); // Example city
    }
    }
