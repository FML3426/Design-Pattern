package structural.decorator.decorator;

import structural.decorator.component.Cipher;

/**
 * Created by ML3426 on 16/8/6.
 *
 * @author ML3426
 */
public class ComplexCipher extends CipherDecorator {

	public ComplexCipher(Cipher cipher) {
		super(cipher);
	}

	public String reverse(String text) {
		return new StringBuilder(text).reverse().toString();
	}

	@Override
	public String encrypt(String plainText) {
		return reverse(super.encrypt(plainText));
	}
}
