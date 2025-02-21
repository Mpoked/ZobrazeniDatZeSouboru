public class Deskovka {
    private String nazev;
    private boolean jeKoupena;
    private int hodnoceni;

    public Deskovka(String nazev, boolean jeKoupena, int hodnoceni) {
        this.nazev = nazev;
        this.jeKoupena = jeKoupena;
        this.hodnoceni = hodnoceni;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public boolean isJeKoupena() {
        return jeKoupena;
    }

    public void setJeKoupena(boolean jeKoupena) {
        this.jeKoupena = jeKoupena;
    }

    public int getHodnoceni() {
        return hodnoceni;
    }

    public void setHodnoceni(int hodnoceni) {
        this.hodnoceni = hodnoceni;
    }

    @Override
    public String toString() {
        return "Deskovka{" +
                "nazev = '" + nazev + '\'' +
                ", jeKoupena = " + jeKoupena +
                ", hodnoceni = " + hodnoceni +
                '}';
    }
}
