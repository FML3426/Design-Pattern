package behavioral.command;

import behavioral.command.controller.Controller;
import behavioral.command.controller.command.AbstractCommand;
import behavioral.command.controller.command.impl.TVChangeCommand;
import behavioral.command.controller.command.impl.TVCloseCommand;
import behavioral.command.controller.command.impl.TVOpenCommand;

/**
 * Created by ML3426 on 2016/9/22.
 *
 * @author ML3426
 */
public class Client {

    public static void main(String[] args) {
        AbstractCommand openCommand, closeCommand, changeCommand;

        openCommand = new TVOpenCommand();
        closeCommand = new TVCloseCommand();
        changeCommand = new TVChangeCommand();

        Controller tvController = new Controller(openCommand, closeCommand, changeCommand);

        tvController.open();
        tvController.change();
        tvController.close();
    }
}
