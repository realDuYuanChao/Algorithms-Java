package DataStructures;

public class SingleLinkedList {

    private static class Node {
        private int data; /* store data */
        private Node next; /* the pointer of next elem */

        private Node() {

        }

        private Node(int data) {
            this(data, null);
        }

        private Node(int data, Node node) {
            this.data = data;
            this.next = node;
        }
    }

    private Node head; /* the header of LinkedList */

    private int size; /* the current size */

    public SingleLinkedList() {
        head = new Node();
        head.next = null;
        size = 0;
    }

    public SingleLinkedList(Node head, int size) {
        this.head = head;
        this.size = size;
    }

    /**
     * get list size
     *
     * @return {@code size} of list
     */
    public int size() {
        return size;
    }

    /**
     * check out whether list is empty or not
     *
     * @return {@code true} if {@code size} equals zero, otherwise {@code false}
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * insert end of list
     *
     * @param data insert value
     */
    public void insert(int data) {
        insert(size, data);
    }

    /**
     * insert front of list
     *
     * @param data insert value
     */
    public void insertFront(int data) {
        insert(0, data);
    }

    /**
     * insert value at pointed position
     *
     * @param position insert position
     * @param data     insert value
     * @throws IndexOutOfBoundsException if {@code position} is invalid
     */
    public void insert(int position, int data) {
        checkBounds(position, 0, size);
        Node cur = head;
        for (int i = 0; i < position; ++i) {
            cur = cur.next;
        }

        Node newNode = new Node(data);
        newNode.next = cur.next;
        cur.next = newNode;

        size++;
    }

    /**
     * Insert element to list, always sorted
     *
     * @param data to be inserted
     */
    public void insertSorted(int data) {
        Node cur = head;
        while (cur.next != null && data > cur.next.data) {
            cur = cur.next;
        }

        Node newNode = new Node(data);
        newNode.next = cur.next;
        cur.next = newNode;
        size++;
    }

    /**
     * delete last node
     */
    public void delete() {
        delete(size - 1);
    }

    /**
     * delete first node
     */
    public void deleteFront() {
        delete(0);
    }

    /**
     * delete node at pointed position
     *
     * @param position delete position
     * @throws IndexOutOfBoundsException if {@code position} is invalid
     */
    public void delete(int position) {
        checkBounds(position, 0, size - 1);
        Node cur = head;
        for (int i = 0; i < position; ++i) {
            cur = cur.next;
        }
        Node destroy = cur.next;
        cur.next = cur.next.next;
        destroy = null; /* let gc clear */

        size--;
    }

    /**
     * Merge two sorted SingleLinkedList
     *
     * @param listA the first sorted list
     * @param listB the second sored list
     * @return merged sorted list
     */
    public static SingleLinkedList merge(SingleLinkedList listA, SingleLinkedList listB) {
        Node headA = listA.head.next;
        Node headB = listB.head.next;

        int size = listA.size() + listB.size();

        Node head = new Node();
        Node tail = head;
        while (headA != null && headB != null) {
            if (headA.data <= headB.data) {
                tail.next = headA;
                headA = headA.next;
            } else {
                tail.next = headB;
                headB = headB.next;
            }
            tail = tail.next;
        }
        if (headA == null) {
            tail.next = headB;
        }
        if (headB == null) {
            tail.next = headA;
        }
        return new SingleLinkedList(head, size);
    }

    /**
     * Reverse SingleLinkedList
     *
     * @param list the list to reverse
     * @return the list after reversed
     */
    public static SingleLinkedList reverse(SingleLinkedList list) {
        Node head = list.head;
        int size = list.size;

        Node prev = null;
        Node current = head.next;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head.next = prev;
        return new SingleLinkedList(head, size);
    }

    /**
     * clear all node in list
     */
    public void clear() {
        Node prev = head.next;
        Node cur = head.next.next;
        while (cur != null) {
            prev = null; /* clear to let gc do work */
            prev = cur;
            cur = cur.next;
        }
        head.next = null;
        size = 0;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        Node cur = head.next;
        while (cur != null) {
            builder.append(cur.data).append("->");
            cur = cur.next;
        }
        return builder.replace(builder.length() - 2, builder.length(), "").toString();
    }

    public void checkBounds(int position, int low, int high) {
        if (position > high || position < low) {
            throw new IndexOutOfBoundsException(position + "");
        }
    }

    /* Driver */
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.insertFront(0); /* 0 */
        list.insert(1); /* 0 1 */
        list.insert(2); /* 0 1 2 */
        list.insertFront(-1); /* -1 0 1 2 */
        System.out.println(list);

        System.out.println("----------------");

        list.deleteFront(); /* 0 1 2 */
        list.delete(); /* 0 1 */
        list.delete(0); /* 1 */
        System.out.println(list);

        list.clear();
        assert list.isEmpty();
        System.out.println(list);

        /* Test MergeTwoSortedLinkedList */
        SingleLinkedList listA = new SingleLinkedList();
        SingleLinkedList listB = new SingleLinkedList();

        for (int i = 10; i >= 2; i -= 2) {
            listA.insertSorted(i);
            listB.insertSorted(i - 1);
        }

        System.out.println(listA); /* 2->4->6->8->10 */
        System.out.println(listB); /* 1->3->5->7->9 */
        System.out.println(SingleLinkedList.merge(listA, listB));

        /* Test reverse LinkedList */
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        assert "".equals(SingleLinkedList.reverse(singleLinkedList).toString());

        singleLinkedList.insert(1);
        assert "1".equals(SingleLinkedList.reverse(singleLinkedList).toString());

        singleLinkedList.clear();
        for (int i = 1; i <= 5; ++i) {
            singleLinkedList.insert(i);
        }
        assert "5->4->3->2->1".equals(SingleLinkedList.reverse(singleLinkedList).toString());
    }
}
