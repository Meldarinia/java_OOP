package testklase;
/*
U glavnom programu kreirati jednu teretanu, najmanje 4
redovna člana i jednog trenera i prikazati koliko članova uspešno postiže svoj cilj.
 */

import java.util.ArrayList;

public class GlavniProgram {
    public static void main(String[] args) {

        Rekreativac rekreativac1 = new Rekreativac("id2233", "Marko", "Markovic", 183.5, 80, 30, 50);
        Rekreativac rekreativac2 = new Rekreativac("id1155", "Petar", "Petrovic", 180, 75, 35, 45);
        Rekreativac rekreativac3 = new Rekreativac("id1234", "Nikola", "Nikolic", 183.5, 78, 40, 60);
        Rekreativac rekreativac4 = new Rekreativac("id1880", "Janko", "Jankovic", 178.3, 88, 30, 30);

        Trener trener = new Trener("id0023", "Vaso", "Vasovic", 170.2, 79, 10);

        ArrayList<Clan> clanovi = new ArrayList<>();
        clanovi.add(rekreativac1);
        clanovi.add(rekreativac2);
        clanovi.add(rekreativac3);
        clanovi.add(rekreativac4);
        clanovi.add(trener);

        Teretana teretana = new Teretana();
        teretana.setNaziv("Flex Gym");
        teretana.setGodinaOsnivanja(2005);
        teretana.setClanovi(clanovi);

        Sprava bench = new Sprava();
        bench.setNaziv("bench");
        bench.setOpis("dizanje tegova");
        bench.setTezinaRadaNaSpravi(60);


        teretana.brojClanovaUspesno(bench, clanovi);


    }
}

