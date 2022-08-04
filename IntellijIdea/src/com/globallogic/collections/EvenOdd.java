package com.globallogic.collections;
interface EO{
    void eo(int a);
}
public class EvenOdd {
    public static void main(String[] args) {
        EO ab = (a) -> {
            if(a%2==0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
        };
        ab.eo(5);
    }
}