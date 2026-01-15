/*
Program: Stack2
Java Last Date of this Revision: January 15, 2025
Purpose: This program demonstrates how a stack data structure works by
implementing push and pop operations using an array. Test cases are included
to show normal stack behavior and empty stack behavior.
Author: Misha Stanev
School: CHHS
Course: Computer Science 30
*/

package Stack;

public class Stack2 
{
    // Array used to store stack elements
    private Object[] data;

    // Keeps track of the top position in the stack
    private int top;

    // Constructor: creates a stack with a maximum size
    public Stack2(int maxItems)
    {
        data = new Object[maxItems];
        top = -1; // stack starts empty
    }

    // Returns the item at the top of the stack
    public Object top()
    {
        return data[top];
    }

    // Removes and returns the top item from the stack
    public Object pop()
    {
        top = top - 1;
        return data[top + 1];
    }

    // Adds an item to the top of the stack
    public void push(Object item)
    {
        // Check if the stack is not full
        if (top < data.length - 1)
        {
            top = top + 1;
            data[top] = item;
        }
    }

    // Checks if the stack is empty
    public boolean isEmpty()
    {
        if (top == -1)
            return true;
        else
            return false;
    }

    // Removes all items from the stack
    public void makeEmpty()
    {
        top = -1;
    }

    // Returns the number of items in the stack
    public int size()
    {
        if (isEmpty())
            return 0;
        else
            return top + 1;
    }
}

/*
Test Cases

Test Case 1:
Top of Stack s2: Carrot
Items in Stack s2: 3
Top of Stack s2: Beet
Items in Stack s2: 2

Test Case 2:
Is stack empty? true
Top of Stack s3: Blue
Is stack empty after pop? true
*/
