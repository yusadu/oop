package edu.nf;

import edu.nf.abstractfactory.AbstractFactory;
import edu.nf.abstractfactory.impl.MiFactory;
import edu.nf.containerfactory.ContrainerFactory;
import edu.nf.item.Pad;
import edu.nf.item.Phone;
import edu.nf.item.impl.MiPad;
import edu.nf.methodfactory.impl.ApplePhoneFactory;
import edu.nf.simplefactory.SimpleFactory;
import edu.nf.superfactory.ObjectFactory;

public class Main {

    public static void main(String[] args) {
        //简单工厂（可以创建任意多个对象），缺点在于当有新的对象加入时
        //必须修改原有的工厂
//       Phone phone= SimpleFactory.build("mi");
//        phone.call();
//        phone.message();

        //工厂方法（每一个工厂只负责创建一种对象），优点就是很好解决了OCP原则的问题
        //缺点则是当对象过多的时候，工厂类也会随之增长，从而变成类爆炸
//        AbstractFactory factroy=new ApplePhoneFactory();
//        Phone phone=factroy.build();
//        phone.call();
//        phone.message();

        //抽象工厂（每一个工厂可以生产多种产品），解决了工厂方法单一的问题
        //导致工厂类众多，抽象工厂可以生产整个产品族
//        AbstractFactory factory=new MiFactory();
//        Pad pad=factory.buildPad();
//        Phone phone=factory.buildPhone();
//        pad.play();
//        phone.call();

        //超级工厂，在简单工厂的基础上结合反射
//        Phone phone=ObjectFactory.build("edu.nf.item.impl.ApplePhone");
//        phone.call();
//        phone.message();

        //容器工厂，利用注解标识，在扫描时如果类上带有自定义注解的类就表示要纳入容器中管理
        //此时容器工厂就会预先将这些类的实例初始化好
        //保存在容器（Map集合）中
        ContrainerFactory factory=new ContrainerFactory();
        Phone phone=factory.getContainerBean("applePhone");
        phone.message();
        phone.call();
        Pad pad=factory.getContainerBean("miPad");
        pad.read();
        pad.play();
    }
}
