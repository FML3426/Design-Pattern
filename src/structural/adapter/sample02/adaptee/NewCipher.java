package structural.adapter.sample02.adaptee;

/**
 * Created by steven.zmj on 2016/7/14.
 */
public class NewCipher {

    public String doEncrypt(int key, String ps) {
        String es = "";
        for (int i = 0; i < ps.length(); i++) {
            String c = String.valueOf(ps.charAt(i) % key);
            es += c;
        }
        return es;
    }
}
