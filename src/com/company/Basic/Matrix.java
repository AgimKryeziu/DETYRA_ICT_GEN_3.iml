package com.company.Basic;

import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random rand = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = rand.nextInt(30);
            }
        }
        System.out.println("Matrica");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // a) Shuma e anëtarëve të matricës (P.sh.: Shuma e matricës është 97)
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];

            }
        }
        System.out.println("Shuma e matricës është: " + sum);

        // b) Mesatarja e anëtarëve të matricës (P.sh.: Mesatarja e anëtarëve të matricës është 15.4)
        double mesatarja = 1;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                ++count;
                sum += matrix[i][j];
                mesatarja = sum / count;
            }
        }
        System.out.println("Mesatarja e anëtarëve të matricës: " + mesatarja);

        // c) Vlera minimale në matricë (P.sh.: Vlera minimale e matricës është -25)
        int minumumValue = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < minumumValue)
                    minumumValue = matrix[i][j];
            }
        }
        System.out.println("Vlera minimale e matricës është: " + minumumValue);

        // d) Vlera maksimale në matricë (P.sh.: Vlera maksimale e matricës është 67)
        int maxValue = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > maxValue)
                    maxValue = matrix[i][j];
            }
        }
        System.out.println("Vlera maksimale e matricës është: " + maxValue);

        // e) Të numërohen numrat çift / tek (P.sh.: Çift: 9 numra, Tek: 7 numra)
        int numratCift = 0, numratTek = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    numratCift++;
                } else {
                    numratTek++;
                }
            }
        }

        System.out.printf("Çift: %d numra, Tek: %d numra %n", numratCift, numratTek);

        // Të numërohen numrat pozitiv/negativ/zero (P.sh.: Pozitiv: 8, Zero: 1, Negativ: 7)
        int numratPozitiv = 0, numratNegativ = 0, numratZero = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > 0) {
                    numratPozitiv++;
                } else if (matrix[i][j] < 0) {
                    numratNegativ++;
                } else {
                    numratZero++;
                }
            }
        }
        System.out.printf("Pozitiv: %d, Zero: %d, Negativ: %d%n", numratPozitiv, numratNegativ, numratZero);

        // h) Të shumëzohet matrica e dhënë me numrin skalar të cilin e definon useri dhe të paraqitet matrica pas shumëzimit.
        Scanner reader = new Scanner(System.in);
        System.out.print("Jepmi numrin skalar: ");
        int skalar = reader.nextInt();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(skalar * matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
