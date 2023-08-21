package com.bcaf;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String text = "kodoks";
        char [] input =  text.toCharArray();

        int len = input.length;
        int start = 0;
        int end = len-1;
        int mid = len/2;

        boolean isPalindrome = true;

        while (start != mid) {
            System.out.println(end);
            if (input[start] != input[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }
        System.out.println(isPalindrome);
    }
}