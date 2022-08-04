package com.globallogic.collections;

public class Exceptions {
    public static void main(String[] args) {
        int a=6;
        int b=0;
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("Reason for the exception is " + e);
        }
    }
}
