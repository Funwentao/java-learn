package com.company;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int i;
        int[] a = new int[10];

        for (i = 0; i < 10; i++) {
            a[i] = input.nextInt();
        }

        sort(0,9, a);

        for (i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }

    }

    static void sort (int left, int right, int[] a){
        int i, j, t, temp;
        if (left > right) {
            return;
        }

        temp = a[left];
        i = left;
        j = right;
        while (i != j) {
            while(a[j] >= temp && i < j){
                j--;
            }
            while (a[i] <= temp && i < j) {
                i++;
            }
            if(i < j) {
                t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        a[left] = a[i];
        a[i] = temp;

        sort(left, i-1, a);
        sort(i+1, right, a);
    }
}
