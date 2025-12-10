package mastery;

public class Exercise1Tester {
    public static void main(String[] args) {
        // Creates a Faculty object
        Faculty f = new Faculty("Jane", 101, "Professor"); 
        
        // Creates a Staff object
        Staff s = new Staff("Mike", 202, "Administrator");

        System.out.println(f.getDetails());
        System.out.println(s.getDetails());
    }
}