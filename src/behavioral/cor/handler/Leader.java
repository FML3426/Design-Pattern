package behavioral.cor.handler;

import behavioral.cor.request.LeaveRequest;

/**
 * Created by ML3426 on 16/9/19.
 *
 * @author ML3426
 */
public abstract class Leader {
    protected String name;
    protected Leader successor;

    public Leader(String name) {
        this.name = name;
    }

    public void setSuccessor(Leader successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(LeaveRequest request);
}
