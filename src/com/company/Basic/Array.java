package com.company.Basic;

import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
      // Te mbushet nje varg me numra (10) ne menyre manuale nga shfrytezuesi?
     // int[] vargu = new int[10];
     //   Scanner reader = new Scanner(System.in);

      //   for (int i=0; i < vargu.length; i++){
      //       System.out.printf("Sheno numrin ne indeksion %d te vargut: ", i);
     //        vargu[i] = reader.nextInt();
    //    }
    //
    //   System.out.print("Vargu: ");
    //    for (int i = 0; i < vargu.length; i++) {
    //      System.out.print(vargu[i] + ",");
    //    }

        // Te mbushet nje var me numra (10) ne menyre te rastesishme (random) me rang te vlerave nga 1 deri ne 100.
        int[] vargu1 = new int[10];
        Random randomNum = new Random();
        for (int i = 0; i < vargu1.length; i++) {
           vargu1[i] += randomNum.nextInt(100);
        }
        System.out.print("Vargu: ");
       for(int i=0; i< vargu1.length; i++){
                System.out.print(vargu1[i] + ",");
       }
    }
}
