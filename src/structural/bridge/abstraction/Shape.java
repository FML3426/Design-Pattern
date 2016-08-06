package structural.bridge.abstraction;

import structural.bridge.implementor.Color;

/**
 * Created by steven.zmj on 2016/7/15.
 */
public abstract class Shape {

    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw(String name);
}
