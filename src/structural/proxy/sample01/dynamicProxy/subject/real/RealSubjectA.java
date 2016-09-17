package structural.proxy.sample01.dynamicProxy.subject.real;

import structural.proxy.sample01.dynamicProxy.subject.AbstractSubject;

/**
 * Created by ML3426 on 16/9/17.
 *
 * @author ML3426
 */
public class RealSubjectA implements AbstractSubject {

    @Override
    public void request() {
        System.out.println("真实主题类A！");
    }
}
