package com.company.oop.ClassExample;

import java.time.LocalDate;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("TEB", "Agim", "Kryeziu", "5352250102255943", LocalDate.now().plusYears(7));
        Account account2 = new Account();
        account2.set_emriIBankes("Raiffaisen Bank");
        account2.set_emriIKonsumtorit("Habib");
        account2.set_mbiemriIKonsumtorit("Kadriu");
        account2.set_numriILlogarise("1501120014805550");
        account2.set_kohaEPerdorimit(LocalDate.now().plusYears(5));

        account1.Shtyp();
        System.out.println("*******************************");
        account2.Shtyp();
    }
}
