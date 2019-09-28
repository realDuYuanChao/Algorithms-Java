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

    public Queue(int size) {
        values = new int[size + 1];
        front = rear = 0;
        maxSize = size + 1;
    }

    /**
     * Check whether queue is full or not
     *
     * @return {@code true} if queue is full, otherwise {@code false}
     */
    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    /**
     * Check whether queue is empty or not
     *
     * @return {@code true} if queue is empty, otherwise {@code false}
     */
    public boolean isEmpty() {
        return front == rear;
    }

    /**
     * insert value to end of queue
     *
     * @param value to insert
     * @return {@code true} if {@link #isFull()} is {@code false}, otherwise false
     */
    public boolean enqueue(int value) {
        if (isFull()) {
            return false;
        }

        values[rear] = value;
        rear = ++rear % maxSize;
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

    /* Driver */
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        System.out.println(queue.isEmpty()); /* output: true */
        queue.enqueue(1); /* 1 */
        queue.enqueue(2); /* 1 2 */
        queue.enqueue(3); /* 1 2 3 */
        queue.enqueue(4); /* 1 2 3 4 */
        System.out.println(queue.isFull()); /* output: false */
        queue.enqueue(5); /* 1 2 3 4 5 */
        System.out.println(queue.isFull()); /* output: true */

        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " "); /* output: 1 2 3 4 5 */
        }
    }
}
