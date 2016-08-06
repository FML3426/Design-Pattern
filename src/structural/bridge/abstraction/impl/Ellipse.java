package structural.bridge.abstraction.impl;

import structural.bridge.abstraction.Shape;

/**
 * Created by steven.zmj on 2016/7/15.
 */
public class Ellipse extends Shape {
    @Override
    public void draw(String name) {
        String str = "I'm a Ellipse, %s draw a %s me\n";
        color.bepaint(str, name);
    }
}
