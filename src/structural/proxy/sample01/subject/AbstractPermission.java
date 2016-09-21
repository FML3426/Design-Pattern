package structural.proxy.sample01.subject;

/**
 * Created by ML3426 on 16/9/17.
 *
 * @author ML3426
 */
public interface AbstractPermission {

    void modifyUserInfo();

    void viewNote();

    void publishNote();

    void modifyNote();

    void setLevel(int level);
}
