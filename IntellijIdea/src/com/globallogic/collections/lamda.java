package com.globallogic.collections;
interface math{
    public void math1(int a);
}
public class lamda {
    public static void main(String[] args) {
//        Functional interface is an interface in which there is only one method.
        int b=7;
        math ab = (a) -> {
            System.out.println("Hello we are in the lamda function" + a);
        };
        ab.math1(b);
    }
}
