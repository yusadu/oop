package edu.nf.demo5;

import org.evergreen.aop.core.ProxyBuilder;

public class Main {
    public static void main(String[] args) {
        //创建一个代理生成器
        ProxyBuilder builder=new ProxyBuilder(StuService.class);
        StuService proxy=builder.createProxy();
        proxy.add("sdfsdf");
        System.out.println("--------------------");
        proxy.update();
    }
}
