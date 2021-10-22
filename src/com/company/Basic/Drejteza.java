package com.company.Basic;

import java.util.Scanner;

public class Drejteza {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shenojeni pjerrtesine: ");
        int k = reader.nextInt();
        System.out.print("Kordinata e pikes se pare: ");
        int x1 = reader.nextInt();
        System.out.print("Kordinata e pikes se dyte: ");
        int y1 = reader.nextInt();
        int k1 = k;
        System.out.println("Formula: y - y1 = k (x - x1)");
        System.out.println("y - " + y1 + " = " + k + "(x - " + x1 + ")");
        if (y1 < 0 || k < 0 || x1 < 0) {
            k1 *= x1;
            System.out.println("y - " + y1 + " = " + k + "x" + " - " + k1);
            System.out.printf("y = %dx - %d", k, (k1 - y1));
        } else {
            k1 *= x1;
            System.out.println("y - " + y1 + " = " + k + "x" + " + " + k1);
            System.out.printf("y = %dx + %d", k, (k1 + y1));
        }
    }
}
