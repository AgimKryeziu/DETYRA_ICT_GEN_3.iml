package com.company.Basic;

import java.util.Random;
import java.util.Scanner;

public class Rangu {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Sheno nje numer: ");
        int numri = reader.nextInt();

        if (numri <= 10000 && numri >= -10000)
        {
            System.out.println("Numri eshte ne rangun e dhene.");
        }
        else{
            System.out.println("Numri nuk eshte ne rangun e dhene!");
        }


    }
}
