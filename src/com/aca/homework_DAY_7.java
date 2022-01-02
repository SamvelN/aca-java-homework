package com.aca;

import java.util.Scanner;
import java.lang.Math;

public class homework_DAY_7 {
    public static void main(String[] args) {
        //Num_1
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите нижний предел желаемого диапазона");
        int lowElement = sc.nextInt();
        System.out.println("Введите верхний предел желаемого диапазона");
        int upElement = sc.nextInt();
        for (int i = lowElement; i <= upElement; i=i+2) {
            if (i % 2 != 0) {
                i=i+1;
            }
            System.out.println(i);
        }*/

        //Num_2
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите нижний предел желаемого диапазона");
        int lowElement = sc.nextInt();
        System.out.println("Введите верхний предел желаемого диапазона");
        int upElement = sc.nextInt();
        System.out.println("Введите желаемый остаток");
        int remainder = sc.nextInt();
        System.out.println("Введите число на которого надо делить");
        int devided = sc.nextInt();
        for (int i = 0; devided == 0; i++) {
            System.out.println("Число не может делиться на 0, введите другое число");
            devided = sc.nextInt();
        }
        for (int i = lowElement; i < upElement; i++) {
            if (i % devided == remainder) {
                System.out.println(i);
            }
        }*/

        //Num_3
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите нижний предел желаемого диапазона");
        int lowElement = sc.nextInt();
        System.out.println("Введите верхний элемент желаемого диапазона");
        int upElement = sc.nextInt();
        int k = 1;
        for (int i = lowElement; i < upElement; i++) {
            double sqrt = Math.sqrt(i);
            if (sqrt == k) {
                int num = (int) sqrt;
                System.out.println(num*num);
                k++;
            }
            else if (sqrt > k){
                k++;
                i--;
            }
        }*/

        //Num_4
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number");
        int firstNumber = sc.nextInt();
        System.out.println("Input the second number");
        int secondNumber = sc.nextInt(), k = 0;
        for (int i = secondNumber; i > 0; i = i / 10) {              //чтоб понять сколько знаков во втором числе
            k++;
        }
        if (firstNumber < secondNumber) {
            System.out.println("Error! Первое число должно быть больше второй");
        }
        int ast = 1;
        for (int i = 0; i < k; i++) {
            ast = ast * 10;
        }
        int kol_vo = 0;
        for (int i = firstNumber; i > 0; i = i / 10) {
            if (i % ast == secondNumber) {
                kol_vo = kol_vo + 1;
            }
        }
        System.out.println("Второе число в первом числе встречается " + kol_vo + " раз");*/


        //Num_5
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int num = sc.nextInt();
        for (int i = 10; i <= num * 10; i = i) {
            if (num%10 == 0) {
                num = num /10;
                continue;
            }
            int remainder = num%i;
            System.out.print(remainder);
            num = num / 10;
        }*/

        //Num_6
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Input the number");
        int num = sc.nextInt();
        for (int i = 2; i <= num; i++) {
            if (num%i == 0) {
                System.out.println(i);
                break;
            }
        }*/

        //Num_7
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Input the integer number");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num%i == 0) {
                System.out.println(i);
            }
        }*/

        //Num_8
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Input the number");
        int num = sc.nextInt(), k = 0;
        for (int i = 1; i <= num; i++) {
            if (num%i == 0) {
                k++;
            }
        }
        System.out.println(k);*/

        //Num_9
        /*Scanner sc = new Scanner(System.in);
        int k = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Input " + i + " number");
            int element = sc.nextInt();
            k = k + element;
            System.out.println(k);      //текущее значение для проверки
        }
        System.out.println(k);*/

        //Num_10
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите число в двоичном коде");
        int num = sc.nextInt();
        double k, result = 0;
        for (int i = 0; i <= 8; num = num/10, i++) {
            if (num%10 == 1) {
                k = Math.pow(2, i);
                result = result + k;
            }
        }
        System.out.println(result);*/

        //Num_11
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите количсетво вводимых данных");
        int length = sc.nextInt();
        int [] array = new int[length];
        int amountofneg = 0, amountof0 = 0, amountofpos = 0;
        for (int i = 0; i < length; i++) {
            System.out.println("Input the " + i + " element of array");
            array[i] = sc.nextInt();
            if (array[i] == 0) {
                amountof0 = amountof0 + 1;
            }
            else if (array[i] > 0) {
                amountofpos = amountofpos + 1;
            }
            else {
                amountofneg = amountofneg + 1;
            }
        }
        System.out.println("Amount of 0 = " + amountof0);
        System.out.println("Amount of positive numbers = " + amountofpos);
        System.out.println("Amount of negative numbers = " + amountofneg);*/

        //Num_12                                                                     //Без использования массивов
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите сколько секунд должна работать машина");
        int sec = sc.nextInt();
        int x = 1, y = 1, z = 1;
        for (int i = 1; i <= z; i++, x++) {
            for (int j = 1; j <= x; j++, y++) {
                for (int l = 1; l <= y; l++) {
                    System.out.print(y);
                    z++;
                    if (z > sec)
                        break;
                }
                if (z > sec)
                    break;
            }
            if (z > sec)
                break;
        }*/

        //Num_12                                                                     //С использованием массивов
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите сколько секунд должна работать машина");
        int sec = sc.nextInt(), k=1;
        for (int i = 1; i < sec; i++) {
            for (int j = 0; j < i; j++) {
                int [] ar = new int[i];
                ar[j] = i;
                System.out.print(ar[j]);
                k++;
                if (k > sec)
                    break;
            }
            if (k > sec)
                break;
        }*/

        //Num_13
        /*Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        //Num_14
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Пожалуйста введите размер желаемой шахматной доски");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (i%2 == 0) {
                for (int j = 0; j < size; j++) {
                    System.out.print(" #");
                }
            }
            else {
                for (int j = 0; j < size; j++) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }*/

        //Num_15
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Please, input the size");
        int size = sc.nextInt();
        System.out.print("*   ");
        for (int i = 1; i <= size; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < size*3; i++) {
            System.out.print("_");
        }
        System.out.println();
        for (int j = 1; j <= size; j++) {
            System.out.print(j + " | ");
            for (int k = 1; k <= size; k++) {
                System.out.print(k * j + " ");
            }
            System.out.println();
        }*/

        //Num_16_A
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = size-i; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }*/

        //Num_16_B
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = size-i; j > 0; j--) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }*/

        //Num_16_C
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = size-i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        //Num_16_D
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = size-i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }*/
    }
}
