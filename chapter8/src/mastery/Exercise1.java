package mastery;

public class Exercise1 {
    private String name;
    private int id;

    public Exercise1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() { return name; }
    public int getId() { return id; }

    public String getDetails() {
        return "Name: " + name + ", ID: " + id;
    }
}