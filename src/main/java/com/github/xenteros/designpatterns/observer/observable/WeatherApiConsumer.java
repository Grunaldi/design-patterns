package com.github.xenteros.designpatterns.observer.observable;

import com.github.xenteros.designpatterns.observer.WeatherData;
import com.github.xenteros.designpatterns.observer.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherApiConsumer implements Observable {

    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void subscribe(Observer observer) {
        //TODO
    }

    @Override
    public void unsubscribe(Observer observer) {
        //TODO
    }

    @Override
    public void notifyAllObservers(WeatherData weatherData) {
        //TODO  observer.update(weatherData);
    }

    public int getObserversCount() {
        return observers.size();
    }
}
