package com.company;

import java.util.Scanner;

public class BuyBook {

    public static void main(String[] args){
        Scanner input = new Scanner( System.in );
        int count, i, t;
        int[] book = new int[1001];

        for (i = 1; i < 1001 ;i++) {
            book[i] = 0;
        }

        count = input.nextInt();

        for(i = 0; i < count; i++) {
            t = input.nextInt();
            book[t] = 1;
        }

        for (i = 1; i < 1001; i++) {
            if(book[i] == 1){
                System.out.println(i);
            }
        }
    }
}
