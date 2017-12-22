package com.github.xenteros.designpatterns.observer.observers;

import com.github.xenteros.designpatterns.observer.WeatherData;

public class WeatherStatisticsService implements Observer {

    @Override
    public void update(WeatherData weatherData) {

    }

    public double getAverageTemperature() {
        return 0;
    }

    public double getAverageHumidity(){
        return 0;
    }

    public double getAverageAirPressure() {
        return 0;
    }
}
