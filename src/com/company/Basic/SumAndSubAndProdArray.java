package com.company.Basic;

import java.util.Scanner;

public class SumAndSubAndProdArray {
    public static void main(String[] args) {

        // Te mbushen dy matrica (a dhe b) të rendit 2x2 me vlera, dhe te gjendet matrica e re (c) e cila është si shuma/zbritja e dy matricave

        int[][] a = new int[2][2];
        int[][] b = new int[2][2];

        int row1 = a.length;
        int col1 = a[0].length;

        int row2 = b.length;
        int col2 = b[0].length;

        Scanner reader = new Scanner(System.in);
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++) {
                System.out.printf("Sheno numrin ne indeksion %d,%d te vargut: ", i, j);
                a[i][j] += reader.nextInt();
            }
        }

        System.out.println("Array dydimensional a");
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++) {
                System.out.printf("%10d", a[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < b.length; i++){
            for (int j = 0; j < b[0].length; j++) {
                System.out.printf("Sheno numrin ne indeksion %d,%d te vargut: ", i, j);
                b[i][j] += reader.nextInt();
            }
        }

        System.out.println("Array dydimensional b");
        for (int i = 0; i < b.length; i++){
            for (int j = 0; j < b[0].length; j++) {
                System.out.printf("%10d", b[i][j]);
            }
            System.out.println();
        }

        int[][] sum = new int[row1][col2];
        for (int i = 0; i < row1; i++){
            for (int j = 0; j < col1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }


        System.out.println("Zgjidhja a[][] + b[][] = c[][]");
        for (int i = 0; i < row1; i++){
            for (int j = 0; j < col1; j++) {
                System.out.printf("%10d", sum[i][j]);
            }
            System.out.println();
        }


        int[][] sub = new int[row1][col2];

        for (int i = 0; i < row1; i++){
            for (int j = 0; j < col1; j++) {
                sub[i][j] = a[i][j] - b[i][j];
            }
        }

        System.out.println("Zgjidhja a[][] - b[][] = c[][]");
        for (int i = 0; i < row1; i++){
            for (int j = 0; j < col1; j++) {
                System.out.printf("%10d", sub[i][j]);
            }
            System.out.println();
        }

        // Te mbushen dy matrica (a dhe b) të rendit 2x2 me vlera, dhe te gjendet matrica e re (c) e cila është si prodhimi i dy matricave


        int[][] prod = new int[row1][col2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < row2; k++) {
                    prod[i][j] = prod[i][j] + a[i][k] * b[k][j];
                }
            }

        }

        System.out.println("Zgjidhja a[][] * b[][] = c[][]");
        for (int i = 0; i < row1; i++){
            for (int j = 0; j < col2; j++) {
                System.out.printf("%10d", prod[i][j]);
            }
            System.out.println();
        }
    }
}
