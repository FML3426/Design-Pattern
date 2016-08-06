package creational.builder.builder.impl;

import creational.builder.builder.MealBuilder;
import creational.builder.product.Meal;

/**
 * Created by steven.zmj on 2016/7/8.
 */
public class SubMealBuilderA implements MealBuilder {
    private Meal meal = new Meal();

    @Override
    public void buildFood() {
        System.out.println("build hamburger");
        meal.setFood("hamburger");
    }

    @Override
    public void buildDrink() {
        System.out.println("build coca cola");
        meal.setDrink("coca cola");
    }

    @Override
    public Meal getResult() {
        return meal;
    }
}
