package com.company.Basic;

import java.util.Scanner;

public class ForNumratTek {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Sheno nje numer: ");
        int numri = reader.nextInt();

        for (int i = 1; i < numri; i++){
            if (i % 2 == 1){
                System.out.print(i + ",");
            }
        }
    }
}
