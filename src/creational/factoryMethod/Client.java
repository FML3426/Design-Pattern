package creational.factoryMethod;

import creational.factoryMethod.factory.ButtonFactory;
import util.XMLUtil;

/**
 * Created by steven.zmj on 2016/7/11.
 */
public class Client {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        ButtonFactory bf = XMLUtil.readClass(ButtonFactory.class, "fmClassName").newInstance();

        bf.giveMeBtn().pressMe();
    }
}
