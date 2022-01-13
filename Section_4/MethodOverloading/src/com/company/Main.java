package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(6, -10));
    }


    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }
        return ((feet * 12) + inches) * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        return inches * 2.54;
    }

}
