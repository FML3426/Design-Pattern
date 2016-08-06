package structural.bridge.implementor.impl;

import structural.bridge.implementor.Color;

/**
 * Created by steven.zmj on 2016/7/15.
 */
public class Red implements Color {
    @Override
    public void bepaint(String shapeType, String name) {
        String color = "Red";
        System.out.printf(shapeType, name, color);
    }
}
