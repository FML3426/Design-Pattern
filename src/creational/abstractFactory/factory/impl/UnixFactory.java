package creational.abstractFactory.factory.impl;

import creational.abstractFactory.factory.AbstractFactory;
import creational.abstractFactory.product.Button;
import creational.abstractFactory.product.Text;
import creational.abstractFactory.product.impl.button.UnixButton;
import creational.abstractFactory.product.impl.text.UnixText;

/**
 * Created by steven.zmj on 2016/7/7.
 */
public class UnixFactory implements AbstractFactory {
    @Override
    public Button giveMeAButton() {
        return new UnixButton();
    }

    @Override
    public Text giveMeAText() {
        return new UnixText();
    }
}
