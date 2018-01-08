package com.github.xenteros.designpatterns.builder;

import com.github.xenteros.designpatterns.builder.external.Meal;

public interface MealBuilder {

    MealBuilder withDrink();
    MealBuilder withMainDish();
    MealBuilder withDessert();
    Meal build();
}
