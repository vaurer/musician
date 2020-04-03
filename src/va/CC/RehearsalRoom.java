package va.CC;

public class RehearsalRoom {
    public static void main(String[] args) {

        Band band1 = new Band("Guns N' Roses") {
            @Override
            public void playBandMusic() {
                System.out.println("Drum Drum Drum");
            }
        };

        Musician musician1 = new Musician("Duff", "McKagan", 28, "Duff", Musician.INSTRUMENT.BASGUITAR, band1);
        Musician musician2 = new Musician("Izzy", "Stradlin", 25, "Izzy", Musician.INSTRUMENT.RHITHMGUITAR, band1);
        Musician musician3 = new Musician("Michael ", "Coletti", 23, "Steven Adler", Musician.INSTRUMENT.DRUMS, band1);
        Musician musician4 = new Musician("William", "Rose", 29, "Axl Rose", Musician.INSTRUMENT.VOICE, band1);
        Musician musician5 = new Musician("Saul", "Hudson", 31, "Slash", Musician.INSTRUMENT.LEADGUITAR, band1);

        System.out.println(band1.getBandName());
        musician1.playMusic();
        playMusic(musician1, musician2, musician3, musician4, musician5);
        musician4.setSound("Welcome to the jungle...");
        band1.playBandMusic();
        System.out.println(musician4.getSound());
        System.out.println(musician1.getSound());


        MusicContest musicContest1 = new MusicContest("Music Contest 2020");
        musicContest1.addContestant(musician1);
        musicContest1.addContestant(musician2);
        musicContest1.addContestant(musician3);
        musicContest1.addContestant(musician4);
        musicContest1.addContestant(musician5);
        musicContest1.printContesters();

    }


    public static void playMusic(Musician... gruppe) {
        System.out.println("TU Tu TU, Ta, Ta, Bam");
        for (Musician musician : gruppe) {
            musician.playMusic();
        }
        System.out.println("We need more practice\n");
    }
}

