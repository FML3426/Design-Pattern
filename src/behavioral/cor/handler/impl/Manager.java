package behavioral.cor.handler.impl;

import behavioral.cor.handler.Leader;
import behavioral.cor.request.LeaveRequest;

/**
 * Created by ML3426 on 16/9/19.
 *
 * @author ML3426
 */
public class Manager extends Leader {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 10) {
            System.out.println("经理" + name + "审批员工" + request.getLeaveName() +
                    "的请假条，请假天数为" + request.getLeaveDays() + "天。");
        } else {
            if (this.successor != null) {
                this.successor.handleRequest(request);
            }
        }
    }
}
