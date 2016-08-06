package structural.adapter.sample01.adapter;

import structural.adapter.sample01.Robot;
import structural.adapter.sample01.adaptee.Bird;

/**
 * Created by steven.zmj on 2016/7/14.
 */
public class BirdAdapter extends Bird implements Robot {

    @Override
    public void move() {
        System.out.println("Robots learn: ");
        fly();
    }

    @Override
    public void cry() {
        System.out.println("Robots learn: ");
        tweedle();
    }
}
