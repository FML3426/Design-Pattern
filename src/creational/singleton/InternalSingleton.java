package creational.singleton;

/**
 * Created by steven.zmj on 2016/7/12.
 *
 * 静态内部类，加载时不会初始化静态变量INSTANCE，因为没有主动使用，达到Lazy loading，而且用java自身的语言特性，支持了多线程
 */
public class InternalSingleton {

    private static class SingletonHolder {
        private final static InternalSingleton INSTANCE = new InternalSingleton();
    }

    private InternalSingleton() {}

    public static InternalSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
