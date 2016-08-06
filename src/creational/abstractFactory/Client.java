package creational.abstractFactory;

import creational.abstractFactory.factory.AbstractFactory;
import util.XMLUtil;

/**
 * Created by steven.zmj on 2016/7/7.
 */
public class Client {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        AbstractFactory af = XMLUtil.readClass(AbstractFactory.class, "afClassName").newInstance();

        af.giveMeAButton().pressMe();
        af.giveMeAText().textMe();
    }
}
