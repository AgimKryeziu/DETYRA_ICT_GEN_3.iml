package com.company.Basic;

import java.util.Scanner;

public class ForNumratCift {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Sheno nje numer: ");
        int numri = reader.nextInt();

        for (int i = 1; i < numri; i++){
            if (i % 2 == 0){
                System.out.print(i + ",");
            }
        }
    }
}
