package com.company.Basic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Paga {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shenojeni pagen: ");
        int paga = reader.nextInt();

        if (paga == 0){
            System.out.println("Pa page!");
        }
        else if (paga > 0 && paga < 80){
            System.out.println("Social!");
        }
        else if (paga > 80 && paga < 120){
            System.out.println("Social ose pencioner!");
        }
        else if (paga > 120 && paga < 180){
            System.out.println("Page minimale!");
        }
        else if (paga > 180 && paga < 300){
            System.out.println("Page mesatare!");
        }
        else if (paga > 300 && paga < 400){
            System.out.println("Page e mire!");
        }
        else if (paga > 400 && paga < 60){
            System.out.println("Page mbi mesataren e mire!");
        }
        else if (paga > 600){
            System.out.println("Page e larte *pse po don me leshu kosoven!");
        }
        else{
            System.out.println("Nuk ekziston page negative!");
        }
    }
}
