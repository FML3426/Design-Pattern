package structural.bridge.implementor.impl;

import structural.bridge.implementor.Color;

/**
 * Created by steven.zmj on 2016/7/15.
 */
public class Green implements Color {
    @Override
    public void bepaint(String shapeType, String name) {
        String color = "Green";
        System.out.printf(shapeType, name, color);
    }
}
