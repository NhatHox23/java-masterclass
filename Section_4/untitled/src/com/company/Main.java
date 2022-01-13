package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1924));
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        return year % 100 == 0 && year % 400 == 0;
    }

    public static boolean hasEqualSum(int first, int second, int third) {
        return first + second == third;
    }

    public static boolean hasTeen(int first, int second, int third) {
        if (hasSingleTeen(first)) {
            return true;
        } else if (hasSingleTeen(second)) {
            return true;
        } else return hasSingleTeen(third);
    }

    public static boolean hasSingleTeen(int age) {
        return (age >= 13 && age <= 19);
    }
}
