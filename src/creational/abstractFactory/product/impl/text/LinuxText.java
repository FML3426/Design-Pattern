package creational.abstractFactory.product.impl.text;

import creational.abstractFactory.product.Text;

/**
 * Created by steven.zmj on 2016/7/7.
 */
public class LinuxText implements Text {
    @Override
    public void textMe() {
        System.out.println("I Am a Linux Text");
    }
}
