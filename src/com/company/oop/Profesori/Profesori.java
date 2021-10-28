package com.company.oop.Profesori;

import java.time.LocalDate;

public class Profesori {
    private String _emri;
    private String _mbiemri;
    private LocalDate _datelindja;
    private char _gjinia;
    private String _lenda;
    private String _depertamenti;
    private int _vitiIFillimitTePunes;

    public Profesori(String _emri, String _mbiemri, LocalDate _datelindja, char _gjinia, String _lenda, String _depertamenti, int _vitiIFillimitTePunes) {
        this._emri = _emri;
        this._mbiemri = _mbiemri;
        this._datelindja = _datelindja;
        this._gjinia = _gjinia;
        this._lenda = _lenda;
        this._depertamenti = _depertamenti;
        this._vitiIFillimitTePunes = _vitiIFillimitTePunes;
    }

    public String get_emri() {
        return _emri;
    }

    public void set_emri(String _emri) {
        this._emri = _emri;
    }

    public String get_mbiemri() {
        return _mbiemri;
    }

    public void set_mbiemri(String _mbiemri) {
        this._mbiemri = _mbiemri;
    }

    public LocalDate get_datelindja() {
        return _datelindja;
    }

    public void set_datelindja(LocalDate _datelindja) {
        this._datelindja = _datelindja;
    }

    public char get_gjinia() {
        return _gjinia;
    }

    public void set_gjinia(char _gjinia) {
        this._gjinia = _gjinia;
    }

    public String get_lenda() {
        return _lenda;
    }

    public void set_lenda(String _lenda) {
        this._lenda = _lenda;
    }

    public String get_depertamenti() {
        return _depertamenti;
    }

    public void set_depertamenti(String _depertamenti) {
        this._depertamenti = _depertamenti;
    }

    public int get_vitiIFillimitTePunes() {
        return _vitiIFillimitTePunes;
    }

    public void set_vitiIFillimitTePunes(int _vitiIFillimitTePunes) {
        this._vitiIFillimitTePunes = _vitiIFillimitTePunes;
    }

    private int Stazhi(){
        int stazhi = LocalDate.now().getYear() - get_vitiIFillimitTePunes();
        return stazhi;
    }
    public void Shtyp() {
        System.out.print("Emri:  " + get_emri() + "\n" +
                "Mbiemri: " + get_mbiemri() + "\n" +
                "Datelindja: " + get_datelindja() + "\n" +
                "Gjinia: " + get_gjinia() + "\n" +
                "Lenda: " + get_lenda() + "\n" +
                "Depertamenti: " + get_depertamenti() + "\n" +
                "Stazhi: " + Stazhi() + " Vite\n"
        );
    }
}
