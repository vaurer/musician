package va.CC;

public class RehearsalRoom {
    public static void main(String[] args) {

        Band band1 = new Band("Guns N' Roses");
        Singer singer1 = new Singer("Axl", 30, Musician.INSTRUMENT.VOICE, band1, "hard rock");
        LeadGuitar leadGuitar1 = new LeadGuitar("Slash", 35, Musician.INSTRUMENT.LEADGUITAR, band1);
        Musician musician1 = new Musician("Duff", 33, Musician.INSTRUMENT.BASGUITAR, band1);
        Musician musician2 = new Musician("Izzy", 31, Musician.INSTRUMENT.RHITHMGUITAR, band1);
        Musician musician3 = new Musician("Steven", 33, Musician.INSTRUMENT.DRUMS, band1);
        //rehearsal(singer1);

        System.out.println(band1.getBandName());
        System.out.println(singer1.getAge());
        leadGuitar1.playMusic();
        musician1.playMusic();
        singer1.playMusic();
        playMusic(musician1, musician2, leadGuitar1, singer1);


        MusicContest musicContest1 = new MusicContest("Music Contest 2020");
        musicContest1.addContestant(musician1);
        musicContest1.addContestant(singer1);
        musicContest1.addContestant(leadGuitar1);
        musicContest1.printContesters();

    }


    public static void playMusic ( Musician ... gruppe){
        System.out.println("TU Tu TU, Ta, Ta, Bam");
        for (Musician musician : gruppe){
            musician.playMusic();
        }
        System.out.println("Wir müssen noch üben");
    }
}

