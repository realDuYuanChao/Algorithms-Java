package DataStructures;

import java.util.NoSuchElementException;

public class Queue {

    /* store element of queue */
    private int[] values;

    /* max size of queue */
    private int maxSize;

    /* front of queue */
    private int front;

    /* end of queue(not store element) */
    private int rear;

    /* the size of queue */
    private int size;

    /**
     * DEFAULT SIZE
     */
    private static int DEFAULT_CAPACITY = 10;

    /**
     * default constructor with {@link #DEFAULT_CAPACITY}
     */
    public Queue() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * init queue with specified size
     *
     * @param capacity queue size
     */
    public Queue(int capacity) {
        values = new int[capacity + 1];
        front = rear = 0;
        maxSize = capacity + 1;
        this.size = 0;
    }

    /**
     * Check whether queue is full or not
     *
     * @return <tt>true</tt> if queue is full, otherwise <tt>true</tt>
     */
    public boolean isFull() {
        return size == maxSize - 1;
    }

    /**
     * Check whether queue is empty or not
     *
     * @return <tt>true</tt> if queue is empty, otherwise <tt>false</tt>>
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * insert value to end of queue
     *
     * @param value to insert
     * @return <tt>true</tt> if {@link #isFull()} is <tt>false</tt>, otherwise <tt>false</tt>
     */
    public boolean enqueue(int value) {
        if (isFull()) {
            return false;
        }

        values[rear] = value;
        rear = ++rear % maxSize;
        size++;
        return true;
    }

    /**
     * remove first element of queue
     *
     * @return first element of queue
     * @throws NoSuchElementException if {@link #isEmpty()} is {@code true}
     */
    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        int value = values[front];
        front = (++front) % maxSize;
        size--;
        return value;
    }

    /**
     * peek first element of queue
     *
     * @return first element of queue
     * @throws NoSuchElementException if{@link #isEmpty()} is {@code true}
     */
    public int peekFront() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        return values[front];
    }

    /**
     * peek last element of queue
     *
     * @return last element of queue
     * @throws NoSuchElementException if{@link #isEmpty()} is {@code true}
     */
    public int peekRear() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        return values[(rear - 1 + maxSize) % maxSize];
    }

    /**
     * get queue size
     *
     * @return size of queue
     */
    public int size() {
        return size; /* or (rear - front + maxSize) % maxSize */
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = front; i != rear; i = ++i % maxSize) {
            sb.append(values[i]).append(", ");
        }
        sb.replace(sb.length() - 2, sb.length(), "]");
        return sb.toString();
    }

    /* Driver */
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i);
            System.out.println(queue);
        }
        assert queue.toString().equals("[1, 2, 3, 4, 5]");
        assert queue.peekFront() == 1;
        assert queue.peekRear() == 5;

        for (int i = 1; i <= 5; i++) {
            assert queue.dequeue() == i;
        }
        assert queue.isEmpty();
    }
}
