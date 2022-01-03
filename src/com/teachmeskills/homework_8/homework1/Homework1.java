package com.teachmeskills.homework_8.homework1;

public class Homework1 {
    public static void documentNumberEndsOn(String num) {
        System.out.println(num.endsWith("1a2b"));
    }

    public static void sequence(String num) {
        System.out.println(num.startsWith("555"));
    }

    public static void certainSequence(String num) {
        System.out.println(num.toLowerCase().contains("abc"));
    }

    public static void firstBlockOf4Digits(String num) {
        String[] numberDoc1 = num.split("-");
        System.out.println(numberDoc1[0] + numberDoc1[2]);
    }

    public static void replacementLetters(String num) {
        String[] numberDoc2 = num.split("-");
        numberDoc2[1] = numberDoc2[1].replace("y", "M");
        numberDoc2[3] = numberDoc2[1].replace("y", "M");
        for (int i = 0; i < numberDoc2.length; i++) {
            System.out.print(numberDoc2[i]);
        }
        System.out.println();
    }

    public static void specificFormat(String num) {
        String[] numberDoc3 = num.toLowerCase().replace("x", "/").split("-");
        for (int i = 0; i < numberDoc3.length; i++) {
            System.out.print(numberDoc3[i]);
        }
        System.out.println();
    }

    public static void specificFormatStringBuilder(String num) {
        StringBuilder stringBuilder = new StringBuilder("Letters:");
        num.toUpperCase();
        char[] strings = num.toCharArray();
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == 'x') {
                strings[i] = '/';
            }
        }
        for (char string : strings) {
            stringBuilder.append(string);
        }
        System.out.println(stringBuilder);
    }
}
