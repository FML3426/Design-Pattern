package behavioral.mediator.mediator.impl;

import java.util.HashMap;

import behavioral.mediator.colleague.Member;
import behavioral.mediator.mediator.AbstractChatroom;

/**
 * Created by ML3426 on 2016/10/1.
 *
 * @author ML3426
 */
public class ChatGroup extends AbstractChatroom {

    private HashMap<String, Member> members = new HashMap<>();

    @Override
    public void register(Member member) {
        if (!members.containsValue(member)) {
            members.put(member.getName(), member);
            member.setChatroom(this);
        }
    }

    @Override
    public void sendText(String from, String to, String message) {
        Member toMember = members.get(to);
        String newMessage = message.replaceAll("日", "*");
        toMember.receiveText(from, newMessage);
    }

    @Override
    public void sendImage(String from, String to, String image) {
        Member toMember = members.get(to);
        if (image.length() > 5) {
            System.out.println("图片太大，发送失败！");
        } else {
            toMember.receiveImage(from, image);
        }
    }
}
