package testklase;
/*
 Kreirati klasu Sprava koja opisuje spravu za vežbanje u teretani
i koja od privatnih atributa ima:
naziv
opis,
težinu rada na spravi (vrednost od 25 od  100),
a od javnih metoda:
default-ni konstruktor i konstuktor koji postavlja sve parametre
gettere i settere za sve attribute
 */

public class Sprava {
    private String naziv;
    private String opis;
    private int tezinaRadaNaSpravi;

    private final int minTezina = 25;
    private final int maxTezina = 100;

    public Sprava() {

    }

    public Sprava(String naziv, String opis, int tezinaRadaNaSpravi) {
        this.naziv = naziv;
        this.opis = opis;
        this.tezinaRadaNaSpravi = tezinaRadaNaSpravi;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getTezinaRadaNaSpravi() {
        return tezinaRadaNaSpravi;
    }

    public void setTezinaRadaNaSpravi(int tezinaRadaNaSpravi) {
        if (tezinaRadaNaSpravi >= minTezina && tezinaRadaNaSpravi <= maxTezina) {
            this.tezinaRadaNaSpravi = tezinaRadaNaSpravi;
        } else {
            System.out.println("Tezina nije u opsegu rada na spravi.");
        }
    }

    @Override
    public String toString() {
        return this.naziv + " " + this.opis + " " + this.tezinaRadaNaSpravi;
    }
}
