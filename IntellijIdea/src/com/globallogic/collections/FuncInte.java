package com.globallogic.collections;
interface Table{
    void table1(int a);
}
public class FuncInte {
    public static void main(String[] args) {
        int b = 7;

        Table ab = (a) -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(a + " X " + i + " = " + a * i);
            }
        };
        ab.table1(b);
    }
}
