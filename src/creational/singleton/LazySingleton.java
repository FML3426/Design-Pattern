package creational.singleton;

/**
 * Created by steven.zmj on 2016/7/12.
 *
 * 懒汉式单例，常用的写法，但是在多线程中会出问题
 */
public class LazySingleton {

    private LazySingleton singleton = null;

    private LazySingleton() {
    }

    public LazySingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
