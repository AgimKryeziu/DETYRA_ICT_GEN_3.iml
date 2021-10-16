package com.company.Basic;

import com.sun.security.jgss.GSSUtil;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {

        Random rand = new Random();
        int n = rand.nextInt(11);

        Scanner reader = new Scanner(System.in);
        System.out.print("Shenoni nje numer: ");
        int numri = reader.nextInt();

        if (numri == n){
            System.out.println("Urime e keni qelluar");
        }
        else {
            System.out.println("Suksese herën tjetër");
        }
    }
}
