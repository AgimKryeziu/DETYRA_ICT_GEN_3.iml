package com.company.Basic;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Pesha: ");
        float pesha = reader.nextFloat();
        System.out.print("Gjatesia: ");
        float gjatesia = reader.nextFloat();

        double bmi = pesha /Math.pow(gjatesia, 2);
        if (bmi <=18.5){
            System.out.println("Eshte nenpeshe!");
        }
        else if (bmi >= 25){
            System.out.println("Eshte mbipeshe!");
        }
        else {
            System.out.println("Normal");
        }
    }
}
