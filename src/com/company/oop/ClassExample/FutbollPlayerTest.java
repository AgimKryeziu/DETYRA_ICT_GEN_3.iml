package com.company.oop.ClassExample;

import java.time.LocalDate;

public class FutbollPlayerTest {
    public static void main(String[] args) {
        FutbollPlayer futbollPlayer1 = new FutbollPlayer("Sokol", "Xhemaili", LocalDate.of(1999,07,17),178,'M');
        FutbollPlayer futbollPlayer2 = new FutbollPlayer();
        futbollPlayer2.set_name("Gezim");
        futbollPlayer2.set_surname("Ciriku");
        futbollPlayer2.set_birthdate(LocalDate.of(1997,04,20));
        futbollPlayer2.set_noGoal(756);
        futbollPlayer2.set_gender('M');

        System.out.println(futbollPlayer1.Print());
        System.out.println(futbollPlayer2.Print());
    }
}
