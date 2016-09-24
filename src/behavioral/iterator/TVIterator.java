package behavioral.iterator;

/**
 * Created by ML3426 on 2016/9/24.
 *
 * @author ML3426
 */
public interface TVIterator {

    void setChannel(int i);

    void next();

    void previous();

    boolean isLast();

    Object currentChannel();

    boolean isFirst();
}
