package string;

import java.util.Arrays;

public class CopyString {
    public static void main(String[] args) {
        char[] origin = {'h', 'e', 'l', 'l', 'o'};
        char[] dist = new char[origin.length];
        copy(origin, dist);
        assert Arrays.toString(origin).equals(Arrays.toString(dist));
    }

    /**
     * Copies an array from the specified source array to destination array
     *
     * @param src  the source array.
     * @param dest the destination array.
     */
    public static void copy(char[] src, char[] dest) {
        for (int i = 0; i < src.length; ++i) {
            dest[i] = src[i];
        }
    }
}
