package com.company.Basic;

import java.util.Scanner;

public class MethodsExample {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        printOK();
        System.out.print("Shkruaj nje mesazh: ");
        String mesazhi = reader.nextLine();
        print(mesazhi);
        System.out.print("Shkruaj numerin e pare me presje dhjetore: ");
        System.out.print("Shkruaj nje numer me presje dhjetore: ");
        double a = reader.nextDouble();
        System.out.print("Shkruaj numerin e dyte me presje dhjetore: ");
        double b = reader.nextDouble();
        zbritja(a, b);
        System.out.println(deduction(a, b));
        shtypAlfabetin();
        System.out.println();
        shtypAlfabetin(false);
        System.out.println("Prodhimi i dy numrave: " + prodhimiIDyNumrave(a, b));

        System.out.print("Sheno nje numer: ");
        int numri = reader.nextInt();
        printNumbers(numri);
        System.out.println();
        int[] array = {1, 2, 3, 4, 12, 87, 56, 2, 10, 36, 58, 46, 38, 25, 23, 87, 46, 22, 18};
        printArray(array);
        System.out.println("\nShuma e vargut: " + shumaEVargut(array));
        System.out.println("Faktorieli i numrit " + numri + " eshte "  + factoriel(numri));
        int[][] array2D = {
                {1,2,54,65},
                {34,56,78,3},
                {5,78,52,36},
                {34,5,67,98}
        };
        printArray2D(array2D);
    }

    public static void printOK() {
        System.out.println("OK");
    }

    public static void print(String mesazhi) {
        System.out.println(mesazhi);
    }

    public static void zbritja(double a, double b) {
        System.out.println("Rezultati: " + (a - b));
    }

    public static double deduction(double a, double b) {
        return a - b;
    }

    public static void shtypAlfabetin() {
        char c;
        for (c = 65; c <= 90; ++c)
            System.out.print(c + " ");
    }

    public static void shtypAlfabetin(boolean printToLowerCase) {
        char c;
        if (printToLowerCase == true) {
            System.out.print("Shkronjat e medha: ");
            for (c = 65; c <= 90; ++c)
                System.out.print(c + " ");
        } else {
            System.out.print("Shkronjat e vogla: ");
            for (c = 97; c <= 122; ++c)
                System.out.print(c + " ");
        }
    }

    public static double prodhimiIDyNumrave(double nr1, double nr2) {
        return nr1 * nr2;
    }

    public static void printNumbers(int n) {
        System.out.print("Rangu i numrave: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ",");
        }
    }

    public static void printArray(int[] array) {
        System.out.print("Vargu: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }

    public static double shumaEVargut(int[] vargu) {
        double shuma = 0;
        for (int i = 0; i < vargu.length; i++) {
            shuma += vargu[i];
        }
        return shuma;
    }

    public static int factoriel(int n) {
        int fakt = 1;
        for (int i = 1; i <= n; i++) {
            fakt *= i;
        }
        return fakt;
    }

    public static void printArray2D(int[][] array2D){
        System.out.println("* Array 2 dimensionale *");
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[0].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}

