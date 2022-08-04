package com.collections;
class AnonyDemo{
    public void call(){}
    public void drop(){}
}
public class anonymous_class {
    public static void main(String[] args) {
        AnonyDemo a1 = new AnonyDemo() {
            @Override
            public void call() {
                System.out.println("Calling");
            }

            @Override
            public void drop() {
                System.out.println("Call Ended");
            }
        };
        a1.call();
        a1.drop();
    }
}
