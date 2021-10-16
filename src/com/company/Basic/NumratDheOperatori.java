package com.company.Basic;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class NumratDheOperatori {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Numri i pare: ");
        int numri1 = reader.nextInt();
        System.out.print("Numri i dyte: ");
        int numri2 = reader.nextInt();
        reader.nextLine();
        System.out.print("Zgjedhja e operatorit aritmetik: ");
        String operatori = reader.nextLine();

        if(operatori.equals("+")){
            System.out.printf("Mbledhja: %d%n", numri1 + numri2);
        }
        else if(operatori.equals("-")){
            System.out.printf("Zbritja: %d%n", numri1 - numri2);
        }
        else if(operatori.equals("/")){
            System.out.printf("Pjestimi: %d%n", numri1 / numri2);
        }
        else if(operatori.equals("*")){
            System.out.printf("Shumezimi: %d%n", numri1 * numri2);
        }
        else if(operatori.equals("%")){
            System.out.printf("Modulusi: %d%n", numri1 % numri2);
        }
        else {
            System.out.println("Duhet te zgjidhet vetem orperatoret!");
        }
    }
}
