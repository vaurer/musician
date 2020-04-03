package va.CC;


abstract class Band {

    private String bandName;


    public Band(String bandName) {
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public abstract void playBandMusic();


}
