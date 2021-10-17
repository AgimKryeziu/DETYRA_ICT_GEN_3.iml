package com.company.Basic;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        String fjala, fjala1 ="";
        Scanner reader = new Scanner(System.in);
        System.out.print("Sheno nje fjale: ");
        fjala = reader.nextLine();

        int gjatesia = fjala.length();
        for (int i = gjatesia - 1; i >= 0; i--){
            fjala1 += fjala.charAt(i);
        }

        if (fjala.equalsIgnoreCase(fjala1)){
            System.out.println("Fjala eshte palindrom");
        }
        else{
            System.out.println("Fjala nuk eshte palindrom");
        }
    }
}
