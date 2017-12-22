package com.github.xenteros.designpatterns.observer.observers;

import com.github.xenteros.designpatterns.observer.WeatherData;
import org.junit.Assert;
import org.junit.Test;

public class CurrentWeatherServiceTest {

    @Test
    public void shouldUpdateCurrentWeather() {
        WeatherData weatherData = new WeatherData(1,1,1);
        CurrentWeatherService currentWeatherService = new CurrentWeatherService();
        currentWeatherService.update(weatherData);

        Assert.assertTrue(1 == currentWeatherService.getWeatherData().getTemperature());
        weatherData = new WeatherData(2,2,2);
        currentWeatherService.update(weatherData);
        Assert.assertTrue(2 == currentWeatherService.getWeatherData().getTemperature());
    }
}
