package com.company;

import java.util.Scanner;

class Queue {
    int[] data;
    int head;
    int tail;
    public Queue(int[] data, int head, int tail) {
        this.data = data;
        this.head = head;
        this.tail = tail;
    }

    public void push(int item){
        data[tail++] = item;
    }
    public int unshift(){
        head ++;
        return data[head - 1];
    }
    public boolean isTemp(){
        if (tail - head == 0) {
            return true;
        } else {
            return false;
        }
    }
    public void show(){
        int i;
        for(i = head; i < tail; i++){
            System.out.print(data[i] + " ");
        }
    }
}

class Stack {
    int[] data;
    int top;

    public Stack(int[] data, int top) {
        this.data = data;
        this.top = top;
    }

    public int pop(){
        int temp = data[--top];
        data[top] = 0;
        return temp;
    }
    public void push(int item){
        data[top++] = item;
    }
    public void show(){
        int i;
        for(i = 0; i < top; i++){
            System.out.print(data[i] + " ");
        }
    }
}
public class CardGame {
    public static void main(String[] args){
        Scanner input = new Scanner( System.in );
        int i, count;

        int[] a = new int[1000];
        int[] b = new int[1000];
        int[] c = new int[1000];

        for (i = 0; i < 1000; i++) {
            a[i] = b[i] = c[i] = 0;
        }

//        count = input.nextInt();

        Stack s = new Stack(c, 0);

//        for (i = 0; i < count; i++) {
//            a[i] = (int)Math.ceil(Math.random() * 9);
//            b[i] = (int)Math.ceil(Math.random() * 9);
//        }

        a[0] = 2; a[1] = 4; a[2] = 1; a[3] = 2; a[4] = 5; a[5] = 6;
        b[0] = 3; b[1] = 1; b[2] = 3; b[3] = 5; b[4] = 6; b[5] = 4;

        show(a, 6, "a");
        show(b, 6, "b");

        Queue aq = new Queue(a, 0, 6);
        Queue bq = new Queue(b, 0, 6);

        while(!aq.isTemp() && !bq.isTemp()){
            int temp = aq.unshift();
            getCard(s, temp, aq);
            if(aq.isTemp()) break;
            temp = bq.unshift();
            getCard(s, temp, bq);
        }

        if (aq.isTemp()) {
            System.out.println("小哈赢");
        } else {
            System.out.println("小哼赢");
        }
        System.out.print("小哼的手上的牌为：");
        aq.show();
        System.out.println();
        System.out.print("小哈的手上的牌为：");
        bq.show();
        System.out.println();
        System.out.print("桌子上的牌为：");
        s.show();
        System.out.println();
    }

    public static void getCard(Stack s, int temp, Queue q){
        s.push(temp);
        int i;
        for(i = 0;i < s.top - 1; i++){
            if(temp == s.data[i]){
                break;
            }
        }
        if(i != s.top - 1){
            while(s.top - 1 >= i){
                q.push(s.pop());
            }
        }
    }
    public static void show(int[] a, int l, String name){
        System.out.println(name +":>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for (int i = 0; i < l; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
}
