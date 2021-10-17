package com.company.Basic;

import java.util.Scanner;

public class ForZgjedhCiftTek {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Sheno nje numer: ");
        int numri = reader.nextInt();
        reader.nextLine();
        System.out.print("Nese deshironi te shfaqen vlerat tek shtyp T perndryshe shtyp C per numrat cift: ");
        String zgjedh = reader.nextLine();

        if (zgjedh.contains("T")){
            for (int i = 1; i < numri; i++){
                if (i % 2 == 1){
                    System.out.print(i + ",");
                }
            }
        }
        else if (zgjedh.contains("C")){
            for (int i = 1; i < numri; i++){
                if (i % 2 == 0){
                    System.out.print(i + ",");
                }
            }
        }
    }
}
