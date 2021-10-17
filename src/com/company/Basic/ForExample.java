package com.company.Basic;

import java.util.Scanner;

public class ForExample {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj nje numer: ");
        int numri = reader.nextInt();

        for (int i = 0; i < numri; i++) {
            for (int j = i; j < numri; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("------------------------------------------");

        for (int i = numri; i > 0 ; i--) {
            for (int j = i - 1; j < numri; j++) {
                System.out.print("&");
            }
            System.out.println();
        }
    }
}
