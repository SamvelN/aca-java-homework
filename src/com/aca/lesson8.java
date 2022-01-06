package com.aca;

import java.text.AttributedCharacterIterator;
import java.util.Scanner;

public class lesson8 {
    public static void main(String[] args) {
        //System.out.println(factorial(5));
        //System.out.println(sum(5));
        //System.out.println(sum(2225));
        //System.out.println(ast(5, 3));

    }

    /*public static void writeVertical(int n) {
        if (n < 10)
            System.out.println(n);
        else {
            writeVertical(n/10);
            System.out.println(n % 10);
        }*/

        /*Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = num - 1; i > 0; i--) {
            num = num * i;
        }
        System.out.println(num);*/

        /*Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = 1, num2 = 1, num3;
        for (int i = 0; i < num; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.println(num3);
        }*/

    /*public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }*/

    /*public static int sum(int n) {
        if (n == 0)
            return 0;
        else
            return n + sum(n - 1);
    }*/

    /*public static int sum(int n) {
        if (n / 10 == 0)
            return n % 10;
        else
            return n % 10 + sum(n / 10);
    }*/

    /*public static void reverseArray(int[] data, int low, int high) {
        if (low < high) {
            int temp = data[low];
            data[low] = data[high];
            data[high] = temp;
            reverseArray(data, low + 1, high - 1);
        }
    }*/

    /*public static int ast(int n, int ast) {
        if (ast == 0)
            return 1;
        else
            return n * ast(n, ast - 1);
    }*/

}

