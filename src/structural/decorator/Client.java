package structural.decorator;

import structural.decorator.component.Cipher;
import structural.decorator.component.impl.SimpleCipher;
import structural.decorator.decorator.AdvancedCipher;
import structural.decorator.decorator.ComplexCipher;

/**
 * Created by ML3426 on 16/8/6.
 *
 * @author ML3426
 */
public class Client {

	public static void main(String[] args) {
		String password = "ML3426";
		String passwordEncrypted;

		Cipher sc, ac, cc;

		sc = new SimpleCipher();
		passwordEncrypted = sc.encrypt(password);
		System.out.println(passwordEncrypted);
		System.out.println("---------------------");

		cc = new ComplexCipher(sc);
		passwordEncrypted = cc.encrypt(password);
		System.out.println(passwordEncrypted);
		System.out.println("---------------------");

		ac = new AdvancedCipher(cc);
		passwordEncrypted = ac.encrypt(password);
		System.out.println(passwordEncrypted);
		System.out.println("---------------------");
	}
}
