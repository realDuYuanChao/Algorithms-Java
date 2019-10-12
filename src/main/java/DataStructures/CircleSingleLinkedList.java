package DataStructures;

public class CircleSingleLinkedList {

    /* header node */
    private Node head;

    /* the tail node of list */
    private Node tail;

    /* size of list */
    private int size;

    public CircleSingleLinkedList() {
        head = new Node();
        size = 0;
    }

    /**
     * insert at end
     *
     * @param data insert data
     */
    public void insert(int data) {
        insert(size, data);
    }

    /**
     * insert at front
     *
     * @param data insert data
     */
    public void insertFront(int data) {
        insert(0, data);
    }

    /**
     * insert at index
     *
     * @param index insert index
     * @param data  insert data
     */
    public void insert(int index, int data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(index + "");
        }
        Node cur = head;
        for (int i = 0; i < index; ++i) {
            cur = cur.next;
        }

        Node newNode = new Node(data);
        if (index == size) {
            cur.next = newNode;
            newNode.next = head.next;
            tail = newNode;
        } else {
            newNode.next = cur.next;
            cur.next = newNode;
        }
        size++;

    }

    /**
     * delete node at end
     */
    public void delete() {
        delete(size - 1);
    }

    /**
     * delete node at front
     */
    public void deleteFront() {
        delete(0);
    }

    /**
     * delete node at index
     *
     * @param index the index
     * @throws IndexOutOfBoundsException if {@code index} is invalid
     */
    public void delete(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("" + index);
        }

        Node cur = head;
        for (int i = 0; i < index; ++i) {
            cur = cur.next;
        }

        Node destroy = cur.next;
        cur.next = cur.next.next;
        destroy = null; /* clear to let gc do work */

        if (index == 0) {
            tail.next = head.next;
        } else if (index == size - 1) {
            tail = cur;
        }
        size--;
    }

    /**
     * get size of list
     *
     * @return {@code size} of list
     */
    public int size() {
        return size;
    }

    /**
     * Check if list is empty
     *
     * @return {@code true} if {@code size} equals zero,otherwise {@code false}
     */
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node cur = head;
        for (int i = 1; i <= size; ++i) {
            cur = cur.next;
            builder.append(cur.data).append("->");
        }
        return builder
                .replace(builder.length() - 2, builder.length(), "")
                .toString();
    }

    public void circleTravel() {

        int count = 0;
        Node cur = head.next;
        while (cur != null) {
            System.out.print(cur.data + "->");
            cur = cur.next;
            if (++count == 10) {
                break;
            }
        }
    }

    private static class Node {
        private int data;
        private Node next;

        Node() {
            this(0);
        }

        Node(int data) {
            this(data, null);
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        CircleSingleLinkedList list = new CircleSingleLinkedList();
        assert list.isEmpty();

        list.insert(1);
        assert list.size() == 1;
        list.insert(2);
        list.insert(3);
        System.out.println(list);
        list.delete(0);
        System.out.println(list);
    }
}
