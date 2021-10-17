package com.company.Basic;

import java.util.Scanner;

public class NumeroKarakteret {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj tekstin: ");
        String teksti = reader.nextLine();


        int zanore = 0;
        int bashkingllore = 0;
        int shenja = 0;

        int couner = 0;
        while (couner < teksti.length()){
            if (teksti.charAt(couner) == 'a' || teksti.charAt(couner) == 'e'  || teksti.charAt(couner) == 'i' ||
                    teksti.charAt(couner) == 'o' || teksti.charAt(couner) == 'u' || teksti.charAt(couner) == 'y' ||
                    teksti.charAt(couner) == 'A' || teksti.charAt(couner) == 'E'  || teksti.charAt(couner) == 'I' ||
                    teksti.charAt(couner) == 'O' || teksti.charAt(couner) == 'U' || teksti.charAt(couner) == 'Y'){
                zanore += 1;
            }
            else if (teksti.charAt(couner) == 'b'|| teksti.charAt(couner) == 'c' || teksti.charAt(couner) == 'd' ||
                    teksti.charAt(couner) == 'f' || teksti.charAt(couner) == 'g' || teksti.charAt(couner) == 'h' ||
                    teksti.charAt(couner) == 'j' || teksti.charAt(couner) == 'k' || teksti.charAt(couner) == 'l' ||
                    teksti.charAt(couner) == 'm' || teksti.charAt(couner) == 'n' || teksti.charAt(couner) == 'p' ||
                    teksti.charAt(couner) == 'q' || teksti.charAt(couner) == 'r' || teksti.charAt(couner) == 's' ||
                    teksti.charAt(couner) == 't' || teksti.charAt(couner) == 'v' || teksti.charAt(couner) == 'w' ||
                    teksti.charAt(couner) == 'x' || teksti.charAt(couner) == 'z' || teksti.charAt(couner) == 'B' ||
                    teksti.charAt(couner) == 'C' || teksti.charAt(couner) == 'D' || teksti.charAt(couner) == 'F' ||
                    teksti.charAt(couner) == 'G' || teksti.charAt(couner) == 'H' || teksti.charAt(couner) == 'J' ||
                    teksti.charAt(couner) == 'K' || teksti.charAt(couner) == 'L' || teksti.charAt(couner) == 'M' ||
                    teksti.charAt(couner) == 'N' || teksti.charAt(couner) == 'P' || teksti.charAt(couner) == 'Q' ||
                    teksti.charAt(couner) == 'R' || teksti.charAt(couner) == 'S' || teksti.charAt(couner) == 'T' ||
                    teksti.charAt(couner) == 'V' || teksti.charAt(couner) == 'W' || teksti.charAt(couner) == 'X' ||
                    teksti.charAt(couner) == 'Z'){
                bashkingllore += 1;
            }
            else if(teksti.charAt(couner) == '.' || teksti.charAt(couner) == '?' || teksti.charAt(couner) == '!' ||
                    teksti.charAt(couner) == ',' || teksti.charAt(couner) == ';' || teksti.charAt(couner) == '@' ||
                    teksti.charAt(couner) == '^'|| teksti.charAt(couner) == '%' || teksti.charAt(couner) == '$' ||
                    teksti.charAt(couner) == '#' || teksti.charAt(couner) == '*' || teksti.charAt(couner) == '/') {
                shenja += 1;
            }
            couner++;
        }
        System.out.printf("Zanore: %d%nBashtingllore: %d%nShenja: %d%n", zanore, bashkingllore, shenja);
    }
}
