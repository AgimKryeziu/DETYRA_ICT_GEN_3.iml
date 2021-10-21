package com.company.Basic;

import java.util.Scanner;

public class Multidimensional_Array {
    public static void main(String[] args) {
        // Te mbushet matrica 2x2 me vlera dinamike nga shfrytezuesi, dhe te shtypet ne formën e matricës?

        int[][] array = new int[2][2];
        Scanner reader = new Scanner(System.in);

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("Sheno numrin ne indeksion %d,%d te vargut: ", i, j);
                array[i][j] += reader.nextInt();
            }
        }

        System.out.println("Array dydimensional");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("%10d", array[i][j]);
            }
            System.out.println();
        }
    }
}
