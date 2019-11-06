package matrix;

import java.util.Arrays;

public class MatrixTranspose {
    public static void main(String[] args) {
        assert Arrays.deepToString(new int[][]{{1, 2, 3}, {4, 5, 6}})
                .equals(Arrays.deepToString(transpose(new int[][]{{1, 4}, {2, 5}, {3, 6}})));
    }

    /**
     * Matrix transpose
     *
     * @param matrix the matrix
     * @return the matrix after transposing
     */
    public static int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}
