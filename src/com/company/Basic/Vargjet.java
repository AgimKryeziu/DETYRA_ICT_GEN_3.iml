package com.company.Basic;

import java.util.Random;

public class Vargjet {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[15];
        int[] c = new int[10];

        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(25);
        }
        System.out.print("Vargu1: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            b[i] = rand.nextInt(25);
        }
        System.out.print("Vargu2: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + ",");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]){
                    c[i] = a[i];
                }
            }
        }
        System.out.print("Vargu3: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + ",");
        }
    }
}
