package com.globallogic.collections;

import java.util.Scanner;
class NegtiveRadius extends Exception{
    @Override
    public String toString() {
        return "Radius is always Positive";
    }

    @Override
    public String getMessage() {
        return "Please try again with appropriate value";
    }
}
public class ThrowThrows {
    public static double area(int r) throws NegtiveRadius{
        if(r<0){
            throw new NegtiveRadius();
        }
        return Math.PI *r*r;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        boolean flag = true;
        while(flag){
        System.out.print("Enter the Radius ");
        int r=sc.nextInt();
        try{
            System.out.println("Area is " + area(r));
            flag=false;
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Thanks for Using my Program");
        }
        }

    }
}
