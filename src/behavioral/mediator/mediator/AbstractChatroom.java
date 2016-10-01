package behavioral.mediator.mediator;

import behavioral.mediator.colleague.Member;

/**
 * Created by ML3426 on 2016/10/1.
 *
 * @author ML3426
 */
public abstract class AbstractChatroom {

    public abstract void register(Member member);

    public abstract void sendText(String from, String to, String message);

    public abstract void sendImage(String from, String to, String image);
}
