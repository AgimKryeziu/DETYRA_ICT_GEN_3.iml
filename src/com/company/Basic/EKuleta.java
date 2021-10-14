package com.company.Basic;

import java.util.Scanner;

public class EKuleta {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sa1cent, sa2cent, sa5cent, sa10cent, sa20cent, sa50cent, sa1euro, sa2euro,
                sa5euro, sa10euro, sa20euro, sa50euro, sa100euro, sa200euro, sa500euro;
        System.out.print("Sa 1 cent: ");
        sa1cent = reader.nextInt();
        System.out.print("Sa 2 cent: ");
        sa2cent = reader.nextInt();
        System.out.print("Sa 5 cent: ");
        sa5cent = reader.nextInt();
        System.out.print("Sa 10 cent: ");
        sa10cent = reader.nextInt();
        System.out.print("Sa 20 cent: ");
        sa20cent = reader.nextInt();
        System.out.print("Sa 50 cent: ");
        sa50cent = reader.nextInt();
        System.out.print("Sa 1 euro: ");
        sa1euro = reader.nextInt();
        System.out.print("Sa 2 euro: ");
        sa2euro = reader.nextInt();
        System.out.print("Sa 5 euro: ");
        sa5euro = reader.nextInt();
        System.out.print("Sa 10 euro: ");
        sa10euro = reader.nextInt();
        System.out.print("Sa 20 euro: ");
        sa20euro = reader.nextInt();
        System.out.print("Sa 50 euro: ");
        sa50euro = reader.nextInt();
        System.out.print("Sa 100 euro: ");
        sa100euro = reader.nextInt();
        System.out.print("Sa 200 euro: ");
        sa200euro = reader.nextInt();
        System.out.print("Sa 500 euro: ");
        sa500euro = reader.nextInt();
        /*
        %d - numra
        %s - string
        %b - boolean
        %f - float -> %.3-> perdori 3 vlera pas presjes dhjetore
        nese perdorim ndonje numer pas 5%d -> i bjen rezervo 5 vlera per numra te plote
         */

        System.out.println("-----------------------------------------");
        System.out.printf("Sa 1 cent: %5d %10.2f %n", sa1cent, sa1cent * 0.01);
        System.out.printf("Sa2 cent: %5d %10.2f %n", sa2cent, sa2cent*  0.02);
        System.out.printf("Sa5 cent: %5d %10.2f %n", sa5cent, sa5cent*  0.05);
        System.out.printf("Sa10 cent: %5d %10.2f %n", sa10cent, sa10cent *  0.10);
        System.out.printf("Sa20 cent: %5d %10.2f %n", sa20cent, sa20cent *  0.20);
        System.out.printf("Sa50 cent: %5d %10.2f %n", sa50cent, sa50cent *  0.50);
        System.out.printf("Sa1 euro: %5d %10.2f %n", sa1euro, sa1euro *  1.00);
        System.out.printf("Sa2 euro: %5d %10.2f %n", sa2euro, sa2euro *  2.00);
        System.out.printf("Sa5 euro: %5d %10.2f %n", sa5euro, sa5euro *  5.00);
        System.out.printf("Sa10 euro: %5d %10.2f %n", sa10euro, sa10euro *  10.00);
        System.out.printf("Sa20 euro: %5d %10.2f %n", sa20euro, sa20euro *  20.00);
        System.out.printf("Sa50 euro: %5d %10.2f %n", sa50euro, sa50euro *  50.00);
        System.out.printf("Sa100 euro: %5d %10.2f %n", sa100euro, sa100euro *  100.00);
        System.out.printf("Sa200 euro: %5d %10.2f %n", sa200euro, sa200euro *  200.00);
        System.out.printf("Sa500 euro: %5d %10.2f %n", sa500euro, sa500euro *  500.00);
        System.out.println("-----------------------------------------");
        System.out.printf("Totali: %22.2f EUR %n", (sa1cent * 0.01 + sa2cent * 0.02 + sa5cent*  0.05 + sa10cent*  0.10 +
                sa20cent *  0.20 + sa50cent *  0.50 +  sa1euro *  1.00 +  sa2euro *  2.00 + sa5euro *  5.00 + sa10euro *  10.00 +
                sa20euro *  20.00 + sa50euro *  50.00 + sa100euro *  100.00 + sa200euro *  200.00 + sa500euro *  500.00));
        System.out.println("-----------------------------------------");
    }
}
