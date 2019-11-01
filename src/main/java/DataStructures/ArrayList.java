package DataStructures;

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
        return add(0, element);
    }

    public boolean add(int index, int element) {
        checkBoundsForAdd(index);

        /* shift all element forward */
        for (int i = size - 1; i >= index; --i) {
            items[i + 1] = items[i];
        }
        items[index] = element; /* begin add */
        size++;
        return true;
    }

    /**
     * Check bounds for add operation
     *
     * @param index to be checked
     */
    private void checkBoundsForAdd(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("invalid index:" + index + "for add");
        }
    }


    public static void main(String[] args) {
        
    }
}
