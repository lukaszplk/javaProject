package Klasy;


public class Wykladowca extends Osoba{
    private String specjalizacja;
    private int stazPracy;

    public String getSpecjalizacja() {
        return specjalizacja;
    }

    public void setSpecjalizacja(String specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    public int getStazPracy() {
        return stazPracy;
    }

    public void setStazPracy(int stazPracy) {
        this.stazPracy = stazPracy;
    }
    
   

    public Wykladowca(String imie, String nazwisko, int wiek, String specjalizacja, int stazPracy) {
        super(imie, nazwisko, wiek);
        this.specjalizacja = specjalizacja;
        this.stazPracy = stazPracy;
    }
    
    public String toString(){
        return super.toString() +" "+ getSpecjalizacja() +" "+ getStazPracy();
    }
    
    @Override
    public void pokazSie(){
        System.out.println("Wykladowca " + this.toString());
    }
}
