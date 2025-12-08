package Mastery;

// Represents a university faculty member who is paid on a yearly salary basis.
// Inherits employee information from UEmployee.
public class Faculty extends UEmployee {

    private double yearlySalary;

    // Creates a Faculty object using the employee's first name, last name,
    // and total yearly salary amount.
    public Faculty(String fn, String ln, double s) {
        super(fn, ln);  
        yearlySalary = s;
    }

    // Calculates payment by converting the yearly salary into a weekly amount,
    // then multiplying that value by the given number of weeks.
    public double pay(double weeks) {
        return (yearlySalary / 52) * weeks;
    }

    public String toString() {
        return super.toString() + ", Faculty, Salary: " + yearlySalary;
    }
}
