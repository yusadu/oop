package edu.nf.demo4;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class UserServiceMethodInterceptor implements MethodInterceptor {

    /**
     *
     * @param proxy 运行时创建的代理对象
     * @param method 目标对象正在调用的方法
     * @param args 目标对象方法所需的参数
     * @param methodProxy 目标对象方法的代理实例
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object object=null;
        if("say".equals(method.getName())){
            System.out.println("after...");
            //由于动态代理创建的代理对象是一个子类，
            //因此要调用目标对象的方法（也就是父类）时，
            //使用methodProxy.invokeSuper()
            object=methodProxy.invokeSuper(proxy,args);
            System.out.println("before...");
        }else{
            object=methodProxy.invokeSuper(proxy,args);
        }
        return object;
    }
}
