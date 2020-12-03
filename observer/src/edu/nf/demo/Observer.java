package edu.nf.demo;

/**
 * 抽象的观察者
 */
public interface Observer {

    /**
     * 当主题对象有变化时会通知观察者。
     * 观察者就会执行此方法做相应的处理
     *
     * @param message
     */
    void doSomething(String message);
}
