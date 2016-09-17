package structural.proxy.sample01.dynamicProxy.subject.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by ML3426 on 16/9/17.
 *
 * @author ML3426
 */
public class DynamicProxy implements InvocationHandler {

    private Object obj;

    public DynamicProxy() {
    }

    public DynamicProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        preRequest();
        method.invoke(obj, args);
        postRequest();
        return null;
    }

    public void preRequest() {
        System.out.println("调用之前！时间为：" + System.currentTimeMillis());
    }

    public void postRequest() {
        System.out.println("调用之后！时间为：" + System.currentTimeMillis());
    }
}
