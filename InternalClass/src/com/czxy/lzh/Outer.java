package com.czxy.lzh;

public class Outer
{
    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    Outer(int age) {
        this.age = age;
    }
    class Inner {
        private int age;
        Inner(int age){
            this.age = age;
        }
        public void showAge() {
            System.out.println("outer age: " + Outer.this.age + " inner age :"+ age);
        }
    }
}
