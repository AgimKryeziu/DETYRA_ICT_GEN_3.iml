package com.company.oop.Profesori;

import java.time.LocalDate;

public class ProfesoriTest {
    public static void main(String[] args) {
        Profesori profesori = new Profesori("Naim", "Sulejmani", LocalDate.now().minusYears(35), 'M', "Android", "Shkenca kompjuterike", 2012);
        profesori.Shtyp();
    }
}
