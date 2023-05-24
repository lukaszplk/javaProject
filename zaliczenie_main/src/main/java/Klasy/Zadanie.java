package Klasy;


public class Zadanie {
    private String nazwa;
    private boolean rozwiazane;

    public Zadanie(String nazwa, boolean rozwiazane) {
        this.nazwa = nazwa;
        this.rozwiazane = rozwiazane;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public boolean isRozwiazane() {
        return rozwiazane;
    }

    public void setRozwiazane(boolean rozwiazane) {
        this.rozwiazane = rozwiazane;
    }
}
