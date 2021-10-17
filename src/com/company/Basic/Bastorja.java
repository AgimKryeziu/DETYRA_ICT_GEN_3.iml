package com.company.Basic;

import java.util.Scanner;

public class Bastorja {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Ekipi vendas: ");
        String ekipiVendas = reader.nextLine();
        System.out.print("Ekipi Musafir: ");
        String ekipiMusafir = reader.nextLine();
        System.out.print("\"Duhet te jepni prognozen tuaj \n" +
                " 1 nese mendoni se fiton ekipi vendas \n" +
                " 2 nese mendoni qe fiton ekipi musafit \n" +
                " x nese mendoni qe loja perfundon me barazim: ");
        String prognoza = reader.nextLine();

        if (prognoza.equals("1")) {
            System.out.printf("Prognoza ime per ndeshjen ndermjet %s vs %s eshte se fiton %s %n.", ekipiVendas, ekipiMusafir, ekipiVendas);
        }
        else if (prognoza.equals("2")){
            System.out.printf("Prognoza ime per ndeshjen ndermjet %s vs %s eshte se fiton %s. %n", ekipiVendas, ekipiMusafir, ekipiMusafir);
        }
        else if (prognoza.equals("2")){
            System.out.printf("Prognoza ime per ndeshjen ndermjet %s vs %s eshte se ndeshja perfundon me barazim.)", ekipiVendas, ekipiMusafir);
        }
        else {
            System.out.println("Keni shtypur prognozen gabim!");
        }
    }
}
