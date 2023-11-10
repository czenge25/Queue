public class Queue <T> {

    private int size;
    private QueueNode front;
    private QueueNode back;

    public Queue() {

    }

    public void enqueue(T element) {
        QueueNode n = new QueueNode(element);
        size++;
        if (size == 0) {
            front = n;
        } else {
            n.setChild(back);
            back = n;
        }
    }

    public T dequeue() {
        T data = (T) front.getData();
        front = front.getChild(); // Move the front reference to the next node
        if (front == null) {
            back = null; // If the queue becomes empty, update the rear reference as well
        }
        return data;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return size;
    }

    public T peek() {
        return (T) front.getData();
    }
}
