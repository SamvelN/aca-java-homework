package com.aca;

import java.util.Random;
import java.util.Scanner;

public class homework_DAY_11 {
    public static void main(String[] args) {
        //Num_1
        //System.out.println(min(5, 6, 7, 8));

        //Num_2
        //System.out.println(ast(5.23, 4));

        //Num_3
        //System.out.println(xor(true, false));

        //Num_4
        //System.out.println(election(true, false, false));

        //Num_5
        //System.out.println(isPrime(23));

        //Num_6
        //System.out.println(fib(5));

        //Num_7
        //System.out.println(fact(5));

        //Num_8
        //System.out.println(isVowel('x'));

        //Num_9
        //System.out.println(polindrom(12321));

        //Num_10
        //System.out.println(hasEight(5821));

        //Num_11
        /*Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Введите число ");
        int a = sc.nextInt();
        for (int i = 0; a != (-1); i++) {
            System.out.print("Введите число ");
            a = sc.nextInt();
            if (hasEight(a))
                sum += a;
        }
        System.out.println(sum);*/

        //Num_12
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите вместительность массива");
        int length = sc.nextInt();
        int [] ar = new int[length];
        for (int i = 0; i < length; i++) {
            Scanner element = new Scanner(System.in);
            System.out.print("Введите следующий элемент ");
            ar[i] = element.nextInt();
        }
        Scanner num = new Scanner(System.in);
        System.out.print("Введите контрольный элемент ");
        int el = num.nextInt();
        System.out.println(contains(ar, el));*/

        //Num_13
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите вместительность массива");
        int length = sc.nextInt();
        int [] ar = new int[length];
        for (int i = 0; i < length; i++) {
            Scanner element = new Scanner(System.in);
            System.out.print("Введите следующий элемент ");
            ar[i] = element.nextInt();
        }
        Scanner num = new Scanner(System.in);
        System.out.print("Введите контрольный элемент ");
        int el = num.nextInt();
        System.out.println(search(ar, el));*/

        //Num_14
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива ");
        int length = sc.nextInt();
        int [] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = new Random().nextInt(100);
            System.out.print(array[i]);
        }
        int [] ar_1 = copyOf(array);
        System.out.println();
        for (int i = 0; i < length; i++) {
            System.out.print(ar_1[i]);
        }*/

        //Num_15
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество студентов в курсе ");
        int length = sc.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Введите оценку обучающегося ");
            array[i] = sc.nextInt();
        }
        System.out.println("Минимальная оценка = " + funcmin(array));
        System.out.println("Максимальная оценка = " + funcmax(array));
        System.out.println("Средняя оценка = " + funsredn(array));*/
    }

    //Num_1
    public static int min(int a, int b, int c, int d) {
        return Math.min(Math.min(a, b), Math.min(c, d));
    }

    //Num_2
    public static double ast(double a, int b) {
        if (b == 0)
            return a = 1;
        else
            return a * ast(a, (b - 1));
    }

    //Num_3
    public static boolean xor(boolean a, boolean b) {
        return (a || b);
    }

    //Num_4
    public static boolean election(boolean a, boolean b, boolean c) {
        if (a && b)
            return true;
        else if (a && c)
            return true;
        else if (b && c)
            return true;
        else
            return false;
    }

    //Num_5
    public static boolean isPrime(int n) {
        boolean a = true;
        for (int i = 2; i < n; i++) {
            if (n % i != 0) {
                a = true;
            } else {
                a = false;
                break;
            }
        }
        return a;
    }

    //Num_6
    public static int fib(int n) {
        if (n < 2) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    //Num_7
    public static int fact(int n) {
        if (n == 1)
            return 1;
        else
            return n * fact(n - 1);
    }

    //Num_8
    public static boolean isVowel(char a) {
        if (a == 'e' || a == 'u' || a == 'i' || a == 'o' || a == 'a')
            return true;
        else
            return false;
    }

    //Num_9
    public static boolean polindrom(int a) {
        int chislo = 1;
        boolean bool = true;
        for (double i = a; i / 10 > 1; i = i / 10) {
            chislo++;
        }
        for (int i = 1; i <= chislo / 2; i++) {
            if (a % 10 == a / (int) Math.pow(10, chislo - (2 * i - 1))) {
                a = a % (int) Math.pow(10, chislo - (2 * i - 1));
                a = a / 10;
            } else {
                bool = false;
                break;
            }
        }
        return bool;
    }

    //Num_10
    public static boolean hasEight(int a) {
        boolean bool = false;
        for (int i = a; i > 0; i /= 10) {
            if (i % 10 == 8) {
                bool = true;
                break;
            }
        }
        return bool;
    }

    //Num_12
    public static boolean contains(int[] ar, int a) {
        boolean bool = false;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == a)
                bool = true;
        }
        return bool;
    }

    //Num_13
    public static int search(int[] ar, int a) {
        int k = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == a) {
                k = i;
            } else
                k = -1;
        }
        return k;
    }

    //Num_14
    public static int[] copyOf(int[] array) {
        int[] ar_1 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            ar_1[i] = array[i];
        }
        return ar_1;
    }

    //Num_15
    public static int funcmax(int[] array) {
        int maxelement = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxelement < array[i])
                maxelement = array[i];
        }
        return maxelement;
    }

    public static int funcmin(int[] array) {
        int minlement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minlement > array[i])
                minlement = array[i];
        }
        return minlement;
    }

    public static float funsredn(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        int sredn1 = 100 * sum / array.length;
        float sredn = (float) sredn1 / 100;
        return sredn;
    }

}
