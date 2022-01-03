package com.teachmeskills.homework_8.homework2;

import java.util.Scanner;

public class Homework2 {
    public void longestWord() {
        System.out.println("Start");
        System.out.println("Enter text");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] strings = string.split(" ");
        String max = "";
        for (String s : strings) {
            if (s.toCharArray().length > max.length()) {
                max = s;
            }
        }
        System.out.println(max);
        System.out.println("End");
    }

    public void shortestWord() {
        System.out.println("Start");
        System.out.println("Enter text");
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String[] strings1 = string1.split(" ");
        String min = strings1[0];
        for (String s : strings1) {
            if (min.length() > s.length()) {
                min = s;
            }
        }
        System.out.println(min);
        System.out.println("End");
    }
}