package Klasy;

import java.util.Vector;

public class Kurs {
    private String nazwaKursu;
    private int iloscGodzin;
    Vector<String> listaOcen = new Vector<String>();
    Vector<String> listaObecnosci = new Vector<String>();

    public Vector<String> getListaObecnosci() {
        return listaObecnosci;
    }

    public void setListaObecnosci(Vector<String> listaObecnosci) {
        this.listaObecnosci = listaObecnosci;
    }

    public Vector<String> getListaOcen() {
        return listaOcen;
    }
    
    

    public String getNazwaKursu() {
        return nazwaKursu;
    }

    public void setNazwaKursu(String nazwaKursu) {
        this.nazwaKursu = nazwaKursu;
    }

    public int getIloscGodzin() {
        return iloscGodzin;
    }

    public void setIloscGodzin(int iloscGodzin) {
        this.iloscGodzin = iloscGodzin;
    }

    public Kurs(String nazwaKursu, int iloscGodzin) {
        
        this.nazwaKursu = nazwaKursu;
        this.iloscGodzin = iloscGodzin;
    }
    
    public Kurs kopiuj(){
        return new Kurs(this.getNazwaKursu(),this.getIloscGodzin());
    }
    
    @Override
    public String toString(){
        return getNazwaKursu();
    }
    
}
