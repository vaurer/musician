package va.CC;


public class Musician extends Artist{

    public  enum INSTRUMENT {VOICE, LEADGUITAR,RHITHMGUITAR, BASGUITAR, DRUMS}


    private INSTRUMENT instrument;
    private Band band;
    private String sound;

    public Musician(String firstName, String lastName, int age, String stageName,INSTRUMENT instrument, Band band) {
        super(firstName, lastName, age, stageName);
        this.instrument = instrument;
        this.band = band;
        this.sound = "mOO Mmmmh, OO Mmmmmh!";
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public INSTRUMENT getInstrument() {
        return instrument;
    }

    public void setInstrument(INSTRUMENT instrument) {
        this.instrument = instrument;
    }

    public Band getBand() {
        return band;
    }

    public void setBand(Band band) {
        this.band = band;
    }

    public void playMusic(){
        for (int i = 0; i <1 ; i++) {
            System.out.println(" la la la");
        }
    }
}
