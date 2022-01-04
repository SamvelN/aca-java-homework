package com.aca;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class homework_DAY_8 {
    public static void main(String[] args) {

        //Num_1
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int length = sc.nextInt();
        int [] ar = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Введите " + i + "ый элемент массива");
            ar [i] = sc.nextInt();
        }
        for (int i = 0; i < length; i=i+2) {
            System.out.println(ar[i]);
        }*/

        //Num_2
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int length = sc.nextInt();
        int [] ar = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Введите " + i + "ый элемент массива");
            ar [i] = sc.nextInt();
        }
        for (int i = 1; i < length; i++) {
            if (ar[i]%2 == 0)
            System.out.println(ar[i]);
        }*/

        //Num_3
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int length = sc.nextInt();
        int [] ar = new int[length];
        int k = 0;
        for (int i = 0; i < length; i++) {
            System.out.println("Введите " + i + "ый элемент массива");
            ar [i] = sc.nextInt();
        }
        for (int i = 0; i < length; i++) {
            if (ar[i] > 0) {
                k++;
            }
        }
        System.out.println(k);*/

        //Num_4
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int length = sc.nextInt();
        int [] ar = new int[length];
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            ar[i] = rand.nextInt(100);
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < length-1; i++) {
            if (ar[i+1] > ar[i])
                System.out.println(ar[i+1]);
        }*/

        //Num_5
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int length = sc.nextInt();
        int [] ar = new int[length];
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            ar[i] = -100 + rand.nextInt(200);
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < length-1; i++) {
            if ((ar[i] < 0 && ar[i+1] < 0) || (ar[i] > 0 && ar[i+1] > 0)) {
                System.out.println(ar[i] + " " + ar[i+1]);
                break;
            }
        }*/

        //Num_6
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int length = sc.nextInt();
        int[] ar = new int[length];
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            ar[i] = rand.nextInt(100);
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        int index = 0;
        int min = ar[0];
        for (int i = 0; i < length; i++) {
            if (ar[i] < min) {
                min = ar[i];
                index = i;
            }
        }
        System.out.println(index);
        System.out.println(min);*/

        //Num_7
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int length = sc.nextInt();
        int[] ar = new int[length];
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            ar[i] = -1000 + rand.nextInt(2000);
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        int min = 10000;
        for (int i = 0; i < length; i++) {
            if (ar[i] > 0 && ar[i] < min) {
                min = ar[i];
            }
        }
        System.out.println(min);*/

        //Num_8
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Inout the length of array");
        int length = sc.nextInt();
        int[] ar = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Input the " + i + " number");
            ar[i] = sc.nextInt();
        }
        int amount = 1, k = 0;
        for (int i = 1; i < length; i++) {
            k = 0;
            for (int j = 0; j < i; j++) {
                if (ar[i] == ar[j]) {
                    k = k + 1;
                    break;
                }
            }
            if (k == 0)
                amount = amount + 1;
        }
        System.out.println(amount);*/

        //Num_9
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Please, input the length of array");
        int length = sc.nextInt();
        int [] ar = new int[length];
        for (int i = 0; i < length; i++) {
            ar[i] = new Random().nextInt(100);
            System.out.println("the " + i + " element = " + ar[i]);
        }
        int [] ar_1 = new int[length];
        for (int i = 0; i < length; i++) {
            ar_1[i] = ar[length - 1 - i];
            System.out.print(ar_1[i] + " ");
        }*/

        //Num_10
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Please, input the length of array");
        int length = sc.nextInt();
        int[] ar = new int[length];
        for (int i = 0; i < length; i++) {
            ar[i] = new Random().nextInt(100);
            System.out.println("the " + i + " element = " + ar[i]);
        }
        for (int i = 0; i < length / 2; i++) {
            ar[i] = ar[i] + ar[length - i - 1];
            ar[length - i - 1] = ar[i] - ar[length - i - 1];
            ar[i] = ar[i] - ar[length - i - 1];
        }
        for (int i = 0; i < length; i++) {
            System.out.print(ar[i] + " ");
        }*/

        //Num_11
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Please, input the length of array");
        int length = sc.nextInt();
        int[] ar = new int[length];
        for (int i = 0; i < length; i++) {
            ar[i] = new Random().nextInt(100);
            System.out.println("the " + i + " element = " + ar[i]);
        }
        for (int i = 0; i < length - 1; i = i + 2) {
            ar[i] = ar[i] + ar[i + 1];
            ar[i + 1] = ar[i] - ar[i + 1];
            ar[i] = ar[i] - ar[i + 1];
        }
        for (int i = 0; i < length; i++) {
            System.out.print(ar[i] + " ");
        }*/

        //Num_12
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Please, input the length of array");
        int length = sc.nextInt();
        int[] ar = new int[length];
        for (int i = 0; i < length; i++) {
            ar[i] = new Random().nextInt(100);
            System.out.println(i + " element = " + ar[i]);
        }
        int[] ar_1 = new int[length];
        ar_1[0] = ar[length - 1];
        for (int i = 0; i < length - 1; i++) {
            ar_1[i + 1] = ar[i];
        }
        for (int i = 0; i < length; i++) {
            System.out.print(ar_1[i] + " ");
        }*/

        //Num_13
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Please, input the length of array");
        int length = sc.nextInt();
        System.out.println("Введите максимальное возможное значение элемента массива");
        int max = sc.nextInt();
        int[] ar = new int[length];
        for (int i = 0; i < length; i++) {
            ar[i] = new Random().nextInt(max);
            System.out.println(i + " element = " + ar[i]);
        }
        int minElement = ar[0], MaxElement = ar[0];
        int numofminel = 0, NumOfMaxEl = 0;
        for (int i = 1; i < length; i++) {
            if (ar[i] < minElement) {
                minElement = ar[i];
                numofminel = i;
            }
        }
        for (int i = 1; i < length; i++) {
            if (ar[i] > MaxElement) {
                MaxElement = ar[i];
                NumOfMaxEl = i;
            }
        }
        for (int i = 0; i < length; i++) {
            if (i == numofminel)
                ar[i] = MaxElement;
            else if (i == NumOfMaxEl)
                ar[i] = minElement;
            System.out.print(ar[i] + " ");
        }*/

        //Num_14
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Please, input the length of array");
        int length = sc.nextInt();
        System.out.println("Введите номер элементаб которого хотите удалить");
        int numofel = sc.nextInt();
        int[] ar = new int[length];
        for (int i = 0; i < length; i++) {
            ar[i] = new Random().nextInt(100);
            System.out.println(i + " element = " + ar[i]);
        }
        for (int i = 0; i < length - 1; i++) {
            if (i >= numofel) {
                ar[i] = ar[i + 1];
            }
        }
        length = length - 1;
        for (int i = 0; i < length; i++) {
            System.out.print(ar[i] + " ");
        }*/

        //Num_15
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Please, input the length of array");
        int length = sc.nextInt();
        int[] ar = new int[length];
        for (int i = 0; i < length; i++) {
            ar[i] = new Random().nextInt(4);
            System.out.println(i + " element = " + ar[i]);
        }
        boolean a = true;
        for (int i = 0; i < length; i++) {
            a = true;
            for (int j = 0; j < length; j++) {
                if (i == j)
                    continue;
                if (ar[i] == ar[j])
                    a = false;
            }
            if (a)
                System.out.println(ar[i]);
        }*/

        //Num_15
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Please, input the length of array");
        int length = sc.nextInt();
        int[] ar = new int[length];
        for (int i = 0; i < length; i++) {
            ar[i] = new Random().nextInt(4);
            System.out.println(i + " element = " + ar[i]);
        }
        for (int i = 0; i < length; i++) {
            if (ar[i] == 0) {
                for (int j = i; j < length - 1; j++) {
                    ar[j] = ar[j + 1];
                }
                ar[length - 1] = 0;
            }
        }
        for (int j = 0; j < length; j++) {
            System.out.print(ar[j]);
        }*/

    }
}
