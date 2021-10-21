package com.company.Basic;

import java.util.Random;
import java.util.Scanner;

public class RandomMultidimensionalArray {
    public static void main(String[] args) {
        // Te mbushet një matricë matrix[row][column] ku row dhe column merren si
        //vlera nga shfrytëzuesi, dhe ketë matricë të bëhet mbushja me numra
        //rastësishëm nga 1 deri ne 10000.

        Scanner reader = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.print("Sheno numrin e rreshtave te matrices: ");
        int row = reader.nextInt();
        System.out.print("Sheno numrin e kolonave te matrices: ");
        int col = reader.nextInt();

        int[][] matrix = new int[row][col];


        Random rand = new Random();

        for(int a = 0; a < row; a++)
        {
            for(int b = 0; b < col; b++)
            {
                matrix[a][b] = rand.nextInt(10000);
            }
        }

        System.out.println("Matrica");
        for(int a = 0; a < row; a++)
        {
            for(int b = 0; b < col; b++)
            {
                System.out.print(matrix[a][b] + "\t");
            }
            System.out.println();
        }

        // Te shtypet vlerat ne diagonale te matricës
        System.out.print("Diagonalja: ");
        for(int a = 0; a < row; a++)
        {
            for(int b = 0; b < col; b++)
            {
                if(a == b){
                    System.out.print(matrix[a][b] + ",");
                }
            }
        }

        // Te shtypet vlerat ne diagonale dhe poshtë diagonales/lart diagonales
        System.out.println();
        System.out.print("Vlerat poshte diagonaled: ");
        for(int a = 0; a < row; a++)
        {
            for(int b = 0; b < col; b++)
            {
                if(a > b){
                    System.out.print(matrix[a][b] + ",");
                }
            }
        }
        System.out.println();
        System.out.print("Vlerat lart diagonaled: ");
        for(int a = 0; a < row; a++)
        {
            for(int b = 0; b < col; b++)
            {
                if(a < b){
                    System.out.print(matrix[a][b] + ",");
                }
            }
        }
    }
}
