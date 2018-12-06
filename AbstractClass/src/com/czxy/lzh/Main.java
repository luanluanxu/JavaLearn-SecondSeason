package com.czxy.lzh;

public class Main {

    public static void main(String[] args) {
        Person student = new Student("乱序");
        student.eat();
        student.walk();
        student.sleep();
        ((Student) student).study();
    }
}
