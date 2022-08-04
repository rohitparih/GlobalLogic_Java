package com.globallogic.collections;
interface Numb{
    void numb1(int a);
}
public class Hehe {
    public static void main(String[] args) {
        int n=7;
        Numb ab = (a) -> {
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
            }
        };
        ab.numb1(n);
    }
}
