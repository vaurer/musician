package va.CC;

import java.util.ArrayList;

public class MusicContest {
    private String contestName;
    ArrayList<Musician> musicians;

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
        int winner = (int) (Math.random() * musicians.size() - 1);
        Musician contestWinner = this.musicians.get(winner);
        //System.out.println("\nAnd the winner is...." + contestWinner().getName());
        return contestWinner;

    }

    public void addContestant(Musician musician) {
        this.musicians.add(musician);
        musician.getName();
        musician.getSound();
    }

    public void printContesters() {
        System.out.println(contestName + " contesters:");
        for (int i = 0; i < musicians.size(); i++) {
            System.out.println(musicians.get(i).getName());

        }
        System.out.println("\nAnd the winner is...." + contestWinner().getName());

    }
}
