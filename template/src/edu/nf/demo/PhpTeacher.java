package edu.nf.demo;

public class PhpTeacher extends Teacher{
    @Override
    public void lesson() {
        System.out.println("上Php课程");
    }

    @Override
    public void homework() {
        System.out.println("布置Php作业");
    }
}
