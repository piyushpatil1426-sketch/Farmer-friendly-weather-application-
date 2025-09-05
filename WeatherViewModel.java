package com.example.weatherapp.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.weatherapp.data.WeatherRepository;
import com.example.weatherapp.model.WeatherResponse;

public class WeatherViewModel extends ViewModel {

    private MutableLiveData<WeatherResponse> weather = new MutableLiveData<>();
    private WeatherRepository repository = new WeatherRepository();

    public LiveData<WeatherResponse> getWeather() {
        return weather;
    }

    public void fetchWeather(String city) {
        repository.getWeather(city, response -> weather.postValue(response));
    }
}
