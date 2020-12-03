package edu.nf.demo.impl;

import edu.nf.demo.Observer;

public class ObserverB implements Observer {
    @Override
    public void doSomething(String message) {
        System.out.println("ObserverB处理消息： " + message);
    }
}
