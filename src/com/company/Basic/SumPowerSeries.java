package com.company.Basic;

import java.util.Scanner;

public class SumPowerSeries {
    public static void main(String[] args) {

        //*Mbledhi numrat prej 1 deri ne N => 0
            Scanner reader = new Scanner(System.in);
            System.out.print("Sheno nje numer: ");
            int numri = reader.nextInt();
            /*
            int sum = 0;
            for (int i = 1; i <= numri; i++) {
                sum  = sum + i;
            }
            System.out.println("Shuma: " + sum);
            
            */
        //*Te gjendet faktorieli prej 1 deri ne N => 1
        /*
            int faktorieli = 1;
            for (int i = 1; i <= numri; i++) {
                faktorieli *= i;
            }
            System.out.println("Faktorieli: " + faktorieli);
        */

        //*Te shkruhet nje numer N dhe te gjendet plotpjesutesit e tij?

        for (int i = 1; i < numri; i++) {
            if (numri % i == 0){
                System.out.print(i + ",");
            }
        }
    }
}
