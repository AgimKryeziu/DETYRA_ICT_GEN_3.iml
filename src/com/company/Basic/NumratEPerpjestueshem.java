package com.company.Basic;

import java.util.Scanner;

public class NumratEPerpjestueshem {
    public static void main(String[] args) {
        Scanner readre = new Scanner(System.in);
        System.out.print("Numri 1: ");
        int nr1 = readre.nextInt();
        System.out.print("Numri 2: ");
        int nr2 = readre.nextInt();
        //if (nr1 % nr2 == 0){
        //   System.out.println("Nr1 eshte i plotepjestueshem me nr2");
        //}
       // else {
       //     System.out.println("Nr1 nuk eshte i plotepjestueshem me nr2");
        //}

        if (nr2 % nr1 == 0) {
            System.out.println("Nr2 eshte i plotepjestueshem me nr1");
        }
        else{
            System.out.println("Nr2 nuk eshte i plotepjestueshem me nr1");
        }
    }
}
