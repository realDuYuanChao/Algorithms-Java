package arrays;

public class PrintArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};

        printArray(array);
        System.out.println("Print array using recursion");
        printArray(array, 0);
    }

    /**
     * Print elements of array
     *
     * @param array contains elements
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * Print elements of array using recursion
     *
     * @param array contains elements
     * @param index the index of array
     */
    public static void printArray(int[] array, int index) {
        if (index != array.length) {
            System.out.println(array[index]);
            printArray(array, index + 1);
        }
    }
}
