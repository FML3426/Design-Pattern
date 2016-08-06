package creational.builder;

import creational.builder.builder.MealBuilder;
import creational.builder.product.Meal;
import util.XMLUtil;

/**
 * Created by steven.zmj on 2016/7/8.
 */
public class Client {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        KFCWaiter kw = new KFCWaiter(XMLUtil.readClass(MealBuilder.class, "bdClassName").newInstance());

        Meal meal = kw.getMeal();
        System.out.println("Client get food: " + meal.getFood());
        System.out.println("Client get drink: " + meal.getDrink());
    }
}
