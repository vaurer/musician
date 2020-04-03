package va.CC;

import java.util.ArrayList;

public class MusicContest {
    private String contestName;
    private ArrayList<Musician> musicians;

    public MusicContest(String contestName) {
        this.contestName = contestName;
        this.musicians = new ArrayList<>();
    }

    public String getContestName() {
        return contestName;
    }

    public void setContestName(String contestName) {
        this.contestName = contestName;
    }

    public Musician contestWinner() {
        int winner = (int) (Math.random() * musicians.size());
        Musician contestWinner = this.musicians.get(winner);
        //System.out.println("\nAnd the winner is...." + contestWinner().getName());
        return contestWinner;

    }

    public void addContestant(Musician musician) {
        this.musicians.add(musician);
        musician.getStageName();
        musician.getSound();
    }

    public void printContesters() {
        System.out.println("\n" + contestName + " contesters:");
        for (int i = 0; i < musicians.size(); i++) {
            System.out.println(musicians.get(i).getFirstName() + " " + musicians.get(i).getLastName() + " - " + musicians.get(i).getStageName());

        }
        System.out.println("\nAnd the winner is.... " + contestWinner().getStageName());
        contestWinner().playMusic();
    }
}
