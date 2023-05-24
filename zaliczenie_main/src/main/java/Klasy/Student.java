package Klasy;

import java.util.Vector;


public class Student extends Osoba{
    private String kierunekStudenta;
    private Vector<Kurs> listaKursow = new Vector<Kurs>();
    private Vector<Zadanie> listaZadan = new Vector<Zadanie>();
    private int wiek;

    public String getKierunekStudenta() {
        return kierunekStudenta;
    }

    public Vector<Kurs> getListaKursow() {
        return listaKursow;
    }
    

    public Student(String kierunekStudenta, Vector<Kurs> kursyStudenta, String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek);
        this.kierunekStudenta = kierunekStudenta;
        this.listaKursow = kursyStudenta;
        this.wiek = wiek;
    }
    
}
