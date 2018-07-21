package com.company;

import java.util.Scanner;

public class BucketSort {

    public static void main(String[] args) {
        int[] book = new int[11], a = new int[5];
        int i, j;

        Scanner input = new Scanner( System.in );

        for (i = 0; i < 11; i++) {
            book[i] = 0;
        }

        for (i= 0; i < 5; i++) {
            a[i] = input.nextInt();
        }

        for (i = 0; i < 5;i++) {
            book[a[i]] ++;
        }

        for (i = 10; i > -1; i--) {
            for (j = 0;j < book[i]; j++) {
                System.out.println(i);
            }
        }
    }
}
