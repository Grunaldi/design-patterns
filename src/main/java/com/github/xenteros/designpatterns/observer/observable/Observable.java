package com.github.xenteros.designpatterns.observer.observable;

import com.github.xenteros.designpatterns.observer.WeatherData;
import com.github.xenteros.designpatterns.observer.observers.Observer;

public interface Observable {

    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyAllObservers(WeatherData weatherData);
}
