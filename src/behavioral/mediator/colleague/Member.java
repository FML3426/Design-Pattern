package behavioral.mediator.colleague;

import behavioral.mediator.mediator.AbstractChatroom;

/**
 * Created by ML3426 on 2016/10/1.
 *
 * @author ML3426
 */
public abstract class Member {

    protected AbstractChatroom chatroom;
    protected String name;

    public abstract void sendText(String to, String message);

    public abstract void sendImage(String to, String image);

    public Member(String name) {
        this.name = name;
    }

    public void receiveText(String from, String message) {
        System.out.println(from + "发送文本给" + this.name + "，内容为：" + message);
    }

    public void receiveImage(String from, String image) {
        System.out.println(from + "发送图片给" + this.name + "，内容为：" + image);
    }

    public AbstractChatroom getChatroom() {
        return chatroom;
    }

    public void setChatroom(AbstractChatroom chatroom) {
        this.chatroom = chatroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
