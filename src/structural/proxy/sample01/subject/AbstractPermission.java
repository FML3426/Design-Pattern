package structural.proxy.sample01.subject;

/**
 * Created by ML3426 on 16/9/17.
 *
 * @author ML3426
 */
public interface AbstractPermission {

    public void modifyUserInfo();

    public void viewNote();

    public void publishNote();

    public void modifyNote();

    public void setLevel(int level);
}
