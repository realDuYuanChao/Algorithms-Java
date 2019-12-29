package DataStructures;

public class SortedBinaryTree {

    static class Node {
        int data;
        Node leftChild;
        Node rightChild;

        private Node(int data) {
            this(data, null, null);
        }

        private Node(int data, Node leftChild, Node rightChild) {
            this.data = data;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }
    }

    /**
     * Create root node of binary tree
     *
     * @param value the value
     * @return root node
     */
    public static Node createTree(int value) {
        return new Node(value);
    }

    /**
     * Insert node to binary tree always sorted
     *
     * @param root  the root of tree
     * @param value the value to insert
     * @return {@code true} if successfully, otherwise {@code false}
     */
    public static boolean insert(Node root, int value) {
        if (value < root.data) {
            if (root.leftChild == null) {
                root.leftChild = new Node(value);
                return true;
            } else {
                return insert(root.leftChild, value);
            }
        } else if (value > root.data) {
            if (root.rightChild == null) {
                root.rightChild = new Node(value);
                return true;
            } else {
                return insert(root.rightChild, value);
            }
        } else {
            return false;
        }
    }

    /**
     * InOrder travel of binary tree
     *
     * @param root the root of tree
     */
    public static void inOrder(Node root) {
        if (root != null) {
            inOrder(root.leftChild);
            System.out.print(root.data + " ");
            inOrder(root.rightChild);
        }
    }

    /* Driver Code */
    public static void main(String[] args) {
        int[] values = new int[]{8, 3, 10, 1, 6, 14, 4, 7, 13};
        Node root = createTree(values[0]);
        for (int i = 1; i < values.length; i++) {
            insert(root, values[i]);
        }
        inOrder(root);
    }
}
