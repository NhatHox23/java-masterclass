package com.company;

public class Main {

    public static void main(String[] args) {
    }

    //Area Calculator
    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }
        return x * y;
    }

    // Minutes To Years and Days Calculator
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            long remainderDays = days % 365;
            System.out.println(minutes +
                    " min = " +
                    years +
                    " y and " +
                    remainderDays +
                    " d");
        }
    }

    // Equality Printer
    public static void printEqual(int first, int second, int third) {
        if (first < 0 || second < 0 || third < 0) {
            System.out.println("Invalid Value");
        } else if (first == second && first == third) {
            System.out.println("All numbers are equal");
        } else if (first != second && second != third && first != third) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    // Playing Cat
    public static boolean isCatPlaying(boolean isSummer, int temperature) {
        if (isSummer && (temperature >= 25 && temperature <= 45)) {
            return true;
        } else {
            return !isSummer && (temperature > 25 && temperature < 35);
        }
    }
}
