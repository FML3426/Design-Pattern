package structural.proxy.subject.proxy;

import structural.proxy.subject.AbstractPermission;
import structural.proxy.subject.real.RealPermission;

/**
 * Created by ML3426 on 16/9/17.
 *
 * @author ML3426
 */
public class PermissionProxy implements AbstractPermission {

    private RealPermission permission = new RealPermission();
    private int level = 0;

    @Override
    public void modifyUserInfo() {
        if (0 == level) {
            System.out.println("对不起，你没有该权限!");
        } else if (1 == level) {
            permission.modifyUserInfo();
        }
    }

    @Override
    public void viewNote() {
        permission.viewNote();
    }

    @Override
    public void publishNote() {
        if (0 == level) {
            System.out.println("对不起，你没有该权限!");
        } else if (1 == level) {
            permission.publishNote();
        }
    }

    @Override
    public void modifyNote() {
        if (0 == level) {
            System.out.println("对不起，你没有该权限!");
        } else if (1 == level) {
            permission.modifyNote();
        }
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }
}
