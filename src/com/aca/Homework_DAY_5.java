package com.aca;

import java.util.Scanner;

public class Homework_DAY_5 {
    public static void main(String[] args) {

        //Number_1
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int x = scanner.nextInt();
        String name = x == 0 ? "x = 0" : x > 0 ? "x положительное" : "x отрицательное";
        System.out.println(name);*/

        //Number_2
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int number_1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int number_2 = scanner.nextInt();
        String name = number_1 == number_2 ? "Введённые числа равны" : number_1 > number_2 ?
                "Первое число больше" : "Второе число больше";
        System.out.println(name);
        int x = number_1 < 0 ? number_1 = number_1*(0-1) : number_1;
        System.out.println("|x| = " + x);*/

        //Number_3
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int x_1 = sc.nextInt();
        System.out.println("Введите второе число");
        int x_2 = sc.nextInt();
        System.out.println("Введите третье число");
        int x_3 = sc.nextInt();
        int x = x_1 > x_2 ? (x_1 > x_3 ? x_1 : x_3) : x_2 > x_3 ? x_2 : x_3;
        System.out.println(x);*/

        //Number_9
        /*System.out.println("What is the correct way to declare a variable to store an integer value in Java?\n" +
                "   a. int 1x=10;\n" +
                "   b. int x=10;\n" +
                "   c. float x=10.0f;\n" +
                "   d. string x=\"10\";");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите правильный ответ");
        char choise = sc.nextLine().charAt(0);
        switch (choise) {
            case 'b':
                System.out.println("Congratulation");
                break;
            default:
                System.out.println("Invalide choice");
                break;
        }*/

        //Number_10
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Введите букву заглавными буквами");
        char x = sc.nextLine().charAt(0);
        switch (x) {
            case 'A':
                System.out.println("Гласная");
                break;
            case 'E':
                System.out.println("Гласная");
                break;
            case 'U':
                System.out.println("Гласная");
                break;
            case 'I':
                System.out.println("Гласная");
                break;
            case 'O':
                System.out.println("Гласная");
                break;
            default:
                System.out.println("Соласная");
                break;
        }*/

        //Number_11
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Введите число ");
        char x = sc.nextLine().charAt(0);
        switch (x) {
            case '0':
                System.out.println(x);
                break;
            case '1':
                System.out.println(x);
                break;
            case '2':
                System.out.println(x);
                break;
            case '3':
                System.out.println(x);
                break;
            case '4':
                System.out.println(x);
                break;
            case '5':
                System.out.println(x);
                break;
            case '6':
                System.out.println(x);
                break;
            case '7':
                System.out.println(x);
                break;
            case '8':
                System.out.println(x);
                break;
            case '9':
                System.out.println(x);
                break;
            default:
                System.out.println("Not allowed");
                break;
        }*/

        //Number_11
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

        //Number_12
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number ");
        float firstNumber = sc.nextFloat();
        System.out.print("Enter second number ");
        float secondNumber = sc.nextFloat();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an operator (+, -, *, /) ");
        char operator = scanner.nextLine().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("result = " + (firstNumber + secondNumber));
                break;
            case '-':
                System.out.println("result = " + (firstNumber - secondNumber));
                break;
            case '*':
                System.out.println("result = " + firstNumber * secondNumber);
                break;
            case '/':
                System.out.println("result = " + firstNumber / secondNumber);
                break;
            default:
                System.out.println("error");
        }*/

        //Number_13
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите день недели");
        String day = sc.nextLine();
        switch (day) {
            case "Понедельник":
                System.out.println("1");
                break;
            case "Вторник":
                System.out.println("2");
                break;
            case "Среда":
                System.out.println("3");
                break;
            case "Четверг":
                System.out.println("4");
                break;
            case "Пятница":
                System.out.println("5");
                break;
            case "Суббота":
                System.out.println("6");
                break;
            case "Воскресенье":
                System.out.println("7");
                break;
            default:
                System.out.println("error");
                break;
        }*/

        //Number_14
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Введите результат теста ");
        int quizScore = sc.nextInt();
        System.out.print("Введите среднюю оценку ");
        int mid_termScore = sc.nextInt();
        int finalScore = (quizScore + mid_termScore)/2;
        if (quizScore > 0 && quizScore <= 100 && mid_termScore > 0 && mid_termScore <= 100) {
            switch (finalScore / 10) {
                case 10:
                    System.out.println("Your grade is A");
                    break;
                case 9:
                    System.out.println("Your grade is A");
                    break;
                case 8:
                    System.out.println("Your grade is A");
                    break;
                case 7:
                    System.out.println("Your grade is B");
                    break;
                case 6:
                    System.out.println("Your grade is B");
                    break;
                case 5:
                    System.out.println("Your grade is C");
                    break;
                case 4:
                    System.out.println("Your grade is C");
                    break;
                default:
                    System.out.println("Your grade is F");
                    break;
            }
        }
        else
            System.out.println("Введите числа от 1 до 100");*/



    }
}
