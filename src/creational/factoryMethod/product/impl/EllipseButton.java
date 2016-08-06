package creational.factoryMethod.product.impl;

import creational.factoryMethod.product.Button;

/**
 * Created by steven.zmj on 2016/7/11.
 */
public class EllipseButton implements Button {
    @Override
    public void pressMe() {
        System.out.println("I am a EllipseButton");
    }
}
