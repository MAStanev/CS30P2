package Queue;

public class QueueTester 
{
    public static void main(String[] args) 
    {
        // ---------- TEST CASE 1 ----------
        // This test case demonstrates normal queue behavior
        // Items are added to the queue and then one item is removed

        Queue q2 = new Queue(3); // Create a queue with a maximum size of 3

        // Display message showing what is being added to the queue
        System.out.println("Adding \"knife\", "
                + "\"fork\", and \"spoon\" to queue2.");

        q2.enqueue("knife");   // Add "knife" to the queue
        q2.enqueue("fork");    // Add "fork" to the queue
        q2.enqueue("spoon");   // Add "spoon" to the queue

        // Display the front item and size of the queue
        System.out.println("Front of queue2: " + q2.front());
        System.out.println("Size of queue2: " + q2.size());

        // Remove an item from the queue and display it
        System.out.println("Remove an element from queue2: " + q2.dequeue());

        // Display the updated size of the queue
        System.out.println("Size of queue2: " + q2.size());

        // ---------- TEST CASE 2 ----------
        // This test case checks empty queue behavior

        Queue q3 = new Queue(2); // Create a queue with a maximum size of 2

        // Check if the queue is empty
        System.out.println("\nIs queue empty? " + q3.isEmpty());

        q3.enqueue("blue"); // Add an item to the queue

        // Display the front item in the queue
        System.out.println("Front of queue3: " + q3.front());

        q3.dequeue(); // Remove the item from the queue

        // Check if the queue is empty after dequeue
        System.out.println("Is queue empty after dequeue? " + q3.isEmpty());
    }
}
