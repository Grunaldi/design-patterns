package com.github.xenteros.designpatterns.builder;

import com.github.xenteros.designpatterns.builder.external.Meal;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

public class MealMatchers {

    public static Matcher<Meal> isEmpty() {
        return new BaseMatcher<Meal>() {
            @Override
            public boolean matches(Object object) {
                final Meal meal = (Meal)object;
                return meal != null
                        && meal.getMainDish() == null
                        && meal.getDessert() == null
                        && meal.getDrink() == null;
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("Meal isn't empty");
            }
        };
    }

    public static Matcher<Meal> isMenu(String menu) {
        return new BaseMatcher<Meal>() {
            @Override
            public boolean matches(Object object) {
                final Meal meal = (Meal)object;
                return meal != null
                        && meal.getMainDish()!= null
                        && meal.getMainDish().getDish().equals(menu)
                        && meal.getDrink() != null
                        && meal.getDessert() != null;
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("Sandwich should be " + menu);
            }
        };
    }
}
