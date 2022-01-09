package com.aca;

import java.util.Random;
import java.util.Scanner;

public class homework_DAY_9 {
    public static void main(String[] args) {

        //Num_1
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Пожалуйстаб введите размер массива ");
        int length = sc.nextInt();
        int[][] ar = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == length - 1 - j)
                    ar[i][j] = 1;
                else
                    ar[i][j] = 0;
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }*/

        //Num_2
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int length = sc.nextInt();
        int [][] ar = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i < length - 1 - j)
                    ar[i][j] = 0;
                else if (i == length - 1 - j)
                    ar[i][j] = 1;
                else
                    ar[i][j] = 2;
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }*/

        //Num_3
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер двумерного массива");
        int length = sc.nextInt();
        int [][] ar = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите элемент " + i + "-ой строки " + j + "-ого столбца" );
                ar[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < length; i++) {                        //для наглядности
            for (int j = 0; j < length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
        int k = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (ar[i][j] != ar[j][i])
                    k++;
            }
        }
        if (k == 0)
            System.out.println("YES");
        else
            System.out.println("NO");*/

        //Num_4
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество спортсменов");
        int amount = sc.nextInt();
        System.out.println("Введите количество бросков");
        int br = sc.nextInt();
        int[][] ar = new int[amount][br];
        int NumOfSp = 0, Brosok = 0, maxBrosok = 0;
        for (int i = 0; i < amount; i++) {
            for (int j = 0; j < br; j++) {
                ar[i][j] = new Random().nextInt(10);
                System.out.print(ar[i][j] + " ");
                Brosok = Brosok + ar[i][j];
            }
            System.out.println("Общяя сумма бросков = " + Brosok);
            if (Brosok > maxBrosok) {
                maxBrosok = Brosok;
                NumOfSp = i;
            }
            Brosok = 0;
        }
        System.out.println("Чемпионом соревонований стал спортсмен под номером " + NumOfSp
                                 + " с суммарной расстоянией всех бросков " + maxBrosok);*/

        //Num_5
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество спортсменов");
        int amount = sc.nextInt();
        System.out.println("Введите количество бросков");
        int br = sc.nextInt();
        int[][] ar = new int[amount][br];
        int maxBrosok = 0, nsp = 0, npopitka = 0;
        for (int i = 0; i < amount; i++) {
            for (int j = 0; j < br; j++) {
                ar[i][j] = new Random().nextInt(100);
                System.out.print(ar[i][j] + " ");
                if (ar[i][j] > maxBrosok) {
                    maxBrosok = ar[i][j];
                    nsp = i;
                    npopitka = j;
                }
            }
            System.out.println();
        }
        System.out.println("Чемпионом соревнований становится спортсмен под номером " + nsp +
                 " с наилучшим результатом " + maxBrosok + " в попытке под номером " + npopitka);*/

        //Num_6
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество спортсменов");
        int amount = sc.nextInt();
        System.out.println("Введите количество бросков");
        int br = sc.nextInt();
        int[][] ar = new int[amount][br];
        int maxBrosok = 0, nsp = 0, npopitka = 0;
        for (int i = 0; i < amount; i++) {
            for (int j = 0; j < br; j++) {
                ar[i][j] = new Random().nextInt(10);
                System.out.print(ar[i][j] + " ");
                if (ar[i][j] > maxBrosok) {
                    maxBrosok = ar[i][j];
                    nsp = i;
                    npopitka = j;
                }
            }
            System.out.println();
        }
        for (int i = 0; i < amount; i++) {
            for (int j = 0; j < br; j++) {
                if (ar[i][j] == maxBrosok)
                    if (j < npopitka) {
                        npopitka = j;
                        nsp = i;
                    }
            }
        }
        System.out.println("Чемпионом соревнований становится спортсмен под номером " + nsp +
                " с наилучшим результатом " + maxBrosok + " в попытке под номером " + npopitka);*/

        //Num_8
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк 1-ого массива");
        int n_1 = sc.nextInt();
        System.out.println("Введите количество столбцов 1-ого массива");
        int m_1 = sc.nextInt();
        System.out.println("Введите количество строк 2-ого массива");
        int n_2 = sc.nextInt();
        System.out.println("Введите количество столбцов 2-ого массива");
        int m_2 = sc.nextInt();
        int[][] ar_1 = new int[n_1][m_1];
        int[][] ar_2 = new int[n_2][m_2];
        for (int i = 0; i < n_1; i++) {
            for (int j = 0; j < m_1; j++) {
                ar_1[i][j] = new Random().nextInt(10);
                System.out.print(ar_1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n_2; i++) {
            for (int j = 0; j < m_2; j++) {
                ar_2[i][j] = new Random().nextInt(10);
                System.out.print(ar_2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int n_3, m_3;
        if (n_1 > n_2)
            n_3 = n_1;
        else
            n_3 = n_2;
        if (m_1 > m_2)
            m_3 = m_1;
        else
            m_3 = m_2;
        int[][] ar_3 = new int[n_3][m_3];
        for (int i = 0; i < n_1 || i < n_2; i++) {
            for (int j = 0; j < m_1 || j < m_2; j++) {
                if (i < n_1 && i < n_2 && j < m_1 && j < m_2)
                    ar_3[i][j] = ar_1[i][j] + ar_2[i][j];
                else if (i >= Math.min(n_1, n_2) && j >= Math.min(m_1, m_2))
                    ar_3[i][j] = 0;
                else if (i >= n_1 && i < n_2)
                    ar_3[i][j] = ar_2[i][j];
                else if (i >= n_2 && i < n_1)
                    ar_3[i][j] = ar_1[i][j];
                else if (j >= m_1 && j < m_2)
                    ar_3[i][j] = ar_2[i][j];
                else if (j >= m_2 && j < m_1)
                    ar_3[i][j] = ar_1[i][j];
                System.out.print(ar_3[i][j] + " ");
            }
            System.out.println();
        }*/

        //Num_9
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива ");
        int length = sc.nextInt();
        int[][] ar = new int[length][length];
        for (int i = 0; i < length; i++) {
            if (i % 4 == 0) {
                for (int j = i/2; j == i/2; j++) {
                    for (int k = 0; k < length; k++) {
                        if (k >= i/2 - 1 && k < length - i/2)
                            ar[j][k] = 1;
                    }
                }
            } else if (i % 4 == 1) {
                for (int j = i / 2; j < length - i / 2; j++) {
                    for (int k = length - i / 2 - 1; k == length - i / 2 - 1; k++) {
                            ar[j][k] = 1;
                    }
                }
            } else if (i % 4 == 2) {
                for (int j = length - i / 2; j == length - i / 2; j++) {
                    for (int k = i / 2 - 1; k <= length - i / 2 - 1; k++) {
                            ar[j][k] = 1;
                    }
                }
            } else {
                for (int j = i / 2 + 1; j < length - i / 2 + 1; j++) {
                    for (int k = i / 2 - 1; k == i / 2 - 1; k++) {
                            ar[j][k] = 1;
                    }
                }
            }
        }
        for (int j = 0; j < length; j++) {
            for (int k = 0; k < length; k++) {
                System.out.print(ar[j][k] + "  ");
            }
            System.out.println();
        }*/

        //Num_10
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива ");
        int length = sc.nextInt();
        int[][] ar = new int[length][length];
        int q = 0;
        for (int i = 0; i <= 2 * length; i++) {
            if (i % 4 == 0) {
                for (int j = i/4; j == i/4; j++) {
                    for (int k = 0; k < length - i/4; k++) {
                        if (k >= i/4 - 1 && k < length - i/4) {
                            ar[j][k] = q;
                            q++;
                        }
                    }
                }
            } else if (i % 4 == 1) {
                for (int j = i / 4 + 1; j < length - i / 4 - 1; j++) {
                    for (int k = length - i / 4 - 1; k == length - i / 4 - 1; k++) {
                            ar[j][k] = q;
                            q++;
                    }
                }
            } else if (i % 4 == 2) {
                for (int j = length - i / 4 - 1; j == length - i / 4 - 1; j++) {
                    for (int k = length - i / 4 - 1; k > i / 4; k--) {
                            ar[j][k] = q;
                            q++;
                    }
                }
            } else {
                for (int j = length - i / 4 - 1; j > i / 4 + 1; j--) {
                    for (int k = i / 4; k == i / 4; k++) {
                            ar[j][k] = q;
                            q++;
                    }
                }
            }
        }
        for (int j = 0; j < length; j++) {
            for (int k = 0; k < length; k++) {
                System.out.print(ar[j][k] + "  ");
                int z1 = 0, zmax = 0;
                for (int i = 0; ar[j][k] > 0; i++) {
                    ar[j][k] = ar[j][k] / 10;
                    z1 = i;
                }
                int f = 2 * length;
                for (int i = 0; f > 0; i++) {
                    f = f / 10;
                    zmax = i;
                }
                for (int i = 0; i <= zmax - z1; i++) {
                    if (ar[j][k] / 10 == 0)
                        System.out.print(" ");
                }
            }
            System.out.println();
        }*/
    }
}
