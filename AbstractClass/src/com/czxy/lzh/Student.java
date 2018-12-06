package com.czxy.lzh;

public class Student extends Person{

    private String name;

    Student(String name) {
        this.name = name;
    }

    @Override
    void walk() {
        System.out.println(name + "walking");
    }

    @Override
    void eat() {
        System.out.println(name + "eating");
    }

    @Override
    void sleep() {
        System.out.println(name + "sleeping");
    }

    void study() {
        System.out.println(name + "studying");
    }
}
