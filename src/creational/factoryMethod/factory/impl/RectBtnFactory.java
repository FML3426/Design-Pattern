package creational.factoryMethod.factory.impl;

import creational.factoryMethod.factory.ButtonFactory;
import creational.factoryMethod.product.Button;
import creational.factoryMethod.product.impl.RectButton;

/**
 * Created by steven.zmj on 2016/7/11.
 */
public class RectBtnFactory implements ButtonFactory {
    @Override
    public Button giveMeBtn() {
        return new RectButton();
    }
}
