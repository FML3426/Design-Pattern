package structural.proxy.dynamicProxy1.subject.real;

import structural.proxy.dynamicProxy1.subject.AbstractSubject;

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
