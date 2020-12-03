package edu.nf.demo2;

/**
 * 消息的发布方
 */
public class Producer {

    private MessageBroker broker;

    public Producer(MessageBroker broker) {
        this.broker = broker;
    }

    /**
     * 发布方法
     *
     * @param message
     */
    public void publish(String message) {
        System.out.println("发布者发布消息： " + message);
        broker.publish(message);
    }
}
