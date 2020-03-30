package va.CC;


public class Musician {

    public  enum INSTRUMENT {VOICE, LEADGUITAR,RHITHMGUITAR, BASGUITAR, DRUMS}


    private String name;
    private int age;
    private INSTRUMENT instrument;
    private Band band;

    public Musician(String name, int age, INSTRUMENT instrument, Band band) {
        this.name = name;
        this.age = age;
        this.instrument = instrument;
        this.band = band;
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

    public void playMusic(int repeats){
        for (int i = 0; i <repeats ; i++) {
            System.out.println(" la la la");
        }
    }
}
