package edu.nf.demo2;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        //创建回调处理器
        DemoInvocationHandler handler=new DemoInvocationHandler(new TargetImpl());
        //使用jdk提供的Proxy工具类来创建代理对象
        //newProxyInstance方法三个参数说明：
        //参数一：任意一个类加载器实例，因为jdk在运行时动态创建的代理字节码需要使用一个类加载器加载到jvm中才可以创建代理对象
        //参数二：目标对象实现的所有接口的Class，因为jdk动态代理会根据这些接口生成一个代理，这个代理也会实现这些接口
        //参数三：回调处理器，代理对象会执行回调处理器的invoke方法来调用目标对象的行为
        DemoInf proxy=(DemoInf) Proxy.newProxyInstance(
                Main.class.getClassLoader(),
                TargetImpl.class.getInterfaces(),
                handler);
        //调用代理对象
        proxy.todo("user1");
    }
}
