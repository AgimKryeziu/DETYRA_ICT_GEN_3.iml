package com.company.Basic;

import java.util.Scanner;

public class MethodsExample {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        printOK();
        System.out.print("Shkruaj nje mesazh: ");
        String mesazhi = reader.nextLine();
        print(mesazhi);
        System.out.print("Shkruaj numerin e pare me presje dhjetore: ");
        System.out.print("Shkruaj nje numer me presje dhjetore: ");
        double a = reader.nextDouble();
        System.out.print("Shkruaj numerin e dyte me presje dhjetore: ");
        double b = reader.nextDouble();
        zbritja(a, b);
        System.out.println(deduction(a, b));
        shtypAlfabetin();
        System.out.println();
        shtypAlfabetin(false);
        System.out.println("Prodhimi i dy numrave: " + prodhimiIDyNumrave(a, b));
    }

    public static void printOK() {
        System.out.println("OK");
    }

    public static void print(String mesazhi) {
        System.out.println(mesazhi);
    }

    public static void zbritja(double a, double b) {
        System.out.println("Rezultati: " + (a - b));
    }

    public static double deduction(double a, double b) {
        return a - b;
    }

    public static void shtypAlfabetin() {
        char c;
        for (c = 65; c <= 90; ++c)
            System.out.print(c + " ");
    }

    public static void shtypAlfabetin(boolean printToLowerCase) {
        char c;
        if (printToLowerCase == true) {
            System.out.print("Shkronjat e medha: ");
            for (c = 65; c <= 90; ++c)
                System.out.print(c + " ");
        } else {
            System.out.print("Shkronjat e vogla: ");
            for (c = 97; c <= 122; ++c)
                System.out.print(c + " ");
        }
    }

    public static double prodhimiIDyNumrave(double nr1, double nr2) {
        return nr1 * nr2;
    }
}

