package com.company.Basic;

import java.util.Scanner;

public class Calculatori {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.printf("Sheno numrin e pare: ");
        int nr1 = c.nextInt();
        System.out.printf("Sheno numrin e dyte: ");
        int nr2 = c.nextInt();


        System.out.println(nr1 + nr2);
        System.out.println(nr1 - nr2);
        System.out.println(nr1 * nr2);
        System.out.println(nr1 / nr2);
        System.out.println(nr1 % nr2);
    }
}
