package structural.adapter.sample01.adapter;

import structural.adapter.sample01.Robot;
import structural.adapter.sample01.adaptee.Dog;

/**
 * Created by steven.zmj on 2016/7/14.
 */
public class DogAdapter extends Dog implements Robot {
    @Override
    public void move() {
        System.out.println("Robots learn: ");
        run();
    }

    @Override
    public void cry() {
        System.out.println("Robots learn: ");
        bark();
    }
}
