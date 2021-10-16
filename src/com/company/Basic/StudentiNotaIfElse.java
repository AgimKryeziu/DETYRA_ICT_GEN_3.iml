package com.company.Basic;

import java.util.Scanner;

public class StudentiNotaIfElse {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shoni piket e provimit: ");
        float piket = reader.nextFloat();

        if(piket >= 0 && piket <= 49){
            System.out.println("Nota 5");
        }
        else if (piket >= 50 && piket <= 59){
            System.out.println("Nota 6");
        }
        else if(piket >= 60 && piket <= 69){
            System.out.println("Nota 7");
        }
        else if (piket >= 70 && piket <= 79){
            System.out.println("Nota 8");
        }
        else if (piket >= 80 && piket <= 89){
            System.out.println("Nota 9");
        }
        else if (piket >= 90 && piket <=100){
            System.out.println("Nota 10");
        }
        else if (piket > 100){
            System.out.println("Nuk ka pike me te medha se 100");
        }
        else{
            System.out.println("Nuk ka pike negative");
        }
    }
}
