package com.company.oop.ClassExample;

import java.time.LocalDate;

public class FutbollPlayer {
    private String _name;
    private String _surname;
    private LocalDate _birthdate;
    private int _noGoal;
    private char _gender;

    public FutbollPlayer() {

    }

    public FutbollPlayer(String name, String surname, LocalDate birthdate, int noGoal, char gender) {
        this._name = name;
        this._surname = surname;
        this._birthdate = birthdate;
        this._noGoal = noGoal;
        this._gender = gender;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        this._name = name;
    }

    public String get_surname() {
        return _surname;
    }

    public void set_surname(String surname) {
        this._surname = surname;
    }

    public LocalDate get_birthdate() {
        return _birthdate;
    }

    public void set_birthdate(LocalDate birthdate) {
        this._birthdate = birthdate;
    }

    public int get_noGoal() {
        return _noGoal;
    }

    public void set_noGoal(int noGoal) {
        this._noGoal = noGoal;
    }

    public char get_gender() {
        return _gender;
    }

    public void set_gender(char gender) {
        this._gender = gender;
    }

    public String Print(){
        System.out.println("******************************");
        String result = "Emri: " + _name +"\n" +
                "Mbiemri: " + _surname +"\n" +
                "Datelindja: " + _birthdate +"\n" +
                "Numri i golave te shenuara: " + _noGoal +"\n" +
                "Gjinia: " + _gender;
        return result;
    }
}
