package mastery;

public class Faculty extends Exercise1 {
    private String rank;

    public Faculty(String name, int id, String rank) {
        super(name, id);
        this.rank = rank;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Rank: " + rank;
    }
}