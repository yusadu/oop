package edu.nf.demo;

import edu.nf.demo.impl.ObserverA;
import edu.nf.demo.impl.ObserverB;
import edu.nf.demo.impl.SubjectA;

public class Main {
    public static void main(String[] args) {
        //创建主题
        SubjectA subject = new SubjectA();
        //创建多个观察者
        Observer observerA = new ObserverA();
        Observer observerB = new ObserverB();
        //将观察者注册到（添加）到具体的主题上
        subject.addObserver(observerA);
        subject.addObserver(observerB);
        subject.publish("Hello world !");
    }
}
