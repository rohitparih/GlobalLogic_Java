package com.globallogic.Java8;

import java.util.Optional;

public class OptionalClassUsingMethod {
    public static Optional<String> me(){
        String name = "Rohit";
        return Optional.ofNullable(name);
    }
    public static void main(String[] args) {
        Optional<String> optionalName = me();
        System.out.println(optionalName.orElse("Not Present"));
    }
}
