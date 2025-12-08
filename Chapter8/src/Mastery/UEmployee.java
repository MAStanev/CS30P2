package Mastery;

// Both Staff and Faculty inherit from this abstract class.
public abstract class UEmployee {
    
    // First and last name values stored for every employee.
    private String firstName;
    private String lastName;

    // Initializes the name information for an employee.
    public UEmployee(String f, String l) {
        firstName = f;
        lastName = l;
    }

    // Returns employee first and last name
    public String toString() {
        return firstName + " " + lastName;
    }


    public abstract double pay(double period);
}
