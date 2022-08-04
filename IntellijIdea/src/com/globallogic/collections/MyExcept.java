package com.globallogic.collections;
class Except extends Exception{
    @Override
    public String toString() {
        return "toString";
    }

    @Override
    public String getMessage() {
        return "getMessage";
    }
}

class MyException extends Exception{
    @Override
    public String toString() {
        return super.toString() + "must be greater than 10";
    }

    @Override
    public String getMessage() {
        return super.getMessage()+"thanks";
    }
}
public class MyExcept {
    public static void main(String[] args) {
        int a=16;
        if(a<10){
            try{
                System.out.println("Thanks");
                //                throw new MyException();
                throw new ArithmeticException("Exception");
            }
            catch (Exception e){
                System.out.println(e);
                System.out.println(e.getMessage());
            }
        }
    }
}
