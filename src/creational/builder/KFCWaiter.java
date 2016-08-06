package creational.builder;

import creational.builder.builder.MealBuilder;
import creational.builder.product.Meal;

/**
 * Created by steven.zmj on 2016/7/8.
 */
public class KFCWaiter {

    MealBuilder mb;

    public KFCWaiter(MealBuilder mb) {
        this.mb = mb;
    }

    public Meal getMeal() {
        mb.buildFood();
        mb.buildDrink();
        return mb.getResult();
    }
}
