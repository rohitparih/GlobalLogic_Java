package com.globallogic.collections;
interface Post{
    String check();
}
public class PositiveLamda {
    public static void main(String[] args) {
        int b=6;
        int ans = Integer.signum(b);
        Post ab = () -> {
            if(ans>0){
                return("Positive");
            }
            else if (ans==0) {
                return("Zero");
            }
            else
                return("Negative");

        };
        System.out.println(ab.check());
    }
}