package com.company.Basic;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print(" Shtyp menun \n" +
                "1 – File\n" +
                "2 – Edit\n" +
                "3 – View\n" +
                "4 – Help\n" +
                "5 - Tools\n" +
                "Tjeter – Per Exit: ");
        int nummri = reader.nextInt();

        switch (nummri){
            case 1:
                System.out.println("File");
                break;
            case 2:
                System.out.println("Edit");
                break;
            case 3:
                System.out.println("View");
                break;
            case 4:
                System.out.println("Help");
                break;
            case 5:
                System.out.println("Tools");
                break;
            default:
                System.out.println("Exit");
                break;
        }
    }
}
