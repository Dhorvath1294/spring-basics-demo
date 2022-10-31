package com.example.demo.bean;

// A simple POJO can be used in conjunction with the @Bean annotation to create beans

public class DemoBean {

    private String name;
    private int age;

    public DemoBean(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("DemoBean instantiated.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
