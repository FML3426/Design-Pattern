package structural.proxy.sample01;

import structural.proxy.sample01.subject.AbstractPermission;
import util.XMLUtil;

/**
 * Created by ML3426 on 16/9/17.
 *
 * @author ML3426
 */
public class Client {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        AbstractPermission permission = XMLUtil.readClass(
                AbstractPermission.class, "pxyClassName").newInstance();

        permission.modifyUserInfo();
        permission.viewNote();
        permission.publishNote();
        permission.modifyNote();
        System.out.println("----------------------------");
        permission.setLevel(1);
        permission.modifyUserInfo();
        permission.viewNote();
        permission.publishNote();
        permission.modifyNote();
    }
}
