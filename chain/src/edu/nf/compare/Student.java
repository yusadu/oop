package edu.nf.compare;

import java.util.Collections;

public class Student implements Comparable{

    public Student(){

    }

    public Student(String name,Integer age){
        this.name=name;
        this.age=age;
    }

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 实现排序的比较逻辑
     * >返回1,==返回0,<返回-1
     * @param o 用于比较的对象，也就是当前类的一整个实例
     * @return
     */
    @Override
    public int compareTo(Object o){
        if(o instanceof Student){
            Student s=(Student) o;
            //编写比较规则
//            if(age>s.getAge()){
//                return 1;
//            }else if(age<s.getAge()){
//                return -1;
//            }else{
//                return 0;
//            }
            //由于Integer已经实现了Comparable接口，
            //因此可以直接调用Integer类中的compareTo方法比较即可
            return age.compareTo(s.getAge());
        }else {
            throw new ClassCastException("类型转换失败");
        }
    }


}
