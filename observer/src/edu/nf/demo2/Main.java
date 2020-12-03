package edu.nf.demo2;

public class Main {
    public static void main(String[] args) {
        //创建消息队列
        MessageBroker broker = new MessageBroker();
        //创建订阅者
        Consumer consumer = new Consumer(broker);
        //创建发布者
        Producer producer = new Producer(broker);
        //订阅消息
        producer.publish("Hello world");
        //订阅消息
        consumer.Subscribe();
    }
}
