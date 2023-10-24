package testklase;
/*
Kreirati klasu Rekreativac koja nasleđuje klasu Clan. Klasa
dodatno pamti još neke informacije i sadrži:
● maksimalan broj ponavljanja vežbi (ne sme biti negativna vrednost)
● maksimalno opterećenje (ne sme biti negativna vrednost)
● default-ni konstruktor i konstuktor koji postavlja sve parametre
● gettere i settere za sve atribute.
● da li će uspeti da postigne cilj zavisi od težine sprave i broja
ponavljanja. Uspešno će savladati samo ako je maksimalno
opterećenje Rekretivca veće ili jednako opterećenju sprave (težini rada
na spravi) i maksimalan broj ponavljanja veci od 3.
● metoda koja ispisuje podatke o rekreativcu ispisuje ih u sledećem
formatu:
Rekreativac: (id ime prezime)
Maksimalno opterećenje: (maksimalno opterećenje)
 */


public class Rekreativac extends Clan {

    private int maxBrojPonavljanjaVezbi;
    private int maxOpterecenje;

    public Rekreativac() {

    }

    public Rekreativac(String idKod, String ime, String prezime, double visina, double tezina, int maxBrojPonavljanjaVezbi, int maxOpterecenje) {
        super(idKod, ime, prezime, visina, tezina);
        setMaxBrojPonavljanjaVezbi(maxBrojPonavljanjaVezbi);
        setMaxOpterecenje(maxOpterecenje);
    }

    public int getMaxBrojPonavljanjaVezbi() {
        return maxBrojPonavljanjaVezbi;
    }

    public void setMaxBrojPonavljanjaVezbi(int maxBrojPonavljanjaVezbi) {
        if (maxBrojPonavljanjaVezbi > 0) {
            this.maxBrojPonavljanjaVezbi = maxBrojPonavljanjaVezbi;
        } else {
            System.out.println("Invalidan unos broja ponavljanja vezbi");
        }
    }

    public int getMaxOpterecenje() {
        return maxOpterecenje;
    }

    public void setMaxOpterecenje(int maxOpterecenje) {
        if (maxOpterecenje > 0) {
            this.maxOpterecenje = maxOpterecenje;
        } else {
            System.out.println("Invalidan unos maximalnog opterecenja.");
        }
    }

    @Override
    public boolean postignutCilj(Sprava sprava) {
        if (maxOpterecenje >= sprava.getTezinaRadaNaSpravi() && maxBrojPonavljanjaVezbi > 3){
            return true;
    }
        return false;
}


    @Override
    public void prikaziProfil() {
        System.out.println("Rekreativac: (" + this.idKod + " " + this.ime + " " + this.prezime + ") \n" +
                "Maximalno opterecenje: (" + this.maxOpterecenje + ")");
    }
}
