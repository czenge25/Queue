/*
CZ
11/17/23
HK
 */

public class Main {
    public static void main(String[] args) {
        // Create a new instance of the Queue class
        Queue myQueue = new Queue();

        // Enqueues elements "One" and "Two" into the queue
        myQueue.enqueue("One");
        myQueue.enqueue("Two");

        // Prints the front element of the queue using peek()
        System.out.println("Front element: " + myQueue.peek());

        // Enqueues another element "Three" into the queue
        myQueue.enqueue("Three");

        // Prints the current size of the queue
        System.out.println("Queue size: " + myQueue.size());

        // Dequeues and print two elements from the front of the queue
        System.out.println("Dequeued element: " + myQueue.dequeue());
        System.out.println("Dequeued element: " + myQueue.dequeue());

        // Prints the size of the queue after dequeue operations
        System.out.println("Queue size after dequeue: " + myQueue.size());

        // Checks if the queue is empty and print the result
        System.out.println("Is the queue empty? " + myQueue.isEmpty());

        // Prints the front element of the queue using peek()
        System.out.println("Front element (peek): " + myQueue.peek());

        // Enqueues another element "Four" into the qeueue
        myQueue.enqueue("Four");

        // Prints the size of the queue after enqueue operation
        System.out.println("Queue size after enqueue: " + myQueue.size());

        // Dequeues all elements from the queue using a loop
        while (!myQueue.isEmpty()) {
            System.out.println("Dequeued element: " + myQueue.dequeue());
        }

        // Prints the size of the queue after all dequeue operations
        System.out.println("Queue size after all dequeue operations: " + myQueue.size());

        // Checks if the queue is empty after all operations and prints the result
        System.out.println("Is it empty? " + myQueue.isEmpty());
    }

}