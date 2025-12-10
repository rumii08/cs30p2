package mastery;

public class Staff extends Exercise1 {
    private String jobTitle;

    public Staff(String name, int id, String jobTitle) {
        super(name, id);
        this.jobTitle = jobTitle;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Job Title: " + jobTitle;
    }
}