package com.github.xenteros.designpatterns.builder.external;

public interface MealBuilder {

    MealBuilder withDrink();
    MealBuilder withMainDish();
    MealBuilder withDessert();
    Meal build();
}
