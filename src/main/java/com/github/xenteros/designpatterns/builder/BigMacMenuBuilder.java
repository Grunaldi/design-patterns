package com.github.xenteros.designpatterns.builder;

import com.github.xenteros.designpatterns.builder.external.Meal;
import com.github.xenteros.designpatterns.builder.external.MealBuilder;

public class BigMacMenuBuilder implements MealBuilder {

    @Override
    public MealBuilder withDrink() {
        return null;
    }

    @Override
    public MealBuilder withMainDish() {
        return null;
    }

    @Override
    public MealBuilder withDessert() {
        return null;
    }

    @Override
    public Meal build() {
        return null;
    }
}
