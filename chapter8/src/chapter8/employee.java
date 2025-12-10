package chapter8;

// Abstract class
public abstract class employee {

    private String firstName;
    private String lastName;

    // Constructor
    public employee(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }

    // Method to return full name
    public String getFullName() {
        return firstName + " " + lastName;
    }
}

// Manager subclass
class Manager extends employee {

    private double yearlySalary;

    // Constructor
    public Manager(String fn, String ln, double s) {
        super(fn, ln);   // call parent constructor
        yearlySalary = s;
    }

    public double getYearlySalary() {
        return yearlySalary;
    }
    
    private double hourlypayrate;
    
    
    
    
    
}

        
        
        
        
        
        
        
        
        
        
        

