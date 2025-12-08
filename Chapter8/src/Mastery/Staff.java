package Mastery;

// Inherits basic employee information from UEmployee.
public class Staff extends UEmployee {

    private double hourlyRate;

    // Builds a Staff object using the employee's first name, last name, and their hourly pay rate.
    public Staff(String fn, String ln, double rate) {
        super(fn, ln);   
        hourlyRate = rate;
    }

    // Determines earnings by multiplying the hourly rate by the number of hours worked.
    public double pay(double hours) {
        return hourlyRate * hours;
    }

    public String toString() {
        return super.toString() + ", Staff, Hourly Rate: " + hourlyRate;
    }
}
