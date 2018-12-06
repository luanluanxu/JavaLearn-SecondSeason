package com.czxy.lzh;

public class Student extends Person{

    Student(String name) {
        super(name);
    }

    @Override
    void walk() {
        System.out.println(this.name + "walking");
    }

    @Override
    void eat() {
        System.out.println(this.name + "eating");
    }

    @Override
    void sleep() {
        System.out.println(name + "sleeping");
    }

    void study() {
        System.out.println(name + "studying");
    }
}
