package va.CC;

public class LeadGuitar extends Musician{
    public LeadGuitar(String name, int age, INSTRUMENT instrument, Band band) {
        super(name, age, instrument, band);
    }

    @Override
    public void playMusic(int repeats){
        for (int i = 0; i <repeats ; i++) {
            System.out.println("na na na na na na");
        }
    }
}
