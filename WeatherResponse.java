package com.example.weatherapp.model;

public class WeatherResponse {
    private Main main;

    public Main getMain() {
        return main;
    }

    public static class Main {
        private float temp;
        public float getTemp() { return temp; }
    }
}
