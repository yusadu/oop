package edu.nf.demo2;

/**
 * 目标对象（被代理对象）
 */
public class TargetImpl implements DemoInf{
    @Override
    public void todo(String name) {
        System.out.println("执行业务逻辑操作"+name);
    }
}
