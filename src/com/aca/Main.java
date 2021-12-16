package com.aca;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //task 1
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите A");
        int firstElement = scanner.nextInt();
        System.out.println("Введите B");
        int secondElement = scanner.nextInt();
        int Sum = firstElement + secondElement;
        System.out.println("Сумма равен" + " " + Sum);*/

        //task 2
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите A");
        int firstElement = scanner.nextInt();
        System.out.println("Введите B");
        int secondElement = scanner.nextInt();
        int Mnacord = firstElement % secondElement;
        int Rezult = firstElement/secondElement;
        System.out.println("Результат равен " + Rezult);
        System.out.println("Остаток равен " + Mnacord);*/

        //task 3
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        byte firstElement = scanner.nextByte();
        System.out.println("Введите второе число");
        int secondElement = scanner.nextInt();
        System.out.println("Введите третье число");
        short threadElement = scanner.nextShort();
        int Sum = (firstElement + secondElement + threadElement)/3;
        System.out.println("Среднее суммарное " + Sum);
        int Product = (firstElement * secondElement * threadElement);
        System.out.println("Умножение чисел " + Product);*/






        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите A");
        int firstElement = scanner.nextInt();
        System.out.println("Введите B");
        int secondElement = scanner.nextInt();
        if (firstElement > secondElement)
            System.out.println(firstElement + ">" + secondElement);
        else if (firstElement < secondElement)
            System.out.println(firstElement + "<" + secondElement);
        else if (firstElement == secondElement)
            System.out.println(firstElement + "=" + secondElement);*/

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Введите букву ");
        char x = sc.nextLine().charAt(0);
        switch (x) {
            case 'a':
                System.out.println("Гласная");
                break;
            case 'e':
                System.out.println("Гласная");
                break;
            case 'u':
                System.out.println("Гласная");
                break;
            case 'i':
                System.out.println("Гласная");
                break;
            case 'o':
                System.out.println("Гласная");
                break;
            default:
                System.out.println("Соласная");
                break;
        }*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("введите число");
        int a = sc.nextInt();
        switch (a%2) {
            case 0:
                System.out.println("чётное");
                break;
            default:
                System.out.println("нечётное");
                break;
        }*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("введите число");
        int a = sc.nextInt();
        switch((a+45)/45) {
            case 1:
                System.out.println("0-45");
                break;
            case 2:
                System.out.println("46-90");
                break;
            case 3:
                System.out.println("91-135");
                break;
            default:
                System.out.println("ХЗ");
                break;
        }*/

        /*int exp = 2;
        switch (exp) {
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");   //без break операция выполнит всё, что находится
            case 3:
                System.out.println("3");     //после первого удовлетворительного условия
            default:
                System.out.println("Default");
        }*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("введите число");
        int a = sc.nextInt();
        String name = a == 5 ? "5": "что-то другое";
        System.out.println(name);*/

        /*double rand_d1 = (Math.random()*7)+4;
        int rand_int1 = (int) rand_d1;
        System.out.println(rand_int1);*/

        /*Random rand = new Random();
        int a = rand.nextInt(6)+4;               //Случайное число
        System.out.println(a);*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("введите число");
        int a = sc.nextInt();
        System.out.println("введите число");
        int b = sc.nextInt();
        String name = a > b ? "a" : a == b ? "no" : "b";
        System.out.println(name);*/
    }
}
