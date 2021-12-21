package com.aca;

import java.util.Scanner;

public class lesson4_loops {
    public static void main(String[] args) {
        /*int i = 0;
        while (i<=10) {
            System.out.println("i = " + i);
            i++;
        }*/

        /*int i = 0;
        while (i<=20) {
            System.out.println("i = " + i);
            i = i + 2;
        }*/

        /*int i = 5;
        while (i <= 100) {
            System.out.println("i = " + i);
            i = i + 5;
        }*/

        /*int  i = 1;
        int x = 1;
                while (x <= 100) {
                    System.out.println(x);
                    i++;
                    x = i * i;
                }*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int number = sc.nextInt();
        int i = 2;
        while (i <= number) {
            if (number%i == 0) {
                System.out.println(i);
                break;
            }
            else
                i++;
        }*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int number = sc.nextInt();
        int i = 0;
        while (number > Math.pow(2, i)) {
            i++;
        }
        System.out.println(i++);*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int number = sc.nextInt();
        int i = 1, j = 0;
        while (i > 0) {
            if (i >= number) {
                System.out.println(j);
                break;
            }
            else {
                i = i * 2;
                j++;
            }
        }*/


        /*int i = 0;
        boolean a = true;
        while (a) {
            System.out.println(i);
            if (i == 10) {
                a = false;
                break;
            }
            else
                i++;
        }*/

        /*int i = 1;
        while (i > 0) {
            if (i%3 == 0 && i%5 == 0) {
                System.out.println(i);
                break;
            }
            else
                i++;
        }*/

        /*for (int i = 0; i <= 20; i = i+2) {
            System.out.println(i);
        }*/

        /*Scanner sc = new Scanner(System.in);                //?????????????????????????
        System.out.println("Введите число");
        int number = sc.nextInt();
        int j = 0;
        for (int i = 1; i <= number; i++) {
            j = j + j * i;
        }
            System.out.println(j);*/

        /*first:
        while (true) {
            System.out.println("first");
            second:
            while (true) {
                System.out.println("second");
                break first;
            }
        }*/

        /*for (int i = 0; i <= 10; i++) {
            if (i == 7)
                continue;
            System.out.println(i);
        }*/




    }
}
