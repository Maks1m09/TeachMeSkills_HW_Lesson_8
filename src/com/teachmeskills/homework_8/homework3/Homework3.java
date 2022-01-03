package com.teachmeskills.homework_8.homework3;

import java.util.Scanner;

public class Homework3 {
    private int diff(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        String chars;
        for (int i = 0; i < string.length(); i++) {
            chars = String.valueOf(string.charAt(i));
            if (stringBuilder.indexOf(chars) == -1)
                stringBuilder.append(chars);
        }
        return stringBuilder.length();
    }

    public void wordWithTheMinimumNumberOfCharacters() {
        System.out.println("Start");
        System.out.println("Enter you text");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] stringsArray = string.split(" ");
        String word = stringsArray[0];
        for (String strings : stringsArray) {
            if (diff(strings) < diff(word)) {
                word = strings;
            }
        }
        System.out.println("Word - " + word);
        System.out.println("End");
    }
}

