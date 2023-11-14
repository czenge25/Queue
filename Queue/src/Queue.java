public class Queue <T> {

    private int size;
    private QueueNode<T> front = new QueueNode<>();
    private QueueNode<T> back = new QueueNode<>();

    public Queue() {

    }

    public void enqueue(T element) {
        QueueNode<T> n = new QueueNode<>(element);
        if (isEmpty()) {
            front = n;
        } else {
            back.setChild(n);
        }
        back = n;
        size++;
    }

    public T dequeue() {
        if (size >= 1) {
            T data = front.getData();
            front = front.getChild(); // Move the front reference to the next node
            size--;
            return data;
        }
        if (front == null) {
            back = null; // If the queue becomes empty, update the rear reference as well
        }
        return null;
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
        return front.getData();
    }
}
