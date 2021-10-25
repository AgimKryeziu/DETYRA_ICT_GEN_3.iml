package com.company.oop.Studenti;

public class Nota {
    private String _studenti;
    private String _lenda;
    private float _dsh1;
    private float _dsh2;
    private float _dsh3;
    private float _provimi;
    private float _totalPiket;
    private int _notaFinale;

    public String get_studenti() {
        return _studenti;
    }

    public void set_studenti(String _studenti) {
        this._studenti = _studenti;
    }

    public String get_lenda() {
        return _lenda;
    }

    public void set_lenda(String _lenda) {
        this._lenda = _lenda;
    }

    public float get_dsh1() {
        return _dsh1;
    }

    public void set_dsh1(float _dsh1) {
        this._dsh1 = _dsh1;
    }

    public float get_dsh2() {
        return _dsh2;
    }

    public void set_dsh2(float _dsh2) {
        this._dsh2 = _dsh2;
    }

    public float get_dsh3() {
        return _dsh3;
    }

    public void set_dsh3(float _dsh3) {
        this._dsh3 = _dsh3;
    }

    public float get_provimi() {
        return _provimi;
    }

    public void set_provimi(float _provimi) {
        this._provimi = _provimi;
    }

    public float get_totalPiket() {
        return _totalPiket;
    }

    public int get_notaFinale() {
        return _notaFinale;
    }

    public void LlogaritNotenFinale() {
        _totalPiket = (70 * (_provimi / 100) + (10 * (_dsh1 / 100)) + (10 * (_dsh2 / 100)) + (10 * (_dsh3 / 100)));
        if (_provimi < 50 || _dsh1 < 50 || _dsh2 < 50 || _dsh3 < 50) {
            _notaFinale = 5;
        } else {
            if (_totalPiket >= 50 && _totalPiket < 60)
                _notaFinale = 6;
            else if (_totalPiket >= 60 && _totalPiket < 70)
                _notaFinale = 7;
            else if (_totalPiket >= 70 && _totalPiket < 80)
                _notaFinale = 8;
            else if (_totalPiket >= 80 && _totalPiket < 90)
                _notaFinale = 9;
            else if (_totalPiket >= 90 && _totalPiket <= 100)
                _notaFinale = 10;
        }
    }

    public void ShfaqNotenFinale() {
        if (_notaFinale > 5) {
            System.out.print("Studenti: " + _studenti + "\nNe lenden: " + _lenda +  "\nKa kaluar me noten: " + _notaFinale
                    + " me total pike: " + _totalPiket);
        } else if (_dsh1 < 50) {
            System.out.print("Studenti: " + _studenti + "\nNe lenden: " + _lenda +  " nuk ka kaluar! Nota: " + _notaFinale
                    + " me total pike: " + _totalPiket + " sepse Dsh1 eshte nen 50%");
        } else if (_dsh2 < 50) {
            System.out.print("Studenti: " + _studenti + "\nNe lenden: " + _lenda +  " nuk ka kaluar! Nota: " + _notaFinale
                    + " me total pike: " + _totalPiket + " sepse Dsh2 eshte nen 50%");
        } else if (_dsh3 < 50) {
            System.out.print("Studenti: " + _studenti + "\nNe lenden: " + _lenda +  " nuk ka kaluar! Nota: " + _notaFinale
                    + " me total pike: " + _totalPiket + " sepse Dsh3 eshte nen 50%");
        }
    }
}
