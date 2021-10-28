package com.company.oop.ClassExample;

import java.time.LocalDate;

public class Account {
    private String _emriIBankes;
    private String _emriIKonsumtorit;
    private String _mbiemriIKonsumtorit;
    private String _numriILlogarise;
    private LocalDate _kohaEPerdorimit;

    public Account() {
    }

    public Account(String emriIBankes, String emriIKonsumtorit, String mbiemriIKonsumtorit, String numriILlogarise, LocalDate
            kohaEPerdorimit) {
        this._emriIBankes = emriIBankes;
        this._emriIKonsumtorit = emriIKonsumtorit;
        this._mbiemriIKonsumtorit = mbiemriIKonsumtorit;
        this._numriILlogarise = numriILlogarise;
        this._kohaEPerdorimit = _kohaEPerdorimit;
    }

    public String get_emriIBankes() {
        return _emriIBankes;
    }

    public void set_emriIBankes(String emriIBankes) {
        this._emriIBankes = _emriIBankes;
    }

    public String get_emriIKonsumtorit() {
        return _emriIKonsumtorit;
    }

    public void set_emriIKonsumtorit(String emriIKonsumtorit) {
        this._emriIKonsumtorit = _emriIKonsumtorit;
    }

    public String get_mbiemriIKonsumtorit() {
        return _mbiemriIKonsumtorit;
    }

    public void set_mbiemriIKonsumtorit(String mbiemriIKonsumtorit) {
        this._mbiemriIKonsumtorit = _mbiemriIKonsumtorit;
    }

    public String get_numriILlogarise() {
        return _numriILlogarise;
    }

    public void set_numriILlogarise(String numriILlogarise) {
        this._numriILlogarise = _numriILlogarise;
    }

    public LocalDate get_kohaEPerdorimit() {
        return _kohaEPerdorimit;
    }

    public void set_kohaEPerdorimit(LocalDate kohaEPerdorimit) {
        this._kohaEPerdorimit = _kohaEPerdorimit;
    }

    public void Shtyp() {
        System.out.print("Emri i bankes:  " + get_emriIBankes() + "\n" +
                "Emri i konsumatorit: " + get_emriIKonsumtorit() + "\n" +
                "Mbiemri i konsumatorit: " + get_mbiemriIKonsumtorit() + "\n" +
                "Koha e perdorimit: " + get_kohaEPerdorimit() + "\n");
    }
}
