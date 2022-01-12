package com.aca;

import java.util.Random;

public class homework_DAY_12 {
    public static void main(String[] args) {
        //Num_4
        /*int length = new Random().nextInt(5) + 5;
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = new Random().nextInt(10);
        }
        System.out.println(func(array));*/

        //Num_5
        /*int lengt = new Random().nextInt(5) + 5;
        int[] array = new int[lengt];
        for (int i = 0; i < lengt; i++) {
            array[i] = new Random().nextInt(10);
        }
        for (int i = 0; i < lengt; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(search(array, 5, 6));*/

        //Num_6
        /*System.out.println(Square(5, 4));*/

        //Num_7
        /*System.out.println(max(5, 4, 6, 8));*/

        //Num_8
        /*System.out.println(distance(4, 5, 6, 7));*/

        //Num_10
        /*System.out.println(reminder(330, 5));*/
    }

    //Num_1
    /*public static void add(int a, int b, int c) {
    }
    public static void add(int a, int b) {
    }
    public static void add(int a, float b) {
    }
    public static void add(float a, int b) {
    }*/

    //Num_2
    /*public static int func(float a) {
        int b = (int) a;
        return b;
    }
    public static float func(float a) {
        return a;
    }*/

    //Num_3
    /*public static int func(int a) {
        int b = (int) a;
        return b;
    }
    public static float func(float a) {
        return a;
    }*/

    //Num_4
    /*public static String func(int[] array) {
        String a = "[";
        for (int i = 0; i < array.length; i++) {
            String x = array[i] + "";
            if (i < array.length - 1)
                a = a + x + ",";
            else
                a = a + x;
        }
        a = a + "]";
        return a;
    }*/

    //Num_5
    /*//A
    public static int search(int[] array) {
        return array.length;
    }
    //B
    public static int search(int[] array, int a) {
        return array[a];
    }
    //C
    public static boolean search(int[] array, int arg, int index) {
        if (array[index] == arg)
            return true;
        else
            return false;
    }*/

    //Num_6
    /*public static float Square(int a) {
        return 3.14f * a * a;
    }
    public static float Square(float a) {
        return a * a;
    }
    public static int Square(int a, int b) {
        return a * b;
    }*/

    //Num_7
    /*public static int max(int a, int b) {
        return Math.max(a, b);
    }
    public static int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
    public static int max(int a, int b, int c, int d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }*/

    //Num_8
    /*public static double distance(int x, int y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }*/

    //Num_10
    /*public static int reminder(int a) {
        int res = 0;
        for (int i = a; i > 1; i = i/10) {
            res = res + i % 10;
        }
        return res;
    }
    public static int reminder (int a, int b) {
        int res = 0;
        for (int i = a; i > 1; i /= 10) {
            res = res + i % 10;
        }
        return res % b;
    }*/
}
