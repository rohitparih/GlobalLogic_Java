package com.globallogic.Java8;
//Functional Interface
interface rohit{
    void parihar();
}
public class MethodReferences {
    public static void say(){
        System.out.println("My name is Rohit Parihar");
    }
    public static void main(String[] args) {
        //Referring Static Method
        rohit rr = MethodReferences::say;
        //Calling Interface method
        rr.parihar();
    }
}
