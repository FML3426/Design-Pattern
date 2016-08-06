package structural.adapter.sample02.adapter;

import structural.adapter.sample02.DataOperation;
import structural.adapter.sample02.adaptee.Caesar;

/**
 * Created by steven.zmj on 2016/7/14.
 */
public class CipherAdapter extends DataOperation {

    private Caesar cipher;

    public CipherAdapter() {
        cipher = new Caesar();
    }

    public String doEncrypt(int key, String ps) {
        return cipher.doEncrypt(key, ps);
    }
}
