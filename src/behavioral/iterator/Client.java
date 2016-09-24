package behavioral.iterator;

import behavioral.iterator.aggregate.Television;
import util.XMLUtil;

/**
 * Created by ML3426 on 2016/9/24.
 *
 * @author ML3426
 */
public class Client {
    public static void display(Television tv) {
        TVIterator i = tv.createIterator();
        System.out.println("电视机频道：");
        while (!i.isLast()) {
            System.out.println(i.currentChannel().toString());
            i.next();
        }
    }

    public static void reverseDisplay(Television tv) {
        TVIterator i = tv.createIterator();
        i.setChannel(5);
        System.out.println("逆向遍历电视机频道：");
        while (!i.isFirst()) {
            i.previous();
            System.out.println(i.currentChannel().toString());
        }
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Television tv;
        tv = XMLUtil.readClass(Television.class, "itrClassName").newInstance();
        display(tv);
        System.out.println("--------------------------");
        reverseDisplay(tv);
    }
}
