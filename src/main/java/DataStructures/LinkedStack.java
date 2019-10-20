package DataStructures;

import java.util.NoSuchElementException;

public class LinkedStack {

    /**
     * The size of stack
     */
    private int size;

    /**
     * The top of stack
     */
    private Node top;

    /**
     * Init Stack
     */
    public LinkedStack() {
        top = null;
        size = 0;
    }

    /**
     * Check if stack is empty
     *
     * @return <tt>true</tt> if stack is empty, otherwise <tt>false</tt>
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Return size of stack
     *
     * @return size of stack
     */
    public int size() {
        return size;
    }

    /**
     * Push element to top of stack
     *
     * @param data the  value
     * @return <tt>true</tt>
     */
    public boolean push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
        return true;
    }

    /**
     * Pop from stack
     *
     * @return element at top
     */
    public int pop() {
        if (size == 0) {
            throw new NoSuchElementException("stack is empty");
        }
        Node destroy = top;
        int retValue = destroy.data;
        top = top.next;
        destroy = null; // clear to let GC do it's work
        size--;
        return retValue;
    }

    /**
     * Get element at top
     *
     * @return element at top
     */
    public int peek() {
        if (size == 0) {
            throw new NoSuchElementException("stack is empty");
        }
        return top.data;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        Node cur = top;
        for (int i = 1; i <= size; ++i) {
            builder.append(cur.data).append(", ");
            cur = cur.next;
        }
        builder.replace(builder.length() - 2, builder.length(), "]");
        return builder.toString();
    }

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this(data, null);
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    /* Driver Code */
    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        assert stack.isEmpty();
        stack.push(1);
        assert stack.peek() == 1;
        stack.push(2);
        assert stack.size == 2;
        System.out.println(stack); /* [2, 1] */
        assert stack.pop() == 2;
        assert stack.pop() == 1;
        assert stack.isEmpty();
    }
}
