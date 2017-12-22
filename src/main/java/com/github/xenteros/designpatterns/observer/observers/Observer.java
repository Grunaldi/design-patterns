package com.github.xenteros.designpatterns.observer.observers;

import com.github.xenteros.designpatterns.observer.WeatherData;

public interface Observer {

    void update(WeatherData weatherData);
}
