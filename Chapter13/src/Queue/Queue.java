/*
Program: Queue
Java Last Date of this Revision: January 7, 2025
Purpose: This program implements a queue data structure using an
array and demonstrates enqueue and dequeue operations. Test cases
are included to show normal queue behavior and empty queue behavior.
Author: Misha Stanev
School: CHHS
Course: Computer Science 30
*/

package Queue;

public class Queue 
{
    // Array used to store queue elements
    private Object[] data;

    // front points to the first item, rear points to the last item
    private int front, rear;

    // Stores the maximum size of the queue
    private int maxsize;

    // Constructor: creates a queue with a maximum size
    public Queue(int maxItems)
    {
        data = new Object[maxItems];
        front = -1; // queue starts empty
        rear = -1;
        maxsize = maxItems;
    }

    // Returns the item at the front of the queue
    public Object front()
    {
        return data[front];
    }

    // Removes and returns the item at the front of the queue
    public Object dequeue()
    {
        Object item;

        item = data[front]; // store the front item

        // If there is only one item, empty the queue
        if (front == rear)
        {
            makeEmpty();
        }
        else
        {
            // Move front forward in a circular manner
            front = (front + 1) % maxsize;
        }
        return item;
    }

    // Adds an item to the rear of the queue
    public void enqueue(Object item)
    {
        // If the queue is empty, initialize front and rear
        if (isEmpty())
        {
            rear = 0;
            front = 0;
            data[rear] = item;
        }
        else
        {
            // Move rear forward in a circular manner
            rear = (rear + 1) % maxsize;
            data[rear] = item;
        }
    }

    // Checks if the queue is empty
    public boolean isEmpty()
    {
        if (front == -1 && rear == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // Removes all items from the queue
    public void makeEmpty()
    {
        front = -1;
        rear = -1;
    }

    // Returns the number of items in the queue
    public int size()
    {
        if (isEmpty())
        {
            return 0;
        }
        else
        {
            // Case when rear is ahead of front
            if (rear > front)
            {
                return rear - front + 1;
            }
            // Case when queue is full
            else if (front == rear + 1)
            {
                return maxsize;
            }
            // Case when queue wraps around
            else
            {
                return front - rear + 1;
            }
        }
    }
}

/*
Test Cases

Test Case 1:
Adding "knife", "fork", and "spoon" to queue2.
Front of queue2: knife
Size of queue2: 3
Remove an element from queue2: knife
Size of queue2: 2

Test Case 2:
Is queue empty? true
Front of queue3: blue
Is queue empty after dequeue? true
*/
