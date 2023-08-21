package com.bcaf.ujian;

import java.util.Random;
import java.util.Scanner;

public class UjianJF12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Jumlah data format email yang ingin di generate : ");

        Integer times = scan.nextInt();
        StringBuilder text = new StringBuilder();

        String[] provider = {"gmail", "rocketmail", "binus", "bcafinance", "juaracoding"};
        String[] domain = {"com", "co.id", "ac.id", "edu", "xyz"};

        UjianJF12 uj = new UjianJF12();

        for(int i=0; i<times; i++){
            text.setLength(0);
            int prefixRand = rand.nextInt(3);
            int providerRand = rand.nextInt(provider.length);
            int domainRand = rand.nextInt(domain.length);

            text.append(uj.getEmailPrefix(prefixRand, rand));
            text.append("@");
            text.append(provider[providerRand]);
            text.append(".");
            text.append(domain[domainRand]);

            System.out.println(text.toString());
        }

    }

    public String getEmailPrefix(int num, Random rand) {
        StringBuilder text = new StringBuilder();
        String number = Integer.toString(rand.nextInt(1000));
        StringBuilder alpha1 = new StringBuilder();
        StringBuilder alpha2 = new StringBuilder();

        int alphaLen = 10 - number.length() + rand.nextInt(5) + 1;

        for(int i=0; i<alphaLen; i++) {
            if(i < alphaLen/2) {
                alpha1.append(Character.toChars(rand.nextInt(25) + 97));
            } else {
                alpha2.append(Character.toChars(rand.nextInt(25) + 97));
            }
        }


        switch (num) {
            case 0: text.append(number).append(alpha1).append(alpha2);
                break;
            case 1: text.append(alpha1).append(number).append(alpha2);
                break;
            case 2: text.append(alpha1).append(alpha2).append(number);
                break;
        }

        return text.toString();
    }
}
