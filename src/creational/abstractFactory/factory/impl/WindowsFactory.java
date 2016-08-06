package creational.abstractFactory.factory.impl;

import creational.abstractFactory.factory.AbstractFactory;
import creational.abstractFactory.product.Button;
import creational.abstractFactory.product.Text;
import creational.abstractFactory.product.impl.button.WindowsButton;
import creational.abstractFactory.product.impl.text.WindowsText;

/**
 * Created by steven.zmj on 2016/7/7.
 */
public class WindowsFactory implements AbstractFactory {
    @Override
    public Button giveMeAButton() {
        return new WindowsButton();
    }

    @Override
    public Text giveMeAText() {
        return new WindowsText();
    }
}
