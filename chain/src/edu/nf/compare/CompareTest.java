package edu.nf.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareTest {

    public static void main(String[] args) {
        Users u1=new Users("user1",19);
        Users u2=new Users("user2",13);
        Users u3=new Users("user3",16);
        Users u4=new Users("user4",14);
        Users u5=new Users("user5",19);
        List<Users> list=new ArrayList<>();
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        list.add(u5);
        //排序，匿名实现Comparator接口
        Collections.sort(list, new Comparator<Users>() {
            @Override
            public int compare(Users o1, Users o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });
        //使用lambda表达式
        Collections.sort(list, (o1, o2) -> o1.getAge().compareTo(o2.getAge()));
        list.forEach(users -> System.out.println(users.getName()+":"+users.getAge()));
    }
}
