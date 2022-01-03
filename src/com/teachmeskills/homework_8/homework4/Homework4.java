package com.teachmeskills.homework_8.homework4;

import java.util.Scanner;

public class Homework4 {

    public void Palindrome() {
        System.out.println("Start");
        System.out.println("Enter text");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] stringsArray = string.split(" ");
        System.out.println("Enter you number");
        int number = scanner.nextInt();
        if (number <= stringsArray.length) {
            StringBuffer stringBuffer = new StringBuffer(stringsArray[number]);
            stringBuffer.reverse();
            if (stringsArray[number].equalsIgnoreCase(stringBuffer.toString())) {
                System.out.println("palindrome - " + stringsArray[number]);
            } else {
                System.out.println("no palindrome - " + stringsArray[number]);
            }
        } else {
            System.out.println("You entered something different");
        }
        System.out.println("End");
    }
}
