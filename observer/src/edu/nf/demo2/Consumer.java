package edu.nf.demo2;

/**
 * 消息的订阅方
 */
public class Consumer {

    private MessageBroker broker;

    public Consumer(MessageBroker broker) {
        this.broker = broker;
    }

    /**
     * 订阅方法
     */
    public void Subscribe() {
        String message = broker.subscribe();
        System.out.println("订阅者处理消息： " + message);
    }
}
