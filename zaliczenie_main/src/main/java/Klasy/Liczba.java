package Klasy;


public class Liczba {
    private int liczba;

    public int getLiczba() {
        return liczba;
    }

    public void setLiczba(int liczba) {
        this.liczba = liczba;
    }

    public Liczba(int liczba) {
        this.liczba = liczba;
    }
    
    @Override
    public String toString(){
        return getLiczba()+"";
    } 
}
