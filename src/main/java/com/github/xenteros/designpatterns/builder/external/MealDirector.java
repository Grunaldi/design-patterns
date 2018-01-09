package com.github.xenteros.designpatterns.builder.external;

public class MealDirector {

    public static Meal createEmptyMeal(MealBuilder mealBuilder) {
        return mealBuilder.build();
    }

    public static Meal fullMenu(MealBuilder mealBuilder) {
        return mealBuilder
                .withMainDish()
                .withDrink()
                .withDessert()
                .build();
    }
}
