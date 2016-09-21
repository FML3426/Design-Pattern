package behavioral.command.receiver;

/**
 * Created by ML3426 on 2016/9/22.
 *
 * @author ML3426
 */
public class Television {

    public void open() {
        System.out.println("打开电视机！");
    }

    public void close() {
        System.out.println("关闭电视机！");
    }

    public void changeChannel() {
        System.out.println("切换电视频道！");
    }
}
