package creational.abstractFactory.factory.impl;

import creational.abstractFactory.factory.AbstractFactory;
import creational.abstractFactory.product.Button;
import creational.abstractFactory.product.Text;
import creational.abstractFactory.product.impl.button.LinuxButton;
import creational.abstractFactory.product.impl.text.LinuxText;

/**
 * Created by steven.zmj on 2016/7/7.
 */
public class LinuxFactory implements AbstractFactory {
    @Override
    public Button giveMeAButton() {
        return new LinuxButton();
    }

    @Override
    public Text giveMeAText() {
        return new LinuxText();
    }
}
