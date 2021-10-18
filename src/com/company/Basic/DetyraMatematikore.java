package com.company.Basic;

import java.util.Scanner;

public class DetyraMatematikore {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj nje numer: ");
        int numri = reader.nextInt();

        // * Te shkruhet programi i cili kalkulon formulën ne vijim( ku n – merret nga
        //shfrytëzuesi dhe n duhet te pranoj vlera nga 1 deri ne 100)
       // int shuma = 0;

        //for (int x = 0; x < numri; x++) {
       //     if (numri > 0 && numri <= 100){
        //        shuma += (x - 2);
        //    }
       // }
        //System.out.println("Shuma = " + shuma);

        //Te shkruhet progrmai I cili kalkulon formalin ne vijim ku n duhet te jipet dhe te
        //kete rang te vlerave nga 1 deri ne 500

        double zgjidhja = 1;
        for (int x = 1; x < numri; x++) {
            zgjidhja = (Math.pow(x,2) - 2*x - 3) / 2*x -1;
        }
        System.out.println("Zgjidhja: " + zgjidhja);


    }
}
