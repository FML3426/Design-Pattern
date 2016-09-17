package creational.singleton;

/**
 * Created by steven.zmj on 2016/7/12.
 *
 * 双重校验锁，同样是懒汉式，但是支持多线程
 */
public class DoubleLockSingleton {

    private DoubleLockSingleton instance;

    private DoubleLockSingleton() {
    }

    public DoubleLockSingleton getInstace() {
        if (instance == null) {
            synchronized (DoubleLockSingleton.class) {
                if (instance == null) {
                    instance = new DoubleLockSingleton();
                }
            }
        }
        return instance;
    }
}
