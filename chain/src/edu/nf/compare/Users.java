package edu.nf.compare;

public class Users {
    public Users(){

    }

    public Users(String name,Integer age){
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
}
