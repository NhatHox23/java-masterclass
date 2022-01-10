package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer Min Value = " + myMinValue);
        System.out.println("Integer Max Value = " + myMaxValue);
        System.out.println("Busted MAX value = " + (myMaxValue + 1));
        System.out.println("Busted MIN value = " + (myMinValue - 1));

        int myMaxTest = 2_147_483_647;
    }
}
