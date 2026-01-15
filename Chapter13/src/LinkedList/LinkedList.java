/*
Program: LinkedList
Java Last Date of this Revision: January 7, 2025
Purpose: This program implements a linked list data
structure and demonstrates adding and removing elements.
Test cases are included to show list operations and
empty list behavior.
Author: Misha Stanev
School: CHHS
Course: Computer Science 30
*/

package LinkedList; 

public class LinkedList 
{
    // Reference to the first node in the linked list
    private Node head;

    // Constructor: creates an empty linked list
    public LinkedList()
    {
        head = null;
    }

    // Adds a new node to the front of the linked list
    public void addAtFront(String str)
    {
        Node newNode = new Node(str);
        newNode.setNext(head);
        head = newNode;
    }

    // Adds a new node to the end of the linked list
    public void addAtEnd(String str)
    {
        Node newNode = new Node(str);
        Node current = head;

        // If the list is empty, make the new node the head
        if (head == null)
        {
            head = newNode;
        }
        else
        {
            // Traverse the list until the last node is reached
            while (current.getNext() != null)
            {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    // Removes the first occurrence of the specified value from the list
    public void remove(String str)
    {
        Node current = head;
        Node previous = head;

        // Safety check: empty list
        if (current == null)
        {
            return;
        }

        // If the item to remove is at the head
        if (current.getData().equals(str))
        {
            head = current.getNext();
        }
        else
        {
            // Traverse the list to find the item
            while (current.getNext() != null)
            {
                previous = current;
                current = current.getNext();

                if (current.getData().equals(str))
                {
                    previous.setNext(current.getNext());
                    return;
                }
            }
        }
    }

    // Returns the number of nodes in the linked list
    public int size()
    {
        Node current = head;
        int count = 0;

        while (current != null)
        {
            count++;
            current = current.getNext();
        }
        return count;
    }

    // Returns a string representation of the linked list
    public String toString()
    {
        Node current = head;

        if (current == null)
        {
            return "There are no items in the list.";
        }

        String listString = "";

        while (current != null)
        {
            listString += current.getData() + "\n";
            current = current.getNext();
        }

        return listString;
    }

    // Removes all nodes from the linked list
    public void makeEmpty()
    {
        head = null;
    }
}

/*
Test Cases

Test Case 1:
Diamond
Computer
Car
Fish
Hat
Green

list size: 6 items.
list size: 0 items.

Test Case 2:
Original list:
Joe
Chester
Dog

After removing Chester:
Joe
Dog
*/
