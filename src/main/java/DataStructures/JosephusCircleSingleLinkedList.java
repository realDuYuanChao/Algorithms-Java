package DataStructures;

public class JosephusCircleSingleLinkedList {

    public static void main(String[] args) {
        assert josephus(10, 5) == 3; /* the sort people was killed: 5 10 6 2 8 1 4 7 */
        assert josephus(5, 5) == 2; /* the sort people was killed: 5 1 3	4 */
    }

    /**
     * @param n the number of people
     * @param k number to be skipped
     * @return the position of people wasn't killed
     */
    public static int josephus(int n, int k) {
        CircleSingleLinkedList circleSingleLinkedList = new CircleSingleLinkedList();
        for (int i = 1; i <= n; i++) {
            circleSingleLinkedList.insert(i);
        }

        int count = 0;
        for (int i = 0; circleSingleLinkedList.size() != 1; i = ++i % circleSingleLinkedList.size()) {
            if (++count == k) {
                circleSingleLinkedList.delete(i);
                count = 0;
                i--;
            }
        }
        return circleSingleLinkedList.get(0);
    }
}
