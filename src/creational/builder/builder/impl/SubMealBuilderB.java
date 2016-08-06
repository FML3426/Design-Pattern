package creational.builder.builder.impl;

import creational.builder.builder.MealBuilder;
import creational.builder.product.Meal;

/**
 * Created by steven.zmj on 2016/7/8.
 */
public class SubMealBuilderB implements MealBuilder {
    private Meal meal = new Meal();

    @Override
    public void buildFood() {
        System.out.println("build chicken leg");
        meal.setFood("chicken leg");
    }

    @Override
    public void buildDrink() {
        System.out.println("build pepsi");
        meal.setDrink("build pepsi");
    }

    @Override
    public Meal getResult() {
        return meal;
    }
}
