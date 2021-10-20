package com.company.Basic;

import java.util.Scanner;

public class Chat {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Personi1: ");
        String personi1 = reader.nextLine();
        System.out.print("Personi2: ");
        String personi2 = reader.nextLine();

        while (!personi2.equals("stop")){
            System.out.print("Personi1: ");
            personi1 = reader.nextLine();
            System.out.print("Personi2: ");
            personi2 = reader.nextLine();
        }
    }
}
