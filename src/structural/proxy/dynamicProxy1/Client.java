package structural.proxy.dynamicProxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import structural.proxy.dynamicProxy1.subject.AbstractSubject;
import structural.proxy.dynamicProxy1.subject.proxy.DynamicProxy;
import structural.proxy.dynamicProxy1.subject.real.RealSubjectA;
import structural.proxy.dynamicProxy1.subject.real.RealSubjectB;

/**
 * Created by ML3426 on 16/9/17.
 *
 * @author ML3426
 */
public class Client {

    public static void main(String[] args) {

        InvocationHandler handler = null;
        AbstractSubject subject = null;

        handler = new DynamicProxy(new RealSubjectA());
        subject = (AbstractSubject) Proxy.newProxyInstance(AbstractSubject.class.getClassLoader(),
                new Class[]{AbstractSubject.class}, handler);
        subject.request();

        System.out.println("------------------------------");

        handler = new DynamicProxy(new RealSubjectB());
        subject = (AbstractSubject) Proxy.newProxyInstance(AbstractSubject.class.getClassLoader(),
                new Class[]{AbstractSubject.class}, handler);
        subject.request();
    }
}
