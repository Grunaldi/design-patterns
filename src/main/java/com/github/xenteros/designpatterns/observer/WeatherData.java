package com.github.xenteros.designpatterns.observer;

public class WeatherData {

    private double temperature;
    private double airPressure;
    private double humidity;

    public WeatherData(double temperature, double airPressure, double humidity) {
        this.temperature = temperature;
        this.airPressure = airPressure;
        this.humidity = humidity;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getAirPressure() {
        return airPressure;
    }

    public double getHumidity() {
        return humidity;
    }
}
