package edu.nf.demo1;

public class AcerProxy implements PcFactory{

    /**
     * 目标厂商
     */
    private PcFactory pcFactory;

    public AcerProxy(PcFactory pcFactory){
        this.pcFactory=pcFactory;
    }

    @Override
    public void sell(int money) {
       int a=before(money);
        //调用目标对象的方法
        pcFactory.sell(a);
        //指定after方法
        after();
    }

    /**
     * before方法里面执行利润扣除的业务
     * 并返回出厂价（本金）
     * @param money
     * @return
     */
    private int before(int money){
        System.out.println("代理销售价格："+money);
        //扣除利润
        int i=money-1000;
        System.out.println("获取利润："+i);
        //将本金交付给厂商
        return money-i;
    }

    /**
     * 调用目标方法之后执行的业务逻辑
     */
    private void after(){
        System.out.println("售后服务");
    }
}
