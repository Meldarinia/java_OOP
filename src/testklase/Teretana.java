package testklase;
/*
Kreirati klasu Teretana koja ima privatne atribute:
● naziv
● godinu kada je osnovana
● članove
Dok od javnih:
● default-ni konstuktor i konstuktor koji postavlja sve parametre
● gettere i settere
● metodu koja prihvata objekat Sprava i listu clanova, a zatim vraća broj
članova koji uspešno postižu svoj cilj.
 */

import java.util.ArrayList;

public class Teretana {
    private String naziv;
    private int godinaOsnivanja;
    private ArrayList<Clan> clanovi = new ArrayList<>();

    public Teretana() {

    }

    public Teretana(String naziv, int godinaOsnivanja, ArrayList<Clan> clanovi) {
        this.naziv = naziv;
        this.godinaOsnivanja = godinaOsnivanja;
        this.clanovi = clanovi;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaOsnivanja() {
        return godinaOsnivanja;
    }

    public void setGodinaOsnivanja(int godinaOsnivanja) {
        this.godinaOsnivanja = godinaOsnivanja;
    }

    public ArrayList<Clan> getClanovi() {
        return clanovi;
    }

    public void setClanovi(ArrayList<Clan> clanovi) {
        this.clanovi = clanovi;
    }

    public void brojClanovaUspesno(Sprava sprava, ArrayList<Clan> clanovi) {
        int count = 0;
        for (int i = 0; i < clanovi.size(); i++) {
            if (clanovi.get(i).postignutCilj(sprava) == true) {
                count++;
            }
        }
        System.out.println("Broj clanova koji su uspesno postigli cilj je:" + count);
    }
}
