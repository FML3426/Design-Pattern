package creational.builder.builder;

import creational.builder.product.Meal;

/**
 * Created by steven.zmj on 2016/7/8.
 */
public interface MealBuilder {

    void buildFood();

    void buildDrink();

    Meal getResult();
}
