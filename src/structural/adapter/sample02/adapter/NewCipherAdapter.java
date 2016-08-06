package structural.adapter.sample02.adapter;

import structural.adapter.sample02.DataOperation;
import structural.adapter.sample02.adaptee.NewCipher;

/**
 * Created by steven.zmj on 2016/7/14.
 */
public class NewCipherAdapter extends DataOperation {

    private NewCipher cipher;

    public NewCipherAdapter() {
        cipher = new NewCipher();
    }

    public String doEncrypt(int key, String ps) {
        return cipher.doEncrypt(key, ps);
    }
}
