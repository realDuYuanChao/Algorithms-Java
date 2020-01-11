package sorting;

public class ShellSort {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        shellSort(array);
        for (int i = 0, len = array.length; i < len; ++i) {
            assert array[i] == i + 1;
        }
    }

    /**
     * Shell sort algorithm implements
     *
     * @param array the array to be sorted
     */
    public static void shellSort(int[] array) {
        for (int len = array.length, gap = len / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < len; ++i) {
                int insertValue = array[i];
                int j = i;
                while (j >= gap && insertValue < array[j - gap]) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = insertValue;
            }
        }
    }
}
