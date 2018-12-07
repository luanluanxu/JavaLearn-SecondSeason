package com.czxy.lzh;

public class Main {

    public static void main(String[] args) {
        Person p = new Person() {
            @Override
            void walk() {
                System.out.println("he is walking");
            }

            @Override
            public void learn() {
                System.out.println("he is learning");
            }
        };
        p.walk();
        p.learn();

    }
}
