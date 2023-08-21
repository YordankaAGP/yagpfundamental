package com.bcaf.ujian;

import java.util.Random;
import java.util.Scanner;

public class UjianJF11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Jumlah data format no handphone yang ingin di generate : ");

        Integer times = scan.nextInt();

        StringBuilder text = new StringBuilder();

        String[] prefixStr = {"0", "62"};
        String[] telcoStr = {"12", "13", "57", "56", "52"};


        for(int i=0; i<times; i++){
            text.setLength(0);
            int prefixNum = rand.nextInt(2);
            int telcoNum = rand.nextInt(telcoStr.length);
            int lastLength = rand.nextInt(4) + 4;

            text.append(prefixStr[prefixNum]);
            text.append(8);
            text.append(telcoStr[telcoNum]);
            text.append("-");
            text.append(rand.nextInt(900) + 100);
            text.append("-");
            for (int j = 0; j < lastLength; j++) {
                int digit = rand.nextInt(10);
                text.append(digit);
            }

            System.out.println(text.toString());
        }

    }
}
