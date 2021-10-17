package com.company.Basic;

import java.util.Scanner;

public class PrintSeriesOrTable {
    public static void main(String[] args) {
        // * Prej 1 deri ne 100 shtypi numrat me rend dhe katrorin e tyre
        /*
            for (int i = 1; i <= 100; i++) {
                System.out.printf("Numri %d katerori %.2f %n", i, Math.pow(i,2));
            }
        */

        // * Prej 1 deri ne n shtypi, numrat me rend, katrorin dhe kubin e tyre dhe rrenjen katrore
        /*
            Scanner reader = new Scanner(System.in);
            System.out.print("Sheno nje numer: ");
            int numri = reader.nextInt();
            for (int i = 1; i <= numri; i++) {
                System.out.printf("Numri %d -> katerori %.2f -> kubi %.2f -> rrenja katerore %.2f %n", i, Math.pow(i,2), Math.pow(i,3), Math.sqrt(i));
            }
         */

        //*Te shkruhet tabela e shumezimit per numrin e dhene nga 1 deri ne 10;
        System.out.println("* Tabela e shumezimit *");
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.println(i + " * " + j + " = " + i * j);
                }
                System.out.println();
            }

    }
}
