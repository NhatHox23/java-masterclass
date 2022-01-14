package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

//        int switchValue = 4;
//        switch (switchValue) {
//            case 1 -> System.out.println("value was 1");
//            case 2 -> System.out.println("value was 2");
//            case 3, 4, 5 -> {
//                System.out.println("was a 3, or a 4, or a 5");
//                System.out.println("Actually it was a " + switchValue);
//            }
//            default -> System.out.println("Was not 1 or 2");
//        }

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String: ");
        char charValue = in.next().charAt(0);

        switch (Character.toUpperCase(charValue)) {
            case 'A' -> System.out.println("A was found");
            case 'B' -> System.out.println("B was found");
            case 'C', 'D', 'E' -> System.out.println("C or D or E");
            default -> System.out.println("Could not find ");
        }
    }
}
