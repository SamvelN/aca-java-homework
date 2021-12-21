package com.aca;

import java.util.Scanner;
import java.lang.Math;

public class homework_DAY_6 {
    public static void main(String[] args) {

        //Number_1
        /*int i = 1;
        while (i<=10) {
            System.out.println(i);
            i++;
        }*/

        //Number_2
        /*int i = 2;
        while (i<=20) {
            System.out.println(i);
            i = i+2;
        }*/

        //Num_3
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Input the number");
        int j = 1, i = sc.nextInt();
        while (j*j<=i) {
            System.out.println(j*j);
            j++;
        }*/

        //Num_4
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

        //Num_5
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Input the number");
        int num = sc.nextInt(), i = 2, kvadrat = 2;
        while (kvadrat <= num) {
            System.out.println(kvadrat);
            kvadrat = i * kvadrat;
        }*/

        //Num_6
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Input the number");
        int i = sc.nextInt();
        while (i >= 1) {
            System.out.println(i);
            i--;
        }*/

        //Num_7
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Input the number");
        int num = sc.nextInt();
        while (num > 0) {
            if (num%2 == 0) {
                System.out.println(num);
                num = num - 2;
            }
            else {
                num = num - 1;
                System.out.println(num);
                num = num - 2;
            }
        }*/

        //Num_8
        //chhaskaca xndri pahanjy

        //Num_9
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Input the number");
        int i = sc.nextInt(), kvadrat = 1, amount = 0;
        while (kvadrat < i) {
            amount++;
            kvadrat = kvadrat * 2;
        }
        System.out.println(amount);*/

        //Num_10
        /*int i = 32;
        while (i <= 132) {
            int j = 1;
            while (j < 10 && i < 132) {
                System.out.print(i + " ");
                i++;
                j++;
            }
            System.out.println(i + " ");
            j = 0;
            i++;
        }*/

        //Num_11
        /*Scanner sc = new Scanner(System.in);
        System.out.println("input the number");
        int num = sc.nextInt(), i = 1;
        while (i < num) {
            i++;
            if (i%3 == 0) {
                continue;
            }
            System.out.println(i);
        }*/

        //Num_12
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Input the number");
        int num = sc.nextInt(), i = 0, j = 1, fib_num = 2;
        while (j < num) {
            j = i + j;
            fib_num++;
            i = j - i;
        }
        if (j == num) {
            System.out.println(fib_num);
        }
        else {
            System.out.println("-1");
        }*/

        //Num_13
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите желаемый результат");
        int y = sc.nextInt(), kol_dney = 1;
        float x = 10f;
        while (x < y) {
            x = x + x/10;
            kol_dney++;
            System.out.println("дистанция пробега в " + kol_dney + "-ый день составляет " + x);
        }
        System.out.println(kol_dney + " дней нужно для желаемого результата");*/

        //Num_14
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму депозита");
        float dep = sc.nextFloat();
        System.out.println("Введите проценты");
        int percent = sc.nextInt();
        System.out.println("Введите желаемую сумму");
        int result = sc.nextInt();
        int years = 1, x;
        while (dep <= result) {
            x = (int) dep;
            dep = x + percent*x/100;
            x = (int) dep;
            System.out.println("Депозит в конце " + years + "-ого года составляет" + x);
            years++;
        }
        System.out.println(years-1);*/

        //Num_15    chstacvec

        //Num_16
        /*double num_d = Math.random()*100;
        int num = (int) num_d;
        System.out.println(num);             //для того, чтоб не ломать голову
        while (num > 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число");
            int x = sc.nextInt();
            if (x == num){
                System.out.println("Вы угадали!!!");
                break;
            }
            else if (x > num) {
                System.out.println("Много");
            }
            else {
                System.out.println("Мало");
            }
        }*/

        //Num_17
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int num = sc.nextInt(), k = 10, sum = 0;
        while (num > 0) {
            sum = sum + num%k;
            if (num/k == 0){
                break;
            }
            num = num/10;
        }
        System.out.println(sum);*/


    }
}
