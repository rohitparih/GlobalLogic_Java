package com.globallogic.Java8;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        String st = null;
        System.out.println(Optional.ofNullable(st).isPresent());
        //System.out.println(Optional.ofNullable(st).get());
        System.out.println(Optional.ofNullable(st).orElse("This String is Empty"));
    }
}
