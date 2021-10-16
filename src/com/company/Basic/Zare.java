package com.company.Basic;

import java.util.Random;
import java.util.Scanner;

public class Zare {
    public static void main(String[] args) {

        int random = new Random().nextInt(7) + 1;

        Scanner reader = new Scanner(System.in);
        System.out.print("Shenoni nje numer: ");
        int numri = reader.nextInt();

        if (numri == random){
            System.out.println("Urime e keni qelluar.");
        }
        else {
            System.out.println("Suksese ne te ardhmen!");
        }
    }
}
