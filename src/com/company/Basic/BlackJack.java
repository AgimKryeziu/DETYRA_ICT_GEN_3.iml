package com.company.Basic;

import com.company.Main;

import java.util.Random;
import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        String anotherCard, playAgain = "y", ctn = null;
        int nextCard, card1, card2, dCard1, dCard2;
        int cardTotal = 0, dTotal = 0;
        Scanner keyBoard = new Scanner(System.in);
        Random random = new Random();

        while ("y".equals(playAgain)) {
            dCard1 = random.nextInt(10) + 1;
            dCard2 = random.nextInt(10) + 1;

            card1 = random.nextInt(10) + 1;
            card2 = random.nextInt(10) + 1;
            cardTotal = card1 + card2;
            //dealers two card total and display only one dealer card
            dTotal = dCard1 + dCard2;
            System.out.println("Shperndarsi: " + dCard1);

            //display players first two cards & card total
            System.out.println("Letrat e para: " + card1 + ", " + card2);
            System.out.println("Totali: " + cardTotal);

            System.out.println("Leter tjeter (y/n)?: ");
            anotherCard = keyBoard.nextLine();

            while ("y".equals(anotherCard)) {
                nextCard = random.nextInt(10) + 1;
                cardTotal += nextCard;
                System.out.println("Letra: " + nextCard);
                System.out.println("Totali: " + cardTotal);
                if (cardTotal > 21)
                {
                    System.out.println("Humbe, shperndarsi fitoi");
                    System.out.println("Deshironi te luani perseri? (y/n):");
                    playAgain = keyBoard.nextLine();
                }
                if (cardTotal < 21)
                    System.out.println("Leter tjeter (y/n)?: ");
                anotherCard = keyBoard.nextLine();
                if ("n".equals(anotherCard))
                    System.out.println("Shperndaresi kishte: " + dTotal);
                System.out.println("Ti kishe: " + cardTotal);
                while ("n".equals(anotherCard)){
                    if (dTotal < cardTotal && cardTotal < 21)
                    {
                        System.out.println("Wao ti fitove!");
                        System.out.println("Luaj perseri? (y/n): ");
                        playAgain = keyBoard.nextLine();
                        if (playAgain.equalsIgnoreCase("y"))
                            playAgain = "y";

                        if (dTotal > cardTotal && dTotal < 21)
                            System.out.println("Ti humbe!");
                        playAgain = keyBoard.nextLine();
                    }
                }
            }
        }
    }
}
