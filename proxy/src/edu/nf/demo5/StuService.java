package edu.nf.demo5;

import org.evergreen.aop.annotation.Interceptors;

/**
 * 注解标注在类上会代理这个类的所有方法
 * 注解标注在方法上只会代理当前的方法
 */
@Interceptors(StuServiceInterceptor.class)
public class StuService {
    public void add(String name){
        System.out.println("添加学生信息"+name);
    }

    public void update(){
        System.out.println("更新学生信息");
    }
}
