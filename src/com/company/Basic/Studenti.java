package com.company.Basic;

import java.util.Scanner;

public class Studenti {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Emri: ");
        String emri = reader.nextLine();
        System.out.print("Mbiemri: ");
        String mbiemri = reader.nextLine();
        System.out.print("Numri i oreve: ");
        int nrOreve = reader.nextInt();
        System.out.print("Numri i oreve qe ka ndjekur studenti: ");
        int nrOreveTeStudentit = reader.nextInt();

        double pjesemarrja = 100 * (nrOreveTeStudentit / nrOreve);

        if ( pjesemarrja == 100)
        {
            System.out.println("Keni 10 pike bonus per lende!");
        }
        else if (pjesemarrja > 49){
            System.out.println("Studenti i posedon kushtet per te hyre ne provim!");
        }
        else {
            System.out.println("Nuk i plotesi kushtet per te hyre ne provim!");
        }

    }
}
