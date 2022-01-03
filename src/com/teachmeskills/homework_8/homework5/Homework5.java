package com.teachmeskills.homework_8.homework5;

import java.util.Scanner;

public class Homework5 {

    public void duplicatedLetter() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char arr = input.charAt(i);
            string.append(arr).append(arr);
        }
        System.out.print(string);
    }
}
