package behavioral.command.controller.command.impl;

import behavioral.command.controller.command.AbstractCommand;
import behavioral.command.receiver.Television;

/**
 * Created by ML3426 on 2016/9/22.
 *
 * @author ML3426
 */
public class TVCloseCommand implements AbstractCommand {

    private Television tv;

    public TVCloseCommand() {
        tv = new Television();
    }

    @Override
    public void execute() {
        tv.close();
    }
}
