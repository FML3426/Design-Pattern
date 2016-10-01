package behavioral.mediator.colleague.impl;

import behavioral.mediator.colleague.Member;

/**
 * Created by ML3426 on 2016/10/1.
 *
 * @author ML3426
 */
public class CommonMember extends Member {

    public CommonMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String message) {
        System.out.println("普通会员发送信息：");
        chatroom.sendText(name, to, message);
    }

    @Override
    public void sendImage(String to, String image) {
        System.out.println("普通会员不能发送图片！");
    }
}
