package edu.nf.demo;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    /**
     * 观察者列表，用于注册所有的观察者对象
     * 当主题有变更时，会通知列表中的所有观察者
     */
    private List<Observer> list = new ArrayList<>();

    /**
     * 添加观察者(注册)
     *
     * @param observer
     */
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    /**
     * 移除观察者
     *
     * @param observer
     */
    public void remove(Observer observer) {
        list.remove(observer);
    }

    /**
     * 通知方法，一旦主题有变化或者有新的消息，就会通知所有的观察者
     *
     * @param message
     */
    protected void notifyObservers(String message) {
        list.forEach(observer -> observer.doSomething(message));
    }
}
