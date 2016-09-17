package structural.decorator.decorator;

import structural.decorator.component.Cipher;

/**
 * Created by ML3426 on 16/8/6.
 *
 * @author ML3426
 */
public abstract class CipherDecorator implements Cipher {

    private Cipher cipher;

    public CipherDecorator(Cipher cipher) {
        this.cipher = cipher;
    }

    @Override
    public String encrypt(String plainText) {
        return cipher.encrypt(plainText);
    }
}
