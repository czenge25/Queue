/*
CZ
11/17/23
HK
 */

public class QueueNode<T> {
    // Data stored in the node
    private T data;

    // Reference to the child node
    private QueueNode<T> child;

    // Default constructor
    public QueueNode() {
        // No additional initialization needed for an empty node
    }

    // Constructor that sets data of the node
    public QueueNode(T data) {
        this.data = data;
    }

    // Constructor that sets data and child of the node
    public QueueNode(T data, QueueNode<T> child) {
        this.data = data;
        this.child = child;
    }

    // Gets the child node
    public QueueNode<T> getChild() {
        return child;
    }

    // Sets the child node
    public void setChild(QueueNode<T> n) {
        child = n;
    }

    // Returns the data stored in the node
    public T getData() {
        return data;
    }

    // Sets the data for this node
    public void setData(T data) {
        this.data = data;
    }

    // Gives a string representation of the node by converting its data to a string
    public String toString() {
        return "Node: " + this.data.toString();
    }

    // Compares the data of the node with the data of another node 'n'
    public boolean equals(QueueNode<T> n) {
        return this.data.equals(n.getData());
    }
}
