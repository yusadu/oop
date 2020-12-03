package edu.nf.demo4;

import net.sf.cglib.proxy.Enhancer;

public class Main {

    public static void main(String[] args) {
        //创建一个代理生成器，用于创建代理对象
        Enhancer enhancer=new Enhancer();
        //给代理生成器设置父类，也就是让cglib给父类动态生成代理子类
        enhancer.setSuperclass(UserService.class);
        //在设置方法拦截器
        enhancer.setCallback(new UserServiceMethodInterceptor());
        UserService proxy=(UserService)enhancer.create();
        proxy.run();
        System.out.println("-----------------");
        proxy.say();

    }
}
