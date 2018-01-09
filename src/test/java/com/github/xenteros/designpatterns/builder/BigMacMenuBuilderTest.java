package com.github.xenteros.designpatterns.builder;

import com.github.xenteros.designpatterns.builder.external.Meal;
import com.github.xenteros.designpatterns.builder.external.MealBuilder;
import com.github.xenteros.designpatterns.builder.external.MealDirector;
import org.junit.Test;

import static com.github.xenteros.designpatterns.builder.MealMatchers.isEmpty;
import static com.github.xenteros.designpatterns.builder.MealMatchers.isMenu;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class BigMacMenuBuilderTest {

    @Test
    public void shouldReturnEmptyMeal() {
        MealBuilder mealBuilder = null;
        Meal meal = MealDirector.createEmptyMeal(mealBuilder);
        assertNotNull(meal);
        assertThat(meal, isEmpty());
    }

    @Test
    public void shouldReturnBigMacMenu() {
        MealBuilder mealBuilder = null;
        Meal meal = MealDirector.fullMenu(mealBuilder);
        assertThat(meal, isMenu("Big Mac"));
    }

    @Test
    public void shouldReturnHamburgerHappyMealMenu() {
        MealBuilder mealBuilder = null;
        Meal meal = MealDirector.fullMenu(mealBuilder);
        assertThat(meal, isMenu("Hamburger"));
    }
}
