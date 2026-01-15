package Stack;

public class Stack2Tester {

    public static void main(String[] args)
    {
        // ---------- TEST CASE 1 ----------
        // This test case demonstrates normal stack behavior
        // Items are pushed onto the stack and then one item is removed

        Stack2 s2 = new Stack2(3); // Create a stack with a maximum size of 3

        s2.push("Onion");   // Push "Onion" onto the stack
        s2.push("Beet");    // Push "Beet" onto the stack
        s2.push("Carrot");  // Push "Carrot" onto the stack

        // Display the top item and number of items in the stack
        System.out.println("Top of Stack s2: " + s2.top());
        System.out.println("Items in Stack s2: " + s2.size());

        s2.pop(); // Remove the top item from the stack

        // Display the new top item and updated size
        System.out.println("Top of Stack s2: " + s2.top());
        System.out.println("Items in Stack s2: " + s2.size());

        // ---------- TEST CASE 2 ----------
        // This test case checks empty stack behavior

        Stack2 s3 = new Stack2(2); // Create a stack with a maximum size of 2

        // Check if the stack is empty
        System.out.println("Is stack empty? " + s3.isEmpty());

        s3.push("Blue"); // Add an item to the stack

        // Display the top item in the stack
        System.out.println("Top of Stack s3: " + s3.top());

        s3.pop(); // Remove the item from the stack

        // Check if the stack is empty after popping
        System.out.println("Is stack empty after pop? " + s3.isEmpty());
    }
}
