package com.company;

public class Main {

    public static void main(String[] args) {
        double myFirstDoubleValue = 20d;
        double mySecondDoubleValue = 80d;
        double totalFirstAndSecond = (myFirstDoubleValue + mySecondDoubleValue) * 100;
        int myRemainder = (int) (totalFirstAndSecond % 40d);
        boolean isZero = (myRemainder == 0) ? true : false;
        System.out.println("myRemainder is Zero : " + isZero);
        if (!isZero) {
            System.out.println("Got some remainder");
        }
    }
}
