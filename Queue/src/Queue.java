/*
CZ
11/17/23
HK
 */

public class Queue <T> {

    // Private instance data for the size and references to the front and back nodes
    private int size;
    private QueueNode<T> front = new QueueNode<>();
    private QueueNode<T> back = new QueueNode<>();

    // Constructor for creating an empty queue
    public Queue() {

    }

    // Method to add an element to the back of the queue
    public void enqueue(T element) {
        QueueNode<T> newNode = new QueueNode<>(element);
        // If the queue is empty, set the front to the new node
        if (isEmpty()) {
            front = newNode;
        } else {
            // Otherwise, set the child of the current back node to the new node
            back.setChild(newNode);
        }
        // Update the back to be the new node, and increase the size
        back = newNode;
        size++;
    }

    // Method to remove and return the element from the front of the queue
    public T dequeue() {
        // Check if the queue is not empty
        if (size >= 1) {
            T data = front.getData(); // Retrieve data from the front node
            front = front.getChild(); // Move the front reference to the next node
            size--;
            return data;
        }
        // If the queue is empty, update the back reference as well
        if (front == null) {
            back = null;
        }
        return null; // Return null if the queue is empty
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0; // Return true if the size is 0, indicating an empty queue
    }

    // Method to get the current size of the queue
    public int size() {
        return size;
    }

    // Method to peek at the element in the front of the queue without removing it
    public T peek() {
        return front.getData();
    }
}
