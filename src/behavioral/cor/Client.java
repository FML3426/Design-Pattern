package structural.cor;

import structural.cor.handler.Leader;
import structural.cor.handler.impl.Director;
import structural.cor.handler.impl.GeneralManager;
import structural.cor.handler.impl.Manager;
import structural.cor.handler.impl.ViceGeneralManager;
import structural.cor.request.LeaveRequest;

/**
 * Created by ML3426 on 16/9/19.
 *
 * @author ML3426
 */
public class Client {

    public static void main(String[] args) {
        Leader director, manager, viceManager, generalManager;

        director = new Director("王明");
        manager = new Manager("赵强");
        viceManager = new ViceGeneralManager("李波");
        generalManager = new GeneralManager("肖红");

        director.setSuccessor(manager);
        manager.setSuccessor(viceManager);
        viceManager.setSuccessor(generalManager);

        LeaveRequest lr1 = new LeaveRequest("张三", 2);
        director.handleRequest(lr1);

        LeaveRequest lr2 = new LeaveRequest("李四", 5);
        director.handleRequest(lr2);

        LeaveRequest lr3 = new LeaveRequest("王五", 15);
        director.handleRequest(lr3);

        LeaveRequest lr4 = new LeaveRequest("赵六", 25);
        director.handleRequest(lr4);
    }
}
