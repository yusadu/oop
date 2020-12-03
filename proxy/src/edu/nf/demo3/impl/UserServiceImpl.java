package edu.nf.demo3.impl;

import edu.nf.demo3.ServiceInf;

public class UserServiceImpl implements ServiceInf {

    @Override
    public void add() {
        System.out.println("添加用户...");
        //记录日志
//        System.out.println("记录操作日志");
    }

    @Override
    public void update() {
        System.out.println("修改用户...");
    }

    @Override
    public void get() {
        System.out.println("查询用户...");
    }
}
