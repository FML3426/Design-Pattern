package structural.proxy.sample01.subject.real;

import structural.proxy.sample01.subject.AbstractPermission;

/**
 * Created by ML3426 on 16/9/17.
 *
 * @author ML3426
 */
public class RealPermission implements AbstractPermission {

    @Override
    public void modifyUserInfo() {
        System.out.println("修改用户信息！");
    }

    @Override
    public void viewNote() {
        System.out.println("浏览帖子！");
    }

    @Override
    public void publishNote() {
        System.out.println("发布新帖！");
    }

    @Override
    public void modifyNote() {
        System.out.println("修改发帖内容！");
    }

    @Override
    public void setLevel(int level) {

    }
}
