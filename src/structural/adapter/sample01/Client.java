package structural.adapter.sample01;

import util.XMLUtil;

/**
 * Created by steven.zmj on 2016/7/14.
 */
public class Client {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Robot robot = XMLUtil.readClass(Robot.class, "adClassName").newInstance();
        robot.cry();
        robot.move();
    }
}
