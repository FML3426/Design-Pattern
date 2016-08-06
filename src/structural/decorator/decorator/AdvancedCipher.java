package structural.decorator.decorator;

import structural.decorator.component.Cipher;

/**
 * Created by ML3426 on 16/8/6.
 *
 * @author ML3426
 */
public class AdvancedCipher extends CipherDecorator {
	public AdvancedCipher(Cipher cipher) {
		super(cipher);
	}

	public String mod(String text) {
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < text.length(); i++) {
			sb.append(text.charAt(i) % 6);
		}
		return sb.toString();
	}

	@Override
	public String encrypt(String plainText) {
		return mod(super.encrypt(plainText));
	}
}
