package behavioral.command.controller;

import behavioral.command.controller.command.AbstractCommand;

/**
 * Created by ML3426 on 2016/9/22.
 *
 * @author ML3426
 */
public class Controller {

    private AbstractCommand openCommand, closeCommand, changeCommand;

    public Controller(AbstractCommand openCommand, AbstractCommand closeCommand,
                      AbstractCommand changeCommand) {
        this.openCommand = openCommand;
        this.closeCommand = closeCommand;
        this.changeCommand = changeCommand;
    }

    public void open() {
        openCommand.execute();
    }

    public void change() {
        changeCommand.execute();
    }

    public void close() {
        closeCommand.execute();
    }
}
