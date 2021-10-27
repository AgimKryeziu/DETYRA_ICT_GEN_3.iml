package com.company.Basic;

import java.util.Scanner;

public class Bilanci_TeHyrat_Shpenzimet {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double teHyrat, pergjigjja, vleraEShtuar, vleraEShpenzuar, rojtari = 1;
        System.out.print("Ju lutem shkruani te hyrat e juaja: ");
        teHyrat = reader.nextDouble();
        while (rojtari == 1) {
            System.out.print("Nese deshironi te shtoni tek te hyrat e juaja shtyp 1, nese deshironi ti shtoni shpenzimet e juaja shtyp 2: ");
            pergjigjja = reader.nextDouble();
            if (pergjigjja == 1) {
                System.out.print("Ju lutem Shkruani vleren qe Deshironi ta shtoni tek bilanci i juaj: ");
                vleraEShtuar = reader.nextDouble();
                teHyrat += vleraEShtuar;
                System.out.println("Bilanci i juaj eshte: " + teHyrat);
                System.out.print("Nese deshironi te vazhdoni shtyp 1 ,nese deshironi te ndaleni shtyp 2: ");
                rojtari = reader.nextDouble();
            } else if (pergjigjja == 2) {
                System.out.printf("Vlera totale e bilancit tuaj eshte: " + teHyrat + "$%n");
                System.out.print("Shkruaj vleren qe keni shpenzuar: ");
                vleraEShpenzuar = reader.nextDouble();
                teHyrat -= vleraEShpenzuar;
                if (vleraEShpenzuar > teHyrat) {
                    System.out.printf("Ju nuk keni akses te shpenzoni me shume. %.2f %.2f ", teHyrat, vleraEShpenzuar);
                    System.out.print("Nese deshironi te vazhdoni shtyp 1 ,nese deshironi te ndaleni shtyp 2: ");
                    rojtari = reader.nextDouble();
                } else {
                    System.out.println(teHyrat);
                    System.out.print("Nese deshironi te vazhdoni shtyp 1 ,nese deshironi te ndaleni shtyp 2: ");
                    rojtari = reader.nextDouble();
                }
            }
        }
    }
}
