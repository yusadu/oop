package edu.nf.demo;

public class Main {

    public static void main(String[] args) {
        Teacher teacher1=new JavaTeacher();
        teacher1.doWork();
        System.out.println("--------------------");
        Teacher teacher2=new EnglishTeacher();
        teacher2.doWork();
    }
}
