package creational.abstractFactory.factory;

import creational.abstractFactory.product.Button;
import creational.abstractFactory.product.Text;

/**
 * Created by steven.zmj on 2016/7/7.
 */
public interface AbstractFactory {

    Button giveMeAButton();

    Text giveMeAText();
}
