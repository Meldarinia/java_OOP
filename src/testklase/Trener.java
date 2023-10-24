package testklase;
/*
Kreirati klasu Trener koja nasleđuje klasu Clan i koja dodatno
pamti godine iskustva. Trener može da savlada svaku spravu i informacije o
njemu se prikazuju u formatu:
Instruktor: (id ime prezime)
Godine iskustva: (iskustvo)
 */

public class Trener extends Clan {
    private int godIskustva;

    public Trener() {

    }

    public Trener(String idKod, String ime, String prezime, double visina, double tezina, int godIskustva) {
        super(idKod, ime, prezime, visina, tezina);
        this.godIskustva = godIskustva;
    }

    public int getGodIskustva() {
        return godIskustva;
    }

    public void setGodIskustva(int godIskustva) {
        this.godIskustva = godIskustva;
    }

    @Override
    public boolean postignutCilj(Sprava sprava) {
        return true;
    }

    @Override
    public void prikaziProfil() {
        System.out.println("Instruktor: (" + this.idKod + " " + this.ime + " " + this.prezime + ") \n" +
                "Godine iskustva: (" + this.godIskustva + ")");
    }
}
