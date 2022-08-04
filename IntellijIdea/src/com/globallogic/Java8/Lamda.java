package com.java8;


    // functional Interface -> It contains only one Abstract Method
    interface add{
        int ad(int a, int b);
    }

    interface Name{
        String na(String names);
    }
public class Lamda{
    /*Feature of Java 8.
    There should be a Functional Interface to use Lamda Function.*/

        public static void main(String[] args) {
            int c=6;
            int d=7;

            //With return keyword
            add ad1 = (a,b) -> {
                return a+b;
            };
            System.out.println(ad1.ad(c,d));

            //Without return keyword
            add ad2 = (a,b) -> (a+b);
            System.out.println(ad2.ad(c,d));

            //Single Parameter
            Name na1 = (names) -> {
                return "My name is " + names;
            };
            System.out.println(na1.na("Rohit"));

            //Single Paranmeter so we can avoid Paranthesis for names parameter.
            Name na2 = names -> {
                return "My name is " + names;
            };
            System.out.println(na2.na("Rohit"));

        /*
        1. We can use data type in multiple parametre
            add ad2 = (int a,int b) -> (a+b);

         */
        }

    }


