package com.company.oop.Studenti;

import java.util.Scanner;

public class StudentiNota {
    public static void main(String[] args) {
        Nota nota = new Nota();
        Scanner reader = new Scanner(System.in);
        System.out.print("Studenti: ");
        nota.set_studenti(reader.nextLine());
        System.out.print("Ne lenden: ");
        nota.set_lenda(reader.nextLine());

        do {
            System.out.print("Piket e detyres se pare: ");
            nota.set_dsh1(reader.nextFloat());
        } while (nota.get_dsh1() < 0 || nota.get_dsh1() > 100);
        do {
            System.out.print("Piket e detyres se dyte: ");
            nota.set_dsh2(reader.nextFloat());
        } while (nota.get_dsh2() < 0 || nota.get_dsh2() > 100);
        do {
            System.out.print("Piket e detyres se trete: ");
            nota.set_dsh3(reader.nextFloat());
        } while (nota.get_dsh3() < 0 || nota.get_dsh3() > 100);
        do {
            System.out.print("Piket e provimit: ");
            nota.set_provimi(reader.nextFloat());
        } while (nota.get_provimi() < 0 || nota.get_provimi() > 100);

        nota.LlogaritNotenFinale();
        nota.ShfaqNotenFinale();
    }
}
