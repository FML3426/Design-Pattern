package structural.flyweight.sample01.flyweight;

/**
 * Created by ML3426 on 16/8/28.
 *
 * @author ML3426
 */
public class Switch implements NetworkDevice {
	private String type;

	public Switch(String type) {
		this.type = type;
	}

	@Override
	public String getType() {
		return this.type;
	}

	@Override
	public void use() {
		System.out.println("Linked by Switch, type is " + this.type);
	}
}
