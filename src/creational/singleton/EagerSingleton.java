package creational.singleton;

/**
 * Created by steven.zmj on 2016/7/12.
 *
 * 饿汉式单例，没有达到lazy loading的效果,也无法支持多线程
 */
public class EagerSingleton {

    private EagerSingleton singleton = new EagerSingleton();

    private EagerSingleton() {
    }

    public EagerSingleton getInstance() {
        return singleton;
    }
}
