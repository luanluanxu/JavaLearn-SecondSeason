package com.czxy.lzh;

public class Person implements Study {

    private String name;

    Person(String name) {
        this.name = name;
    }
    @Override
    public void readBook() {
        System.out.println(name + "reading book");
    }

    @Override
    public void write() {
        System.out.println(name + "writing");
    }

    @Override
    public void test() {
        System.out.println(name + "testing");
    }
}
