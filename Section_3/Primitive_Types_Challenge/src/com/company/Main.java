package com.company;

public class Main {

    public static void main(String[] args) {
        byte myByteValue = 123;
        short myShortValue = 12312;
        int myIntValue = 100000;
        long myLongValue = 50000L + 10L * (myByteValue + myShortValue + myIntValue);
        System.out.println("Long Value = " + myLongValue);
    }
}
