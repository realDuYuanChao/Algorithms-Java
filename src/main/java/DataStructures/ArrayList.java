package DataStructures;

import java.util.Arrays;

public class ArrayList {

    /* the array contains elements */
    int[] items;

    /* default capacity */
    private static final int DEFAULT_CAPACITY = 10;

    /* the capacity of array list */
    private int capacity;

    /* size of array list */
    private int size;

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayList(int capacity) {
        this.items = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    /**
     * Return size of array list
     *
     * @return size of array list
     */
    public int size() {
        return size;
    }

    /**
     * Check if array list is empty or not
     *
     * @return <tt>true</tt> if is empty, otherwise <tt>false</tt>
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Clear array list
     */
    public void clear() {
        this.size = 0;
    }

    /**
     * Add element at the end of array list
     *
     * @param element the element to be added
     * @return <tt>true</tt> if add successfully
     */
    public boolean add(int element) {
        return add(size, element);
    }

    /**
     * Add element at specified index
     *
     * @param index   the index to add
     * @param element the element to add
     * @return {@code true} if add successfully
     * @throws IndexOutOfBoundsException if {@code index} is invalid
     */
    public boolean add(int index, int element) {
        increase();
        checkBoundsForAdd(index);

        /* shift all element forward */
        for (int i = size - 1; i >= index; --i) {
            items[i + 1] = items[i];
        }
        items[index] = element; /* begin add */
        size++;
        return true;
    }

    public void increase() {
        if (size == capacity) {
            capacity = (int) (capacity * 1.5);
            int[] newItems = new int[capacity];
            System.arraycopy(items, 0, newItems, 0, size);
            items = newItems;
        }
    }

    /**
     * Remove last element at array
     *
     * @return the last element at array
     */
    public int remove() {
        return remove(size - 1);
    }

    /**
     * Remove element at specified index
     *
     * @param index the index of the element to be removed
     * @return removed element
     * @throws IndexOutOfBoundsException if {@code is invalid} or array is empty
     */
    public int remove(int index) {
        checkBoundForRemove(index);

        int removed = items[index];
        for (int i = index; i < size; ++i) {
            items[i] = items[i + 1]; /* shift all backward */
        }
        size--;
        return removed;
    }

    /**
     * Remove all elements of array
     */
    public void removeAll() {
        size = 0;
    }

    /**
     * Check bounds for add operation
     *
     * @param index to be checked for adding
     */
    private void checkBoundsForAdd(int index) {
        if (index > size || index < 0) {
            errorMessage(index);
        }
    }

    /**
     * Check bounds for remove
     *
     * @param index to be checked for removing
     */
    private void checkBoundForRemove(int index) {
        if (index > size - 1 || index < 0) {
            errorMessage(index);
        }
    }

    private void errorMessage(int index) {
        throw new IndexOutOfBoundsException("invalid index: " + index + " size: " + size);
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < size; ++i) {
            builder.append(items[i]).append(", ");
        }
        return builder.replace(builder.length() - 2, builder.length(), "]").toString();
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i = 1; i <= 5; ++i) {
            list.add(i);
        }

        assert list.toString().equals("[1, 2, 3, 4, 5]");
        assert list.remove() == 5;
        assert list.remove(1) == 2;
        assert list.toString().equals("[1, 3, 4]");

        list.clear();
        assert list.toString().equals("[]");
    }
}
