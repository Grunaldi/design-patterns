package com.github.xenteros.designpatterns.observer.observers;

import com.github.xenteros.designpatterns.observer.WeatherData;
import org.junit.Assert;
import org.junit.Test;

public class WeatherStatisticsServiceTest {

    @Test
    public void shouldUpdateWeatherStatistics() {
        WeatherData weatherData = new WeatherData(1,1,1);
        WeatherStatisticsService weatherStatisticsService = new WeatherStatisticsService();
        weatherStatisticsService.update(weatherData);
        Assert.assertTrue("Average temperature should be 1",weatherStatisticsService.getAverageTemperature() == 1);
        weatherStatisticsService.update(new WeatherData(3, 3, 3));
        Assert.assertTrue("Average temperature should be 2", weatherStatisticsService.getAverageTemperature() == 2);
    }
}
