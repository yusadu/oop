package edu.nf.singleton;

/**
 * 饿汉式单列
 */
public class People {
    /**
     * 创建一个自身类的实例
     */
    private static  People instance=new People();

    /**
     * 将构建方法私有化
     */
    private People(){

    }

    /**
     * 提供一个获取本类实例的静态方法给外部访问
     * @return
     */
    public static People getInstance(){
        return instance;
    }

    public void say(){
        System.out.println("say...");
    }
}
