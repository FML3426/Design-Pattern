package structural.facade;

import structural.facade.facade.GeneralSwitchFacade;

/**
 * Created by ML3426 on 16/8/25.
 *
 * @author ML3426
 */
public class Client {

	public static void main(String[] args) {
		GeneralSwitchFacade gsf = new GeneralSwitchFacade();
		gsf.on();
		System.out.println("-----------------------");
		gsf.off();
	}
}
