package com.github.xenteros.designpatterns.builder.external;

public class Meal {

    private MainDish mainDish;
    private Drink drink;
    private Dessert dessert;

    public Meal(MainDish mainDish, Drink drink, Dessert dessert) {
        this.mainDish = mainDish;
        this.drink = drink;
        this.dessert = dessert;
    }

    public MainDish getMainDish() {
        return mainDish;
    }

    public Drink getDrink() {
        return drink;
    }

    public Dessert getDessert() {
        return dessert;
    }
}
