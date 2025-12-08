package Mastery;

import java.text.NumberFormat;
import java.util.Scanner;

public class UEmployeeMain {

    // Accepts any UEmployee object (either Faculty or Staff)
    // and prints their pay using the pay method defined in their class.
    public static void payEmployee(UEmployee emp, double arg) {
        NumberFormat money = NumberFormat.getCurrencyInstance();
        double pay = emp.pay(arg);   
        System.out.println(money.format(pay));
    }

    public static void main(String[] args) {

        // Create one Faculty member and one Staff object
        Faculty emp1 = new Faculty("Steve", "Jenkins", 75000);
        Staff emp2 = new Staff("Blart", "Peels", 28.50);

        Scanner input = new Scanner(System.in);

        UEmployee emp = emp1;  // Default employee (can be changed by the user)
        String action;
        int empNum;
        double payArg;

        do {
            // Simple menu shown each loop
            System.out.println("\n(E)Employee  (P)Pay  (Q)Quit");
            System.out.print("Enter choice: ");
            action = input.next();

            if (!action.equalsIgnoreCase("Q")) {

                // Ask which employee the user wants to work with
                System.out.print("Enter employee number (1 = Faculty, 2 = Staff): ");
                empNum = input.nextInt();

                // Switch to whichever employee was chosen
                switch (empNum) {
                    case 1: emp = emp1; break;
                    case 2: emp = emp2; break;
                }

                if (action.equalsIgnoreCase("E")) {
                    // Displays the employee information using the toString method
                    System.out.println(emp);
                }
                else if (action.equalsIgnoreCase("P")) {
                    // Accept the time value used for pay calculation
                    System.out.println("Enter hours (Staff) or weeks (Faculty): ");
                    payArg = input.nextDouble();
                    payEmployee(emp, payArg);
                }
            }

        } while (!action.equalsIgnoreCase("Q"));

        System.out.println("Have a nice day!");
        input.close();
    }
}
