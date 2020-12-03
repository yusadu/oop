package edu.nf.demo.impl;

import edu.nf.demo.Observer;

public class ObserverA implements Observer {
    @Override
    public void doSomething(String message) {
        System.out.println("ObserverA处理消息： "+message);
    }
}
