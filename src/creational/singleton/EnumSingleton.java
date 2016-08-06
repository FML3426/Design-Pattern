package creational.singleton;

/**
 * Created by steven.zmj on 2016/7/12.
 *
 * 枚举，《Effective Java》作者推荐使用的方法，优点：不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象
 * 但是依旧无法实现lazy loading
 */
public enum EnumSingleton {

    INSTANCE;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
