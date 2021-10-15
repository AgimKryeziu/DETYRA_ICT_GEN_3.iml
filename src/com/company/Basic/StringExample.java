package com.company.Basic;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // a
        System.out.print("Shkruani nje tekst: ");
        String teksti = reader.next();
        System.out.printf("Tksti: %s - gjatesia e tekstit: %d %n",teksti, teksti.length());

        //b
        System.out.print("Shkruaj indeksin nga 0 deri me A: ");
        int indeksi = reader.nextInt();
        System.out.printf("A- gjatësia e tekstit paraprak: %d%n Teksti i paraqitur: %s %n",
                teksti.length(), teksti.substring(indeksi));

        //c
        System.out.print("Shkruaj indeksin e mbarimit nga X deri me A: ");
        int indeksiMbarimit = reader.nextInt();
        System.out.printf("X- vlera e indeksit te fillimit: %s pjesa tjeter e tekstit: %s %n",
                teksti.substring(indeksi), teksti.substring(indeksi, indeksiMbarimit));

        //d
        System.out.print("Shkuani fjalen qe po kerkoni: ");
        String fjala = reader.next();
        System.out.printf("Fjala e dhene %s %s ne tekst indeksi se ku fillon fjala eshte %d %n", fjala,
                teksti.contains(fjala) ? "gjendet" : "nuk gjendet", teksti.indexOf(fjala));

        //e
        System.out.print("Shkruaj tekstin qe po kërkoni ta zëvendësoni: ");
        String fjalaEPare = reader.next();
        System.out.print("Shkruani tekstin zëvendësues: ");
        String fjalaTjeter = reader.next();
        System.out.printf("%s %n", teksti.contains(fjalaEPare) ? teksti.replace(fjalaEPare, fjalaTjeter)
                : "Fjala nuk gjendet ne tekstin e dhënë dhe teksti nuk pësoi ndryshime");
    }
}
