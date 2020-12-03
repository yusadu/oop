package edu.nf.demo3;

import edu.nf.demo3.impl.StuServiceImpl;
import edu.nf.demo3.impl.UserServiceImpl;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        ServiceInvocationHandler handler=new ServiceInvocationHandler(new UserServiceImpl());
        ServiceInf proxy=(ServiceInf) Proxy.newProxyInstance(
                Main.class.getClassLoader(),
                UserServiceImpl.class.getInterfaces(),
                handler
        );
       proxy.add();
       proxy.get();
       proxy.update();
    }
}
