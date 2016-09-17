package structural.flyweight.sample02.flyweight;

import structural.flyweight.sample02.Port;

/**
 * Created by ML3426 on 16/8/28.
 *
 * @author ML3426
 */
public interface NetworkDevice {

    String getType();

    void use(Port port);
}
