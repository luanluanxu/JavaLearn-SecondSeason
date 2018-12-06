package com.czxy.lzh;

public abstract class Person {
    protected String name;
    Person(String name) {
        this.name = name;
    }
    abstract void walk();
    abstract void eat();
    abstract void sleep();
}
