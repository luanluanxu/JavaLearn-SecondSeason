package com.czxy.lzh;

public class Main
{
    public static void main(String[] args) {
        Outer.Inner inner = new Outer(18).new Inner(20);
        inner.showAge();
    }
}
