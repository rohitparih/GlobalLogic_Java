package com.globallogic.collections;

import java.util.Arrays;

public class Builder {
    public static void main(String[] args) {
        String stst = "This is an Umbrella of ufyfhvhvyhcdgcv f";
        String[] ar = stst.split(" ");
        int max = 0;

//        Arrays.sort(ar);
        for(int i=0 ; i<ar.length ; i++){
            if(ar[i].length()>ar[max].length()){}
            max=i;
        }
        System.out.println(ar[max]);
    }
}
