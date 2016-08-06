package structural.adapter.sample02;

import util.XMLUtil;

/**
 * Created by steven.zmj on 2016/7/14.
 */
public class Client {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        DataOperation dao = XMLUtil.readClass(DataOperation.class, "adClassName2").newInstance();
        dao.setPassword("steven.zmj");
        String ps = dao.getPassword();
        String es = dao.doEncrypt(6, ps);
        System.out.println("明文为：" + ps);
        System.out.println("密文为：" + es);
    }
}
