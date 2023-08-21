package com.bcaf.praktikum;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = scan.nextLine();

        String text2 = "asd";
        System.out.println(text2.substring(1, 3));

        char[] textArr = text.toCharArray();

        int len = textArr.length;
        int sum = 0;

        for (int i=0; i < len; i++) {
            if(textArr[i] >= 65 && textArr[i] <= 90 || textArr[i] >= 97 && textArr[i] <= 122) {
                sum += textArr[i];
            }
        }

        System.out.println(sum);
    }
}
