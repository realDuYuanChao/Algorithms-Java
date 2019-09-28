package DataStructures;

import java.util.EmptyStackException;

public class Stack {

    private final static int DEFAULT_CAPACITY = 10;
    /* that contains elements */
    private int[] values;

    /* the capacity */
    private int capacity;

    /* the size of stack */
    private int size;

    /* top of stack */
    int top;

    public Stack() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * init stack
     *
     * @param size size of stack
     */
    public Stack(int size) {
        values = new int[size];
        this.capacity = size;
        top = -1; /* init top to - 1 means stack is empty */
        size = 0;
    }

    /**
     * check whether stack is empty
     *
     * @return {@code true} if {@code size} equals zero
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * add element to top of stack
     *
     * @param value to add
     * @return {@code true} if add success, otherwise {@code false}
     */
    public boolean push(int value) {
        values[++top] = value;
        size++;
        return true;
    }

    /**
     * remove last element of stack
     *
     * @return last element
     * @throws EmptyStackException if {@link #isEmpty()} is {@code true}
     */
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        size--;
        return values[top--];
    }

    /* Driver */
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1); /* 1 */
        stack.push(2); /* 1 2 */
        stack.push(3); /* 1 2 3 */
        stack.push(4); /* 1 2 3 4 */

        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + " ");
        }
    }
}
