package edu.nf.singleton;

/**
 * 懒汉式单列
 */
public class Student {
    private static Student instance;

    private static String key="";

    private Student(){

    }


    /**
     * 懒汉的双重校验，防止多线程的情况下多次创建实例
     * @return
     */
    public static Student getInstance(){
        if(instance==null){
            synchronized (key){
                if (instance!=null){
                    instance=new Student();

                }
            }
        }
        return instance;
    }

    public void say(){
        System.out.println("say...");
    }
}
