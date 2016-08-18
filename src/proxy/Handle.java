package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by solax on 2016/8/17.
 */
public class Handle implements InvocationHandler{

    public static void main(String [] args) {
        People zjy    = new People("张君毅");
        Handle handel = new Handle(zjy);

        ClassLoader cl = zjy.getClass().getClassLoader();
        PeopleImp proxy   = (PeopleImp)Proxy.newProxyInstance(cl, new Class[]{PeopleImp.class}, handel);
        proxy.count();
        proxy.count();
        proxy.count();
    }

    private Object obj = null;

    Handle (Object _obj) {
        this.obj = _obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("im invoke");
        Object result =method.invoke(this.obj, args);
        return result;
    }
}
