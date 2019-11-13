package matrix;

import java.util.Arrays;

public class SortMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {7, 5, 3},
                {1, 9, 8},
                {4, 6, 2}
        };
        sort(matrix);
        assert Arrays.deepToString(matrix).equals("[[1, 2, 3], [4, 5, 6], [7, 8, 9]]");
    }

    public static void sort(int[][] matrix) {
        int[] temp = new int[matrix.length * matrix[0].length];
        int count = 0;
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                temp[count++] = matrix[i][j];
            }
        }

        Arrays.sort(temp);
        for (int i = matrix.length - 1; i >= 0; --i) {
            for (int j = matrix[i].length - 1; j >= 0; --j) {
                matrix[i][j] = temp[--count];
            }
        }
    }
}
