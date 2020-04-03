package va.CC;

public class Artist extends Person {

    public String stageName;

    public Artist(String firstName, String lastName, int age, String stageName) {
        super(firstName, lastName, age);
        this.stageName = stageName;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }
}
