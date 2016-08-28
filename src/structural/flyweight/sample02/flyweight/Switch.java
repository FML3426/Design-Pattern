package structural.flyweight.sample02.flyweight;

import structural.flyweight.sample02.Port;

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
	public void use(Port port) {
		System.out.println("Linked by switch, type is " + this.type + ", port is " + port.getPort());
	}
}
