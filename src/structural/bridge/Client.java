package structural.bridge;

import structural.bridge.abstraction.Shape;
import structural.bridge.implementor.Color;
import util.XMLUtil;

/**
 * Created by steven.zmj on 2016/7/15.
 */
public class Client {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Shape shape = XMLUtil.readClass(Shape.class, "brClassName_Shape").newInstance();
        shape.setColor(XMLUtil.readClass(Color.class, "brClassName_Color").newInstance());

        shape.draw("Steven.zmj");
    }
}
