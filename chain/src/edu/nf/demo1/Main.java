package edu.nf.demo1;

public class Main {

    public static void main(String[] args) {
        //创建所有的任务处理器
        AbstractHandler handler1=new HandlerA();
        AbstractHandler handler2=new HandlerB();
        AbstractHandler handler3=new HandlerC();
        //装配执行链
        handler1.setHandler(handler2);
        handler2.setHandler(handler3);
        //执行任务链，从链中的是一个任务处理者开始
        handler1.execute(7000);
    }
}
