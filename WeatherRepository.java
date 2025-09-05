package com.example.weatherapp.data;

import com.example.weatherapp.model.WeatherResponse;

public class WeatherRepository {

    public interface WeatherCallback {
        void onResponse(WeatherResponse response);
    }

    public void getWeather(String city, WeatherCallback callback) {
        // TODO: Implement Retrofit or Volley API request here
        // For now, mock response
        WeatherResponse mock = new WeatherResponse();
        callback.onResponse(mock);
    }
}
