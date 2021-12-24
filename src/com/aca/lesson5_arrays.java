package com.aca;

import java.util.Random;
import java.util.Scanner;

public class lesson5_arrays {
    public static void main(String[] args) {

        //Num_2
        /*int [] nums = new int [100];
        for (int i = 0; i < 100; i++) {
            nums [i] = i;
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(nums[i]);
        }*/

        //Num_3
        /*int [] nums = new int[20];
        int k = 0;
        for (int i = -19; i < 20; i = i + 2) {
            nums [k] = i;
            k++;
        }
        for (k = 0; k < 20; k++) {
            System.out.println(nums[k]);
        }*/

        //Num_4
        /*Scanner Size = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = Size.nextInt();
        int[] array = new int[size];
        for (int i = 0; i<size; i++) {
            Random r = new Random();
            int x = r.nextInt(1000)+1;
            array [i] = x;
            if (array [i] % 5 == 0) {
                System.out.println(array [i]);
            }
        }*/

        //Num_5                                //для начала надо создать массив, а дальше уже взять нужные элементы
        /*Scanner Size = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = Size.nextInt();
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            double rand = Math.random()*1000;
            array [i] = rand;
            if (array [i] > 24.0 && array [i] < 432.28) {
                System.out.println(i + "-ый элемент = " + array[i]);
            }
        }*/

        //Num_6
        /*Scanner Size = new Scanner(System.in);
        System.out.println("Введите желаемый размер массива");
        int size = Size.nextInt();
        int[] array = new int[size];
        int k = 0;
        for (int i = 0; i < size; i++) {
            Random r = new Random();
            int x = r.nextInt(1000)+1;
            array [i] = x;
            if (array[i]%2 == 0) {
                k++;
            }
        }
        System.out.println(k);*/
        
        //Num_7
        /*Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        //Num_8
        /*Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            k++;
            System.out.println();
        }*/


    }
}
