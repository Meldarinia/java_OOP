package testklase;
/*
Kreirati apstraktnu klasu Clan koja od zaštićenih atributa ima:
● identifikacioni kod,
● ime,
● prezime,
● visinu u cm (ne sme biti negativna vrednost),
● težinu (ne sme biti negativna vrednost),
dok od javnih metoda:
● default-ni i konstruktor koji postavlja sve atribute klase.
● gettere i settere (atribute klase  identifikacioni kod, ime i prezime nije
moguće menjati, nakon inicijalizacije tj. posle njihovog postavljanja u
konstruktoru)
● apstraktnu metodu prikaziProfil
● apstraktnu metodu postignutCilj koja vraća informaciju da li će se član
uspešno uraditi vežbe na spravi.(Podici tezinu) Metoda kao ulazni
parametar prima objekat tipa Sprava.
● Metod koji računa BMI po formuli: BMI = tezina u kg / (visina u m)2
 */

public abstract class Clan {
    protected String idKod;
    protected String ime;
    protected String prezime;
    protected double visina;
    protected double tezina;

    public Clan() {

    }

    public Clan(String idKod, String ime, String prezime, double visina, double tezina) {
        this.idKod = idKod;
        this.ime = ime;
        this.prezime = prezime;
        setVisina(visina);
        setTezina(tezina);
    }

    public String getIdKod() {
        return idKod;
    }

//    public void setIdKod(String idKod) {
//        this.idKod = idKod;
//    }

    public String getIme() {
        return ime;
    }

//    public void setIme(String ime) {
//        this.ime = ime;
//    }

    public String getPrezime() {
        return prezime;
    }

//    public void setPrezime(String prezime) {
//        this.prezime = prezime;
//    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        if (visina > 0) {
            this.visina = visina;
        } else {
            System.out.println("Invalidan unos visine.");
        }
    }

    public double getTezina() {
        return tezina;
    }

    public void setTezina(double tezina) {
        if (tezina > 0) {
            this.tezina = tezina;
        } else {
            System.out.println("Invalidan unos tezine");
        }
    }

    public abstract void prikaziProfil();

    public abstract boolean postignutCilj(Sprava sprava);

    public double bmi(double tezina, double visina) {
        return tezina / Math.pow(visina, 2);
    }
}
