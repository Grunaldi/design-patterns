package com.github.xenteros.designpatterns.observer.observable;

import com.github.xenteros.designpatterns.observer.WeatherData;
import com.github.xenteros.designpatterns.observer.observers.CurrentWeatherService;
import com.github.xenteros.designpatterns.observer.observers.Observer;
import com.github.xenteros.designpatterns.observer.observers.WeatherStatisticsService;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class WeatherApiConsumerTest {

    @Test
    public void shouldRegisterObservers() {

        WeatherApiConsumer weatherApiConsumer = new WeatherApiConsumer();
        Observer currentWeatherService = mock(CurrentWeatherService.class);
        Observer weatherStatisticsService = mock(WeatherStatisticsService.class);
        weatherApiConsumer.subscribe(currentWeatherService);
        weatherApiConsumer.subscribe(weatherStatisticsService);

        Assert.assertEquals(2, weatherApiConsumer.getObserversCount());

    }

    @Test
    public void shouldNotifyEachSubscribedObserver() {
        WeatherApiConsumer weatherApiConsumer = new WeatherApiConsumer();
        Observer currentWeatherService = mock(CurrentWeatherService.class);
        Observer weatherStatisticsService = mock(WeatherStatisticsService.class);
        weatherApiConsumer.subscribe(currentWeatherService);
        weatherApiConsumer.subscribe(weatherStatisticsService);

        weatherApiConsumer.notifyAllObservers(new WeatherData(2, 2, 2));

        verify(currentWeatherService, times(1)).update(any());
        verify(weatherStatisticsService, times(1)).update(any());
    }

    @Test
    public void shouldNotifyOnlySubscribedObservers() {
        WeatherApiConsumer weatherApiConsumer = new WeatherApiConsumer();
        Observer currentWeatherService = mock(CurrentWeatherService.class);
        Observer weatherStatisticsService = mock(WeatherStatisticsService.class);
        weatherApiConsumer.subscribe(currentWeatherService);
        weatherApiConsumer.subscribe(weatherStatisticsService);

        weatherApiConsumer.notifyAllObservers(new WeatherData(2, 2, 2));

        weatherApiConsumer.unsubscribe(weatherStatisticsService);

        weatherApiConsumer.notifyAllObservers(new WeatherData(3, 3, 3));

        verify(currentWeatherService, times(2)).update(any());
        verify(weatherStatisticsService, times(1)).update(any());
    }
}
