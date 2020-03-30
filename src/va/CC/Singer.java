package va.CC;

public class Singer extends Musician {

    private String musicArt;


    public Singer(String name, int age, INSTRUMENT instrument, Band band, String musicArt) {
        super(name, age, instrument, band);
        this.musicArt = musicArt;
    }
    public String getMusicArt() {
        return musicArt;
    }

    public void setMusicArt(String musicArt) {
        this.musicArt = musicArt;
    }
  @Override
  public void playMusic(){
      for (int i = 0; i <1 ; i++) {
          System.out.println("Welcome to the jungle...");
      }
  }
}
