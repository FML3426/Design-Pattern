package creational.abstractFactory.product.impl.button;

import creational.abstractFactory.product.Button;

/**
 * Created by steven.zmj on 2016/7/7.
 */
public class WindowsButton implements Button {
    @Override
    public void pressMe() {
        System.out.println("I Am a Windows Button");
    }
}
