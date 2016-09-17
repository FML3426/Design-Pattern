package structural.flyweight.sample01.flyweight;

/**
 * Created by ML3426 on 16/8/28.
 *
 * @author ML3426
 */
public class Hub implements NetworkDevice {
    private String type;

    public Hub(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void use() {
        System.out.println("Linked by Hub, type is " + this.type);
    }
}
