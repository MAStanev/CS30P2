package LinkedList; 

public class LinkedListTester 
{
    public static void main(String[] args) 
    {
        // ---------- TEST CASE 1 ----------
        // This test case demonstrates adding elements to the linked list
        // and checking the size before and after emptying the list

        LinkedList list = new LinkedList(); // Create an empty linked list

        // Add items to the front of the list (4 items)
        list.addAtFront("Fish");
        list.addAtFront("Car");
        list.addAtFront("Computer");
        list.addAtFront("Diamond");

        // Add items to the end of the list (2 items)
        list.addAtEnd("Hat");
        list.addAtEnd("Green");

        // Display the contents of the linked list
        System.out.println(list);

        // Display the number of items in the list
        System.out.println("list size: "
                + list.size() + " items.");

        // Remove all items from the list
        list.makeEmpty();

        // Display the size after emptying the list
        System.out.println("list size: "
                + list.size() + " items.");

        // ---------- TEST CASE 2 ----------
        // This test case demonstrates removing an element from the linked list

        LinkedList list2 = new LinkedList(); // Create a new linked list

        // Add items to the list (3 items)
        list2.addAtEnd("Joe");
        list2.addAtEnd("Chester");
        list2.addAtEnd("Dog");

        // Display the original list
        System.out.println("\nOriginal list:");
        System.out.println(list2);

        // Remove an item from the list
        list2.remove("Chester");

        // Display the list after removal
        System.out.println("After removing Chester:");
        System.out.println(list2);
    }
}
