package va.CC;


public class Musician {

    public  enum INSTRUMENT {VOICE, LEADGUITAR,RHITHMGUITAR, BASGUITAR, DRUMS}


    private String name;
    private int age;
    private INSTRUMENT instrument;
    private Band band;
    private String sound;

    public Musician(String name, int age, INSTRUMENT instrument, Band band) {
        this.name = name;
        this.age = age;
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
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
