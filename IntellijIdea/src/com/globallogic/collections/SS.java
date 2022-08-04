package com.globallogic.collections;
interface HH{
    String Hh(String st);
}
public class SS {
    public static void main(String[] args) {
        String str = "Rohit";
        HH ab = (st) -> {return st.toUpperCase();};
        System.out.println(ab.Hh(str));
    }
}
